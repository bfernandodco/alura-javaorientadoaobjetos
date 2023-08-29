package br.com.alura.AplicandoOrientacaoObjetos.screenmatch;

import java.util.ArrayList;
import java.util.Collections;

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
		
		//ORDENANDO LISTAS
		ArrayList<String> buscaPorArtista = new ArrayList<>();
		buscaPorArtista.add("Daniel Radclif");
		buscaPorArtista.add("Rami Malek");
		buscaPorArtista.add("Jason Statham");
		/*
		 * O MÉTODO SORT DA CLASSE COLLETCTIONS ORDENA UMA LISTA DE STRINGS
		 * EM ORDEM ALFABÉTICA
		 */
		Collections.sort(buscaPorArtista);
		System.out.println("Depois da ordenação :\n" + buscaPorArtista);
		/*
		 * APOS IMPLEMENTAR A CLASSE COMPARABLE NA CLASSE TITULO REESCREVEMOS
		 * O MÉTODO CompareTo() PARA COMPARAR OS NOMES E ORDENA-LOS DE AZ
		 */
		Collections.sort(lista);
		System.out.println("Lista de titulos ordenados: \n" + lista);
	}
}