package br.com.xti.erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero entre 0 e 10: ");
		int numero = entrada.nextInt();
		assert(numero >= 0 && numero <= 10) : "numero invalido";
		System.out.println("numero informado: " + numero);
	}

}
