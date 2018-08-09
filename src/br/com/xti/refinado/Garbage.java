package br.com.xti.refinado;

import java.util.ArrayList;
import java.util.List;

public class Garbage {
	
	public static long carregarMemoria(){
		List<Integer> lista = new ArrayList<Integer>();
		for(int i = 0; i < 100_000; i++){
			lista.add(i);
		}
		return Runtime.getRuntime().freeMemory();
	}

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		int MB = 1_048_546; // total de bytes em 1MB
		double total = rt.maxMemory() / MB;
		
		double inicio = total - (carregarMemoria() / MB);
		
		rt.runFinalization();
		rt.gc();
		
		double fim = total - (rt.freeMemory() / MB);
		System.out.println("Inicio: " + inicio + " Fim: " + fim);
		
		//System.out.println(total);
		
	}

}
