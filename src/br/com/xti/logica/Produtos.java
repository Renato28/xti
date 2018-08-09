package br.com.xti.logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {
		
		ArrayList<String> produtos = new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a lista de produtos ou digite FIM para sair");
		
		String produto;
		while(!("FIM").equals(produto = entrada.nextLine())){
			
			produtos.add(produto);
		}
		System.out.println(produtos.toString());

	}

}
