package br.com.xti.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		fila.add("Bruno");
		fila.add("Diogo");
		fila.add("Alison");
		System.out.println(fila);
		
		System.out.println(fila.peek());
		System.out.println(fila.poll()); //remove o elemento da fila
		System.out.println(fila);
		
		/*OUTROS ELEMENTOS DISPONIVEIS EM LINKEDIST*/
		
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Neymar");
		f.addLast("Marcos");
		System.out.println(f);
		
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
		
		System.out.println(f.pollFirst());
		System.out.println(f.pollLast());
		System.out.println(f);
	}

}
