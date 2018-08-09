package br.com.xti.redes;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class ConselhoCliente {

	public static void main(String[] args) throws Exception {
		
		@SuppressWarnings("resource")
		Socket socket = new Socket("127.0.0.1", 5000);
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println("Conselho : " + s.nextLine());
		s.close();
	}

}
