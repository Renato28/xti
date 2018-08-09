package br.com.xti.threads;

public class PingPongRunnable implements Runnable{
	
	String palavra;
	long tempo;
	
	public PingPongRunnable(String palavra , long tempo) {
		
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run(){
		
		for(int i = 0; i < 100; i++){
			
			System.out.print(palavra + " ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		Runnable ping = new PingPongRunnable("ping", 1500);
		Runnable pong = new PingPongRunnable("PONG", 2000);
		
		new Thread(ping, "ping").start();
		new Thread(pong, "PONG").start();
		System.out.println("Ver Thread");
		
	}
}
