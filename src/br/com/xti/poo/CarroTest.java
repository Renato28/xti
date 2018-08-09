package br.com.xti.poo;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro corsa = new Carro();
		corsa.modelo = "sedan";
		corsa.velocidadeMaxima = 180;
		corsa.segundosZeroACem = 4.5;
		Motor Gm = new Motor();
		Gm.tipo = "Gm";
		Gm.potencia = 99;
		corsa.motor = Gm; //adiciona o motor ao carro
		System.out.println("--------CHEVROLET------------");
		System.out.println("FICHA TECNICA");
		System.out.println("");
		System.out.println("Potencia: " + corsa.motor.potencia);
		System.out.println("Tipo: " + corsa.motor.tipo);
		System.out.println("");
		
		Carro fiat = new Carro("Uno" , 200 , 3.8);
		Motor Evo = new Motor("Evo" , 100);
		fiat.motor = Evo; //adiciona o motor ao carro
		System.out.println("--------FIAT-----------------");
		System.out.println("FICHA TECNICA");
		System.out.println("");
		System.out.println("Potencia: " + fiat.motor.potencia);
		System.out.println("Tipo: " + fiat.motor.tipo);
		
		/*System.out.println("Modelo: " + corsa.modelo);
		System.out.println("Velocidade Maxima: " + corsa.velocidadeMaxima);
		System.out.println("Segundos Até 100Km : " + corsa.segundosZeroACem + "s");
		System.out.println("--------------------------------------------");
		System.out.println("Modelo: " + fiat.modelo);
		System.out.println("Velocidade Maxima: " + fiat.velocidadeMaxima);
		System.out.println("Segundos Até 100Km: " + fiat.segundosZeroACem);*/

	}

}
