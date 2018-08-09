package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCRUD {

	public void transferir(Connection con, Conta origem, Conta destino,
			double valor) throws SQLException {

		if (origem.saldo >= valor) {

			try {
				con.setAutoCommit(false);

				// SAQUE
				origem.saldo -= valor;
				alterar(con, origem);
				// DEPOSITO
				destino.saldo += valor;
				alterar(con, destino);
				con.commit();

			} catch (Exception e) {
				
				con.rollback();
			}
		}
	}

	public void criar(Connection con, Conta conta) throws SQLException {
		String sql = "insert into conta values (?,?,?)";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, conta.numero);
			stm.setString(2, conta.cliente);
			stm.setDouble(3, conta.saldo);
			stm.executeUpdate();

		}

	}

	public void alterar(Connection con, Conta conta) throws SQLException {
		String sql = "update conta set cliente=?, saldo=? where numero=?";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setString(1, conta.cliente);
			stm.setDouble(2, conta.saldo);
			stm.setInt(3, conta.numero);
			stm.executeUpdate();

		}

	}

	public void excluir(Connection con, Conta conta) throws SQLException {
		String sql = "delete from conta where numero=?";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, conta.numero);
			stm.executeUpdate();

		}

	}

	public List<Conta> ler(Connection con) throws SQLException {
		List<Conta> lista = new ArrayList<Conta>();
		String sql = "select numero,cliente,saldo from conta";
		try (PreparedStatement stm = con.prepareStatement(sql);
				ResultSet rs = stm.executeQuery()) {
			while (rs.next()) {
				lista.add(new Conta(rs.getInt(1), rs.getString(2), rs
						.getDouble(3)));
			}
		}
		return lista;
	}

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try (Connection con = DriverManager.getConnection(url, "renato",
				"renato123")) {
			ContaCRUD crud = new ContaCRUD();

//			Conta conta1 = new Conta(1, "Renato", 1500.00);
//			conta1.saldo = 1500.00;
//			crud.alterar(con, conta1);
//			Conta conta2 = new Conta(2, "Marcos", 2000.00);
//			conta2.saldo = 2000.00;
//			crud.alterar(con, conta2);
			
//			crud.criar(con, conta1);
//			crud.criar(con, conta2);

			List<Conta> contas = crud.ler(con);
			for (Conta conta : contas) {
				System.out.println(conta);
			}
			
			Conta origem = contas.get(0);
			Conta destino = contas.get(1);
			crud.transferir(con, origem, destino, 500);
			
			contas = crud.ler(con);
			for (Conta conta : contas) {
				System.out.println(conta);
			}
		}
	}
}
