package br.com.xti.logica;
import java.util.HashMap;
import java.util.Map;

public class TestarInterfaceMap {

	public static void main(String[] args) {
		Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
		mapaNomes.put(1, "Renato Nobrega");
		mapaNomes.put(2, "Bruno Nogueira");
		@SuppressWarnings("unused")
		String put = mapaNomes.put(3, "Rodrigo Souza");

		System.out.println(mapaNomes);

		System.out.println(mapaNomes.get(2));
	}
}