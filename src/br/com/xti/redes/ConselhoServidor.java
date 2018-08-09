package br.com.xti.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings("unused")
public class ConselhoServidor {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(5000);
		while (true) {

			Socket socket = server.accept();
			try (PrintWriter w = new PrintWriter(socket.getOutputStream())) {

				w.println("Aprenda Java e seja contratado!");
			}

		}
	}

}
