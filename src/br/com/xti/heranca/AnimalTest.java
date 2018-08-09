package br.com.xti.heranca;

public class AnimalTest {

	public static void main(String[] args) {

		Cachorro toto = new Cachorro();
		toto.comida = "carne";
		toto.dormir();
		
		Galinha carijo = new Galinha();
		carijo.comida = "milho";
		carijo.dormir();
		
		System.out.println(toto instanceof Animal);
		System.out.println(toto instanceof Cachorro);
		
		System.out.println(toto.getClass());
		System.out.println(toto.hashCode());
		System.out.println(toto.toString());
		System.out.println(toto.equals(carijo));
	}

}
