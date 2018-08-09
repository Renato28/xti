package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.xti.poo.Conta;

public class Serializa {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Conta conta = new Conta("Renato", 1500.00);
		Conta conta1 = new Conta("Denise", 2500.00);
		
		FileOutputStream fos = new FileOutputStream("C:/xti/files/objeto3.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(conta);
		oos.writeObject(conta1);
		oos.close();
		
		FileInputStream fis = new FileInputStream("C:/xti/files/objeto3.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		@SuppressWarnings("unused")
		Conta c = (Conta) ois.readObject();
		ois.close();
		
		conta.exibirSaldo();
		conta1.exibirSaldo();

	}

}