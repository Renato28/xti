package br.com.xti.threads;

public class TestFruta {

	public static void main(String[] args) {
		
		Cestafrutas cf = new Cestafrutas();
		
		Thread cestadefrutas = new Thread(cf);
		
		cestadefrutas.start();

	}

}
