package br.com.xti.poo;

public enum Medida {
	
	MM("M�limetro"), CM("Cent�metro"), M("Metro");
	
	public String titulo;
	
	private Medida(String titulo) {
		this.titulo = titulo;
	}
}
