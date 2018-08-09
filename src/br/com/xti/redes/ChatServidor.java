package br.com.xti.redes;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServidor {
	
	List<PrintWriter> escritores = new ArrayList<PrintWriter>();
	
	public ChatServidor() {
		ServerSocket server;
		
		try {
			server = new ServerSocket(5000);
			while(true){
				Socket socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				escritores.add(p);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	private void encaminharParaTodos(String texto){
		for (PrintWriter writer : escritores) {
			try {
				writer.println(texto);
				writer.flush();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private class EscutaCliente implements Runnable{
		
		Scanner leitor;
		
		public EscutaCliente(Socket socket) {
			try {
				leitor = new Scanner(socket.getInputStream());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		@Override
		public void run() {
			try {
				String texto;
				while((texto = leitor.nextLine())!= null){
					System.out.println(texto);
					encaminharParaTodos(texto);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		new ChatServidor();
	}

}
