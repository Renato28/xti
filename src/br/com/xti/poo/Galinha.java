package br.com.xti.poo;

public class Galinha extends Animal {
	
	public static int ovosDaGranja; //variavel global
	
	public int ovos; // total de ovos do objeto galinha
	
	public Galinha botar(){
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}

	@Override
	void fazerBarulho() {
		// TODO Auto-generated method stub
		
	}
	
	public static double mediaOvos(int galinhas){
		return ovosDaGranja / galinhas;
	}

}
