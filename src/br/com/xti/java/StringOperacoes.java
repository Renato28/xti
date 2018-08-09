package br.com.xti.java;

public class StringOperacoes {

	public static void main(String[] args) {
		
		String s1 = " Renato";
		String s2 = s1 + " Nobrega";
		//System.out.println(s2);
		String s3 = new String(" Silva");
		//System.out.println(s3);
		String s4 = s1 + s2 + s3;
		System.out.println(s4);
		char[] array = {'J' , 'a' , 'v' , 'a'};
		String s5 = new String(array);
		System.out.println(array.length);
		System.out.println(s5);
		
		//OPERACOES
		
		int tamanho = s1.length();
		System.out.println(tamanho);
		char letra = s1.charAt(0);
		System.out.println(letra);
		String texto = s1.toString();
		System.out.println(texto);
		
		//LOCALIZACAO
		
		int posicao = s1.indexOf("Nobrega");
		System.out.println(posicao);
		boolean vazia = s3.isEmpty();
		System.out.println(vazia);
		
		//COMPARACAO
		
		String xti = "XTI";
		boolean comparacao = xti.equals("xti");
		System.out.println(comparacao);
		boolean comparacao2 = xti.equalsIgnoreCase("xti");
		System.out.println(comparacao2);
		
		boolean x = xti.startsWith("TI");
		System.out.println(x);
		boolean y = xti.endsWith("XT");
		System.out.println(y);
		
		String so = "Olhe Olhe";
		so.regionMatches(true, 6, "olhe", 0 , 4);
		System.out.println(so);
		
		String l = "O brasil é lindo";
		String sl = l.substring(11);
		System.out.println(sl);
		sl = l.substring(2, 8);
		System.out.println(sl);
		sl = l.concat(" que maravilha");
		System.out.println(sl);
		sl = l.replace('s', 'z');
		System.out.println(sl);
		sl = l.replaceFirst(" ", "X");
		System.out.println(sl);
		sl = l.replaceAll(" ", "X");
		System.out.println(sl);
		sl = l.toUpperCase();
		System.out.println(sl);
		sl = l.toLowerCase();
		System.out.println(sl);
		
		System.out.println("  espacos  ".trim());
		
		
		

	}

}
