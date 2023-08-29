package br.com.alura.ColecaoDeDadosListas.screenmatch;

import java.util.ArrayList;

import br.com.alura.AplicandoOrientacaoObjetos.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.AplicandoOrientacaoObjetos.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.AplicandoOrientacaoObjetos.screenmatch.modelos.Episodio;
import br.com.alura.AplicandoOrientacaoObjetos.screenmatch.modelos.Filme;
import br.com.alura.AplicandoOrientacaoObjetos.screenmatch.modelos.Serie;

public class Main {

	public static void main(String[] args) {
		/*
		 * INSTANCIAR UM OBJETO DA CLASSE FILME
		 * A VARIÁVEL meuFilme É A REFERENCIA AO OBJETO Filme INSTANCIADO
		 */
		Filme meuFilme = new Filme("The God Father", 1970);

		/*COM OS SETTERS DEFINIDOS, UTILIZAMOS PARA MANIPULAR AS VARIÁVEIS
		 * DO OBJETO INSTANCIADO
		 */
		//meuFilme.setNome();
		//meuFilme.setAnoDeLancamento();
		meuFilme.setDuracaoEmMinutos(180);
		meuFilme.setIncluidoNoPlano(true);
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(6);
		meuFilme.avalia(3);
		
		//INVOCAÇÃO DO MÉTODO DENTRO DO PRINT
		System.out.println("A média de avaliações do filme é de: " + meuFilme.pegaMedia());
		System.out.println("Tivemos um total de " + meuFilme.getTotalDeAvaliacoes() + " avaliações");
		
		Serie serie = new Serie("Breaking Bad", 2015);
		//UTILIZANDO A HERANÇA É POSSÍVEL UTILIZAR ATRIBUTOS E MÉTODOS DA MÃE
		//serie.setNome();
		//serie.setAnoDeLancamento();
		serie.setTemporada(5);
		
		serie.setEpisodiosPorTemporada(10);
		serie.setMinutosPorEpisodio(50);
		System.out.println("Duração para maratonar Breaking Bad: " + serie.getDuracaoEmMinutos());
		
		Filme outroFilme = new Filme("Lord of the Rings", 2003);

		/*
		 * COM OS SETTERS DEFINIDOS, UTILIZAMOS PARA MODIFICAR AS VARIÁVEIS
		 * DO OBJETO INSTANCIADO
		 */
		//outroFilme.setNome("Lord of the Rings");
		//outroFilme.setAnoDeLancamento();
		outroFilme.setDuracaoEmMinutos(210);
		outroFilme.setIncluidoNoPlano(true);
		outroFilme.exibeFichaTecnica();
		meuFilme.avalia(1);
		meuFilme.avalia(1);
		meuFilme.avalia(3);
		
		//CALCULADORA DE TEMPO TOTAL 
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(serie);
		System.out.println(calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		filtro.filtra(outroFilme);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(serie);
		episodio.setTotalVisualizacoes(300);
		

		/*
		 * A VARIÁVEL VAR REALIZA UMA INFERÊNCIA DO TIPO DECLARADO
		 * É POSSÍVEL PASSAR PARÂMETROS NO MÉTODO CONSTRUTOR ATRAVÉS DE UM SETTER. 
		 * PARA ISSO, DEVE-SE CRIAR UM MÉTODO set PARA O CONSTRUTOR DE ACORDO
		 * COM O PARÂMETRO QUE QUEREMOS QUE ELE SE INICIE
		 * LOCALIZAÇÃO DO set: CLASSE FILME
		 */
		var filmeDoBruno = new Filme("Harry Potter", 2001);
		//filmeDoBruno.setNome("Harry Potter");
		//filmeDoBruno.setAnoDeLancamento(2001);
		filmeDoBruno.setDuracaoEmMinutos(200);
		filmeDoBruno.avalia(10);
		
		//CRIANDO UMA LISTA DE FILMES COM ARRAYLIST
		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(filmeDoBruno);
		listaDeFilmes.add(meuFilme);
		listaDeFilmes.add(outroFilme);
		System.out.println("Tamanho da lista " + listaDeFilmes.size());
		System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
		/*
		 * RETORNA O toString() da Classe Object
		 * REESCREVEMOS O MÉTODO toString() PARA RETORNAR UMA String MODIFICADA
		 * COM OS VALORES DA LISTA
		 */
		System.out.println(listaDeFilmes);
	}
}