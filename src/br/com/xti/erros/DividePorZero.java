package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		boolean continua = true;

		do {
			try {
				System.out.println("Numero: ");
				int numero = entrada.nextInt();

				System.out.println("Divisor: ");
				int divisor = entrada.nextInt();

				System.out.println(numero / divisor);
				continua = false;

			} catch (InputMismatchException e) {
				System.err.println("Error! numeros devem ser inteiros");
				entrada.nextLine();
			} catch (ArithmeticException e) {
				System.err.println("Error! divisor deve ser diferente de zero");
			} finally {
				System.out.println("Finally executado...");
			}
		} while (continua);
	}
}
