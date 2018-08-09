package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Arquivo3 {

	private Path path = Paths.get("C:/xti/files/contas.txt");
	private Charset utf8 = StandardCharsets.UTF_8;

	public void adicionarContas(ArrayList<Conta> contas) throws IOException {

		try (BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {

			for (Conta conta : contas) {

				writer.write(conta.getNome() + ";" + conta.getSaldo() + "\n");
			}
		}
	}

	public ArrayList<Conta> recuperarContas() throws IOException {
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			
			String line = null;
			while((line = reader.readLine()) != null){
				String[] t = line.split(";");
				Conta c = new Conta(t[0] , Double.parseDouble(t[1]));
				contas.add(c);
				
				
			}
		}
		return contas;
	}

	public static void main(String[] args) throws IOException {

		ArrayList<Conta> conta = new ArrayList<Conta>();

		conta.add(new Conta("Renato", 1500.00));
		conta.add(new Conta("Denise", 2500.00));
		conta.add(new Conta("Marcos", 1200.00));

		Arquivo3 operacao = new Arquivo3();
		operacao.adicionarContas(conta);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		
		for (Conta contas : contas2) {
			
			contas.exibirSaldo();
		}
		

	}

}
