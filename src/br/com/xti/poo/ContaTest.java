package br.com.xti.poo;

public class ContaTest {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Renato";
		conta.saldo = 10_000.00;
		conta.exibeSaldo();
		
//		conta.saca(1000);
//		conta.exibeSaldo();
//		
//		conta.deposita(6000);
//		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Marcos";
		destino.saldo = 8_000.00;
		destino.exibeSaldo();
		
		conta.transferePara(destino, 1550.00);
		conta.exibeSaldo();
		destino.exibeSaldo();
	}

}
