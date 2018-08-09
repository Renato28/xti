package br.com.xti.threads;

public class Cestafrutas implements Runnable {

	@Override
	public void run() {
		
		//criacao da lista de frutas
		
		String[] ingredientes = {"Banana" , "Mamão" , "Maçã" , "Abacate"};
		
		System.out.println("Inicio do run()");
		
		//impressao da lista de frutas
		
		for (String fruta : ingredientes) {
			
			System.out.println(fruta);
			
			//dormindo por 3 segundos
			
			try {
				
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
