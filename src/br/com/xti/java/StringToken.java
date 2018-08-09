package br.com.xti.java;

public class StringToken {

	public static void main(String[] args) {
		
		String s = "HTML; CSS; JavaScript; Jquery; Java";
		s = "Renato Nobrega da Silva";
		String[] tokens = s.split(" ");
		System.out.println(tokens.length + " tokens");
		for (String token : tokens) {
			System.out.println(token);
		}

	}

}
