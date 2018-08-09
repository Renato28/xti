package br.com.xti.heranca;

public class Cubo implements VolumeCalculavel , AreaCalculavel {

	public double lado;
	
	public Cubo(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularVolume() {
		return lado * lado * lado;
	}

	@Override
	public double calcularArea() {
		return 6 * lado * lado;
	}

}
