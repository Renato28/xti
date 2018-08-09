package br.com.xti.refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class Reflexao {

	public static void main(String[] args) throws Exception {
		
		String nome = "br.com.xti.poo.Conta";
		@SuppressWarnings("rawtypes")
		Class classe = Class.forName(nome);
		System.out.println(classe.getSimpleName());
		
		Field[] f = classe.getFields();
		for (Field field : f) {
			System.out.println(field);
		}
		
		Method[] m = classe.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method);
		}
		
		@SuppressWarnings("rawtypes")
		Constructor[] c = classe.getConstructors();
		
		for (@SuppressWarnings("rawtypes") Constructor constructor : c) {
			System.out.println(constructor);
		}
		
		Object o =  classe.newInstance();
		@SuppressWarnings("unchecked")
		Method md = classe.getMethod("depositar", double.class);
		@SuppressWarnings("unchecked")
		Method me = classe.getMethod("exibirSaldo");
		md.invoke(o, 120);
		me.invoke(o);
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Constructor co = classe.getConstructor(String.class , double.class);
		Object obj = co.newInstance("Ricardo" , 123_456_789);
		me.invoke(obj);
	}

}
