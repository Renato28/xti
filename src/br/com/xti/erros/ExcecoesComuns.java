package br.com.xti.erros;

import br.com.xti.heranca.Animal;
import br.com.xti.heranca.Cachorro;
import br.com.xti.heranca.Galinha;

public class ExcecoesComuns {
	
	static int[] arrayNull = new int[0];

	public static void main(String[] args) {
	
				//NullPointerException
				System.out.println(arrayNull.length);
				
				//ArithmeticException
				@SuppressWarnings("unused")
				int numero = 5 / 0;
				
				//ArrayIndexOutOfBoundsException
				System.out.println(arrayNull[1]);
				
				//ClassCastException
				Animal a = new Galinha();
				@SuppressWarnings("unused")
				Cachorro c = (Cachorro)a;

				//NumberFormatException
				@SuppressWarnings("unused")
				int inteiro = Integer.parseInt("XTI");
	}
}
