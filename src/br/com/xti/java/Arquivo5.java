package br.com.xti.java;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) {

		Iterable<Path> diretorios = FileSystems.getDefault()
				.getRootDirectories();

		for (Path path : diretorios) {

			System.out.println(path);
		}

		/* LISTAR CONTEUDO */

		Path dir = Paths.get("C:/xti/");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {

			for (Path path : stream) {

				System.out.println(path.getFileName());
			}

		} catch (IOException | DirectoryIteratorException e) {
			e.printStackTrace();
		}

	}

}
