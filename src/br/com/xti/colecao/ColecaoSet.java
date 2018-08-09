package br.com.xti.colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		String[] cores = {"Amarelo" , "Azul" , "Verde" , "Branco" , "Azul" , "Amarelo" , "Verde"};
		
		List<String> list = Arrays.asList(cores);
		System.out.println(list);
		
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
		
		
		

	}

}
