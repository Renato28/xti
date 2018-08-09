package br.com.xti.poo;

public enum Medida {
	
	MM("Mílimetro"), CM("Centímetro"), M("Metro");
	
	public String titulo;
	
	private Medida(String titulo) {
		this.titulo = titulo;
	}
}
