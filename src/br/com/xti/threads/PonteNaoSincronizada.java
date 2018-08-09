package br.com.xti.threads;

public class PonteNaoSincronizada implements Ponte{
	
	private int valor = -1;

	@Override
	public void set(int valor) throws InterruptedException {
		System.out.println("Produziu " + valor);
		this.valor = valor;
		
	}

	@Override
	public int get() throws InterruptedException {
		System.out.println("Consumiu " + valor);
		return valor;
	}

}
