package br.com.xti.colecao;

import java.util.Random;

public class ArraySimples {

	public static void main(String[] args) {
		
		String[] faces = {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Reis"};
		String[] nipes = {"Espada","Paus","Copas","Ouros"};
		
		Random r = new Random();
		
		String face = faces[r.nextInt(faces.length)];
		String nipe = nipes[r.nextInt(nipes.length)];
		
		String carta = face + " de " + nipe;
		System.out.println(carta);
	}

}
