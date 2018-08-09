package br.com.xti.poo;

public class Carro {

	public String modelo;
	public int velocidadeMaxima;
	public double segundosZeroACem;
	public Motor motor;
	
	public Carro() {
		
	}
	
	public Carro(String modelo , int velocidadeMaxima , double segundosZeroACem){
		
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
				
	}
	
	
}
