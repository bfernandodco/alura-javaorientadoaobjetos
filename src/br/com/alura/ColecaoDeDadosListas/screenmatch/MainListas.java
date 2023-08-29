package br.com.alura.ColecaoDeDadosListas.screenmatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

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
		System.out.println("\nDepois da ordenação :\n" + buscaPorArtista + "\n");
		/*
		 * APOS IMPLEMENTAR A CLASSE COMPARABLE NA CLASSE TITULO REESCREVEMOS
		 * O MÉTODO CompareTo() PARA COMPARAR OS NOMES E ORDENA-LOS DE AZ
		 */
		Collections.sort(lista);
		System.out.println("Lista de titulos ordenados: \n" + lista + "\n");
		
		/*
		 * USAR O .sort DIRETO NUM OBJETO ArrayList<>() É A MANEIRA MAIS
		 * MODERNA DE ORDENAR UMA LISTA POR COMPARAÇÃO
		 * A CLASSE Comparator POSSUI UM MÉTODO ESTÁTICO comparing
		 * QUE FAZ A ORDENAÇÃO DE ACORDO COM A CLASSE PRINCIPAL E
		 * O UM MÉTODO get
		 */
		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println("Comparando com a Classe Comparator e seu método estático comparing: \n" + lista + "\n");
		
		
		/*
		 * É UM BOM HABÍTO TRATAR OS OBJETOS DE FORMA GENÉRICA
		 * NESTE CASO, A CLASSE LinkedList IMPLEMENTA A INTERFACE List
		 * QUE ESTENDE Collection, E FORNECE UMA LISTA ENCADEADA
		 * O QUE SIGNIFICA QUE CADA ELEMENTO DA LISTA É UM OBJETO QUE CONTÉM
		 * UMA REFERÊNCIA PARA O PRÓXIMO ELEMENTO, PERMITINDO QUE QUALQUER
		 * ELEMENTO SEJA ADICIONADO OU REMOVIDO DE MANEIRA EFICIENTE EM
		 * QUALQUER POSIÇÃO DA LISTA
		 */
		List<Titulo> buscaArtista = new LinkedList<>();
		buscaArtista.add(meuFilme);
		buscaArtista.add(outroFilme);
		buscaArtista.add(filmeDoBruno);
	}
}