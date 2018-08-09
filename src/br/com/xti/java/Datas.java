package br.com.xti.java;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		//01/01/1970
		
		System.out.println(System.currentTimeMillis());
		
		Date agora = new Date();
		System.out.println(agora);
		
		Date data = new Date(1_000_000_000_000_000L);
		System.out.println(data);
		
		data.getTime();
		data.setTime(1_000_000_000_000_000L);
		System.out.println(data.compareTo(agora));
		
		//GREGORIAN CALENDAR
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(2016, Calendar.SEPTEMBER, 14);
		System.out.println(calendario.getTime());
		
		System.out.println(calendario.get(Calendar.YEAR));
		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
		
		calendario.set(Calendar.YEAR, 2015);
		calendario.set(Calendar.MONTH, 05);
		calendario.set(Calendar.DAY_OF_MONTH, 20);
		System.out.println(calendario.getTime());
		
		calendario.clear(Calendar.MINUTE);
		calendario.clear(Calendar.SECOND);
		System.out.println(calendario.getTime());
		
		calendario.add(Calendar.YEAR, 1);
		calendario.add(Calendar.MONTH, 2);
		calendario.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println(calendario.getTime());
		
		calendario.roll(Calendar.DAY_OF_MONTH, 20);
		System.out.println(calendario.getTime());
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);

		if(hora < 12){
			
			System.out.println("Bom dia!");
			
		}else if(hora > 12 && hora < 18){
			
			System.out.println("Boa tarde!");
			
		}else{
			
			System.out.println("Boa noite!");
		}
		

	}

}
