package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livros livros = new Livros();
		System.out.println(gato);
		System.out.println(livros);
		/*
		 * int a = 2; int b = 13; System.out.println("Hello World");
		 * System.out.println("Multiplicando a x b => " + (a*b));
		 */

	}

}
/* como a classe está aqui dentro, não precisa importar */

class Livros {
	private String nome;
	private String npag;
}
