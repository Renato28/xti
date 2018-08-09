package br.com.xti.heranca;

public class InterfaceTest {
	
	public static void area(AreaCalculavel a){
		
		System.out.println(a.calcularArea());
	}
	
	public static void volume(VolumeCalculavel v){
		
		System.out.println(v.calcularVolume());
	}

	public static void main(String[] args) {

		area(new Quadrado(2));
		area(new Cubo(6));
		volume(new Cubo(3));
	}

}
