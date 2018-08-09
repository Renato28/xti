package br.com.xti.threads;

public class PostTest {

	public static void main(String[] args) {
		
		Ponte ponte  = new PonteSincronizada();
		new Thread(new Produtora(ponte)).start();
		new Thread(new Consumidora(ponte)).start();
	}

}
