package br.com.xti.logica;

public class Variavel {
	
	public static void main(String[] args){
		
		//String nome = "Renato";
		//int idade = 28;
		//double preco = 12.45;
		//char sexo = 'M';
		//boolean solteiro = true;
		
		Double preco = new Double("12.45");
		double d = preco.doubleValue();
		System.out.println(d);
		
		int i = preco.intValue();
		System.out.println(i);
		float f = preco.floatValue();
		System.out.println(f);
		byte b = preco.byteValue();
		System.out.println(b);
		
		Boolean solteiro = new Boolean("true");
		System.out.println(solteiro);
		
		double d1 = Double.parseDouble("123.45");
		System.out.println(d1);
		int i1 = Integer.parseInt("123");
		System.out.println(i1);
		float f1 = Float.parseFloat("3.14F");
		System.out.println(f1);
		
		int i2 = Integer.valueOf("101011", 2);
		System.out.println(i2);
		
		
		
		int x = 7;
		x = 9;
		System.out.println("x = " + x);
		
		
		String nome = "Renato";
		nome = "Renato Nobrega da Silva";
		nome = null;
		System.out.println(nome);
		
		@SuppressWarnings("unused")
		int populacaoBrasileira = 203429773;
		populacaoBrasileira = 123;
		
		final double PI = 3.14159265358979323846;
		final char SEXO_MASCULINO = 'M';
		final char SEXO_FEMININO = 'F';
		
		System.out.println(PI);
		System.out.println(SEXO_MASCULINO);
		System.out.println(SEXO_FEMININO);
		
		System.out.println(nome);
		//System.out.println(idade);
		System.out.println(preco);
		//System.out.println(sexo);
		
		//byte b = 127;
		short s = 32767;
		//int i = 2_147_483_647;
		@SuppressWarnings("unused")
		long l = 9_000_000_000_000_000_000L;
		//double d = 1.7976931348623157E+308;
		//float f = 123F;
		
		s = b; //cast implicito
		System.out.println(s);
		
		b = (byte)s; //cast explicito
		System.out.println(b);
		
		i = (int)d; //cast explicito
		System.out.println(i);
		
		d = i; //cast implicito
		System.out.println(d);
		
		
		
		
		
	}
}