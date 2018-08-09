package br.com.xti.java;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		boolean sobrenome = "Nobrega".matches("(?i)nobrega");
		System.out.println("Retorno = " + sobrenome);
		
		boolean email = "@".matches(".");
		System.out.println("Qualquer caractere: " + email);
		
		boolean numero = "a".matches("\\d");
		System.out.println("Possui numero?: " + numero);
		
		numero = "2".matches("\\d");
		System.out.println("Possui numero?: " + numero);
		
		boolean letrasNumeros = "A2".matches("\\w\\d");
		System.out.println("Possui letras e numeros? " + letrasNumeros);
		
		boolean espaco = " ".matches("\\s");
		System.out.println("Possui espaço? " + espaco);
		
		//procura a ocorrencia de um caractere
		boolean caractere = "E".matches(".");
		System.out.println(caractere);
		
		//procura a ocorrencia de dois caracteres
		caractere = "Ab".matches("..");
		System.out.println(caractere);
		
		//valida cep
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		boolean valida = "58083-632".matches(cep);
		System.out.println(valida);
		
	}

}
