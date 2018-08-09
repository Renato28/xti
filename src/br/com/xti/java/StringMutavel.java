package br.com.xti.java;

public class StringMutavel {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer();
		StringBuilder s2 = new StringBuilder("Renato");
		s1.length();
		System.out.println(s1);
		
		System.out.println(s2.length());
		System.out.println(s2.capacity());
		System.out.println(s2.toString());
		//System.out.println(s2.reverse());
		
		s2.append(" Programador de ");
		System.out.println(s2);
		
		char[] c = { 'J' , 'a' , 'v' , 'a'};
		s2.append(c).append(" Intermediario");
		System.out.println(s2);
		
		//String s3 = " Eu " + " gosto " + " de " + " programar " + " em " + " java! ";
		String sb = new StringBuilder(" Eu ").append(" gosto ").append(" de ").append(" programar ").append(" em ").append(" java ").toString();
		System.out.println(sb);
		
		//s2.append(" Nobrega");
		
		//System.out.println(s2);
		
		double numero = Math.pow(4, 2);
		System.out.println(numero);
		
		double expressao = 4 + 6 / 2 - (10 * Math.pow(3, 2) * (5 - 4)) * 3;
		System.out.println(expressao);
		
		boolean expressaologica = 4 % 3 + 1 <= 5 * 4 / 2;
		System.out.println(expressaologica);
		
		@SuppressWarnings("unused")
		boolean expressaologica1 = (5 > 10) || (5 * 2 > 10) && 3 != 2 + 2; 
		System.out.println(expressaologica1);
		

	}

}
