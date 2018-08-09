package br.com.xti.threads;

public class Main {

	public static void main(String[] args) {
		
		BarradeProgresso bp = new BarradeProgresso();
		GeradordeRelatorios gr = new GeradordeRelatorios();
		
		Thread threadGerarRelatorio = new Thread(gr);
		
		threadGerarRelatorio.start();
		
		Thread barradeprogresso = new Thread(bp);
		
		barradeprogresso.start();
		
		System.out.println("Fim do Main");
	}

}
