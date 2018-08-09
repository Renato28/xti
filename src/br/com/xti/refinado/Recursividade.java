package br.com.xti.refinado;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

 public class  Recursividade {

	public static int soma(int x) {

		if (x == 0) {
			return x;
		} else {
			return x + soma(x - 1);
		}
	}

	public static int potencia(int x, int e) {
		if (e == 1) {
			System.out.println(x);
			return x;
		} else {
			int y = x * potencia(x, e - 1);
			System.out.println(y);
			return y;
		}
	}

	public static void lista(Path path) {
		if (Files.isRegularFile(path)) {
			System.out.println(path.toAbsolutePath());
		} else {
			String s = "\n" + path.toAbsolutePath();
			System.out.println(s.toUpperCase());
			System.out.println(path.toAbsolutePath());
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
				for (Path p : stream) {
					lista(p);
				}
			}catch(Exception e){}
		}
	}

	public static void main(String[] args) {

		System.out.println(soma(10));
		System.out.println(potencia(3, 4));
		lista(Paths.get("C:/xti/"));
		

	}

	// 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1
	// 3 * 3 v
}
