package br.com.xti.heranca;

public class Animal {

	public String comida;
	public double peso;

	public Animal(String comida, double peso) {
		this.comida = comida;
		this.peso = peso;
	}

	public Animal() {

	}
	
	public void dormir(){
		System.out.println("Dormiu...");
	}
	
	public void fazerBarulho(){
		System.out.println("fazer barulho...");
	}
}
