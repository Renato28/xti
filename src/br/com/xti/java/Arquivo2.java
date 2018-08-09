package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("c:/xti/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {

			w.write("Renato\t");
			w.write("Nobrega\t");
			w.write("Silva\t");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while ((line = reader.readLine()) != null)
				System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
