package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Listas de Objetos", 24));
		javaColecoes.adiciona(new Aula("Relacionamento com coleções", 22));
		System.out.println(aulas);
		
	}

}
