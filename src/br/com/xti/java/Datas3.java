package br.com.xti.java;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {
		
		//INTERNACIONALIZACAO DE FORMATOS DE  DATAS EM VARIOS PAISES
		
		Calendar c = Calendar.getInstance();
		c.set(2016, Calendar.SEPTEMBER, 16);
		Date data = c.getTime();
		
		Locale brasil = new Locale("pt", "BR");
		Locale usa = Locale.US;
		Locale italia = Locale.ITALY;
		Locale franca = Locale.FRANCE;
		Locale canada = Locale.CANADA;
		Locale china = Locale.CHINA;
		Locale argentina = new Locale("es", "AR");
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println(df.format(data)); //brasil
		
		df = DateFormat.getDateInstance(DateFormat.FULL, usa);
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, italia);
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, franca);
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, argentina);
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, canada);
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, china);
		System.out.println(df.format(data));
		

	}

}
