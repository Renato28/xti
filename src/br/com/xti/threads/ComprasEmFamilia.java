package br.com.xti.threads;

public class ComprasEmFamilia implements Runnable {

	ContaConjunta conta = new ContaConjunta();

	public static void main(String[] args) {

		ComprasEmFamilia IrAsCompras = new ComprasEmFamilia();

		new Thread(IrAsCompras, "Renato").start();
		new Thread(IrAsCompras, "Eliane").start();
		new Thread(IrAsCompras, "Denise").start();
		new Thread(IrAsCompras, "Marcos").start();
		new Thread(IrAsCompras, "Angela").start();

	}

	@Override
	public void run() {
		
		String cliente = Thread.currentThread().getName();
		conta.sacar(20, cliente);
		if(conta.getSaldo() < 0){
			
			System.out.println("Estorou!");
		}
	}
}
