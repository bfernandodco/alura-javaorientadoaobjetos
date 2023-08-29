package br.com.alura.AplicandoOrientacaoObjetos.screenmatch;

import java.util.ArrayList;

import br.com.alura.AplicandoOrientacaoObjetos.screenmatch.modelos.Filme;
import br.com.alura.AplicandoOrientacaoObjetos.screenmatch.modelos.Serie;
import br.com.alura.AplicandoOrientacaoObjetos.screenmatch.modelos.Titulo;

public class MainListas {
	public static void main(String[] args) {
		
		Filme meuFilme = new Filme("The God Father", 1970);
		Filme outroFilme = new Filme("Lord of the Rings", 2003);
		var filmeDoBruno = new Filme("Harry Potter", 2001);
		Serie serieDoBruno = new Serie("Breaking Bad", 2015);
		
		//APLICANDO POLIMORFISMO ENTRE FILMES E SERIES SENDO TITULO
		ArrayList<Titulo> lista = new ArrayList<>();
		lista.add(filmeDoBruno);
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(serieDoBruno);
		
		//PERCORRENDO UMA LISTA
		for (Titulo item : lista) {
			System.out.println("Nome " + item.getNome());
			//SE item FOR INSTANCIADO como FILME
			if (item instanceof Filme filme) {
				System.out.println("Classificação: " + filme.getClassificacao());
			}
		}
			
		//PERCORRENDO UMA LISTA COM FOR EACH
		lista.forEach(System.out::println);
	}
}