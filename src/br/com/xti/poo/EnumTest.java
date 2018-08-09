package br.com.xti.poo;

public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println(PecasXadrez.BISPO);
		System.out.println(PecasXadrez.CAVALO);
		System.out.println(PecasXadrez.PEAO);
		System.out.println(PecasXadrez.RAINHA);
		System.out.println(PecasXadrez.REI);
		System.out.println(PecasXadrez.TORRE);
		
		System.out.println(Medida.MM.titulo);
		System.out.println(Medida.CM.titulo);
		System.out.println(Medida.M.titulo);
		
		for(Medida m : Medida.values()){
			System.out.println(m + " : " + m.titulo);
		}
	}
}
