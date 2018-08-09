package br.com.xti.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(String[] args) throws ParseException {
		
		Calendar c = Calendar.getInstance();
		c.set(2016, Calendar.SEPTEMBER, 15);
		Date data = c.getTime();
		
		//FORMATACAO DE DATA
		
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(data));
		
		//FORMATACAO DE HORA
		
		df = DateFormat.getTimeInstance();
		System.out.println(df.format(data));
		
		//ESTILOS DE DATA
		
		df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(data));
		
		//ESTILO DE HORA
		
		df = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println(df.format(data));
		
		
	}

}