package br.alura.screenmatch;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
/*A IMPORTAÇÃO DO PACOTE COM A CLASSE FILME, GARANTE
 * QUE ESSA CLASSE MAIN UTILIZE SEUS MÉTODOS
 */
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {

	public static void main(String[] args) {
		/*INSTANCIAR UM OBJETO DA CLASSE FILME
		 * A VARIÁVEL meuFilme É A REFERENCIA AO OBJETO Filme INSTANCIADO
		 */
		Filme meuFilme = new Filme();

		/*COM OS SETTERS DEFINIDOS, UTILIZAMOS PARA MANIPULAR AS VARIÁVEIS
		 * DO OBJETO INSTANCIADO
		 */
		meuFilme.setNome("The God Father");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		meuFilme.setIncluidoNoPlano(true);
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(6);
		meuFilme.avalia(3);
		
		//INVOCAÇÃO DO MÉTODO DENTRO DO PRINT
		System.out.println("A média de avaliações do filme é de: " + meuFilme.pegaMedia());
		System.out.println("Tivemos um total de " + meuFilme.getTotalDeAvaliacoes() + " avaliações");
		
		Serie serie = new Serie();
		//UTILIZANDO A HERANÇA É POSSÍVEL UTILIZAR ATRIBUTOS E MÉTODOS DA MÃE
		serie.setNome("Breaking Bad");
		serie.setTemporada(5);
		serie.setAnoDeLancamento(2015);
		serie.setEpisodiosPorTemporada(10);
		serie.setMinutosPorEpisodio(50);
		System.out.println("Duração para maratonar Breaking Bad: " + serie.getDuracaoEmMinutos());
		
		Filme outroFilme = new Filme();

		/*COM OS SETTERS DEFINIDOS, UTILIZAMOS PARA MODIFICAR AS VARIÁVEIS
		 * DO OBJETO INSTANCIADO
		 */
		outroFilme.setNome("Lord of the Rings");
		outroFilme.setAnoDeLancamento(2003);
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
			
	}
}