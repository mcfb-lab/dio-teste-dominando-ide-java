package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 2;
		int b = 3;
		System.out.println("Hello Word! " + (a + b));*/
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
	}
}

class Livro{
	public String livro;
	public Integer numPaginas;
}