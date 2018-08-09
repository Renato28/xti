package br.com.xti.colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {
		
		Map<String, String> paises = new HashMap<String, String>();
		paises.put("BR", "Brasil");
		paises.put("RU", "Rússia");
		paises.put("CN", "China");
		System.out.println(paises);

		System.out.println(paises.containsKey("ARG"));
		System.out.println(paises.containsValue("Chile"));
		System.out.println(paises.get("CN"));
		paises.remove("China");
		System.out.println(paises);
		
		Set<String> keys = paises.keySet();
		for (String key : keys) {
			System.out.println(key + " = " + paises.get(key));
		}
	}

}
