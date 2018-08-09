package br.com.xti.threads;

public class GeradordeRelatorios implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0; i < 50; i++){
			
			System.out.println("Linha: " +i);
		}
	}

}
