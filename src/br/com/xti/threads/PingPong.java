package br.com.xti.threads;

public class PingPong extends Thread{
	
	String palavra;
	long tempo;
	
	public PingPong(String palavra , long tempo) {
		
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run(){
		
		for(int i = 0; i < 5; i++){
			
			System.out.print(palavra + " ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		new PingPong("Ping", 1500).start();
		new PingPong("PONG", 2000).start();
		System.out.println("Ver Thread");
		
	}
}
