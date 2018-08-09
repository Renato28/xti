package br.com.xti.poo;

public class Conta {

	String cliente;
	double saldo;

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public Conta(String string, double d) {
		// TODO Auto-generated constructor stub
	}

	void exibeSaldo() {
		System.out.println(cliente + " seu saldo é:  " + saldo);
	}

	void saca(double valor) {
		saldo  -= valor;
	}
	
	void deposita(double valor){
		saldo += valor;
	}
	
	void transferePara(Conta destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void exibirSaldo() {
		// TODO Auto-generated method stub
		
	}

}
