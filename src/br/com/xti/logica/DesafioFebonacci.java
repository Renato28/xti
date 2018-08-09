package br.com.xti.logica;

public class DesafioFebonacci {

	public static void main(String[] args) {

		int anterior = 0;
		int proximo = 1;

		System.out.println(anterior);

		while (proximo < 50) {
			System.out.println(proximo);
			proximo = proximo + anterior;
			anterior = proximo - anterior;
			// 0,1,1,2,3,5,8,13,21,34
		}
	}
}