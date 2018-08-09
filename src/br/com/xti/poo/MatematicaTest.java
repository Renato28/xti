package br.com.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		int ma = m.maior(10, 20);
		System.out.println(ma);
		
		double so = m.soma(10, 20);
		System.out.println(so);
		
		@SuppressWarnings("unused")
		int par = m.maior(2,4);
		@SuppressWarnings("unused")
		int impar = m.maior(3, 5);
		double som = m.soma(m.maior(2, 4), m.maior(3, 5));
		System.out.println(som);
		
		double subtracao = m.raiz(27);
		System.out.println(subtracao);
		int raiz = m.raiz(27);
		System.out.println(raiz);
		
		System.out.println(Math.sqrt(27));
		
		double total = m.soma("numeros" , 2,3,4,5,6,7,8,9);
		System.out.println(total);
	}
}