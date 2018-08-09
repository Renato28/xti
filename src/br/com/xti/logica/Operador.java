package br.com.xti.logica;
import java.util.Scanner;
public class Operador{
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o Raio: ");
		double raio = s.nextDouble();
		//Diametro : 2r
		//double raio = 10;
		double diametro = 2 * raio;
		System.out.println("Diametro = " + diametro);
		
		//Circunferencia 2 PI r
		double pi = Math.PI;
		double circuferencia = 2 * pi * raio;
		System.out.println("Circunferencia = " + circuferencia);
		
		//Area PI r2
		double area = pi * (raio * raio);
		System.out.println("Area = " + area);
		
		
		
	}
	
	
}