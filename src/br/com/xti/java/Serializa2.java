package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Serializa2 {

	public void adicionarContas(ArrayList<Conta> contas) throws IOException {

		try (FileOutputStream fos = new FileOutputStream(
				"C:/xti/files/contas.ser")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(contas);
				oos.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Conta> recuperarContas() throws IOException,
			ClassNotFoundException {

		try (FileInputStream fis = new FileInputStream(
				"C:/xti/files/contas.ser")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				return (ArrayList<Conta>) ois.readObject();
			}
		}

	}

	public static void main(String[] args) throws Exception {

		ArrayList<Conta> conta = new ArrayList<Conta>();

		conta.add(new Conta("Renato", 1500.00));
		conta.add(new Conta("Denise", 2500.00));
		conta.add(new Conta("Marcos", 1200.00));

		Serializa2 operacao = new Serializa2();
		operacao.adicionarContas(conta);
		ArrayList<Conta> contas2 = operacao.recuperarContas();

		for (Conta contas : contas2) {

			contas.exibirSaldo();
		}

	}

}
