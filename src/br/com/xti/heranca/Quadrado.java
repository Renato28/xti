package br.com.xti.heranca;

public class Quadrado implements AreaCalculavel {
	
	public double lado;
	
	public Quadrado(double lado) {
		
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}
	
	
}
