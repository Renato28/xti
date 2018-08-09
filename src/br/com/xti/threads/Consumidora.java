package br.com.xti.threads;

import java.util.Random;

public class Consumidora implements Runnable {

	private Ponte ponte;

	public Consumidora(Ponte ponte) {

		this.ponte = ponte;
	}

	private Random random = new Random();

	@Override
	public void run() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(random.nextInt(3000));
				total += ponte.get();
				System.err.println("\t " + total);
			} catch (InterruptedException e) {
			}
		}

	}

}
