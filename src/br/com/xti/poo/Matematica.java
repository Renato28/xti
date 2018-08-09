package br.com.xti.poo;

public class Matematica {
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois numeros
	 */
	public int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}
	
	double soma(String titulo , double ... numeros){
		System.out.println(titulo);
		double total = 0;
		for (double n : numeros) {
			total += n;
		}
		return total;
	}
	
	public double soma(double um, double dois){
		double s = um + dois;
		return s;
	}
	/**
	 * 
	 * @return a raiz quadrada no numero segundo equacao de pell
	 */
	public int raiz(int numero){
		int raiz = 0, impar = 1;
			while(numero >= impar){
				numero -= impar;
				impar += 2;
				++raiz;
			}
			return raiz;
		}
	
	double media(int x , int y){
		System.out.println("media(x + y) / 2");
		return (x + y) / 2;
	}
	
	}
