package br.com.alura.ArquivosErrosAPI.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

/*
 * A HERANÇA PERMITE TORNAR O CÓDIGO MAIS UTILIZÁVEL
 */

/*
 * SUPERCLASSE/CLASSE MÃE/CLASSE PRINCIPAL
 * IMPLEMENTAÇÃO DA CLASSE Comparable<> POSSIBILITA A COMPARAÇÃO DE LISTAS
 * ALÉM DA CLASSE Comparable, O JAVA POSSUI UMA OUTRA INTERFACE CHAMADA
 * Comparator, QUE NOS FORNECE OUTRA ALTERNATIVA PARA ORDENAÇÃO DE DADOS
 */
public class Titulo implements Comparable<Titulo>{
	@SerializedName("Title")
	private String nome;
	@SerializedName("Year")
	private int anoDeLancamento;
	boolean incluidoNoPlano;
	private double avaliacao;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	int duracaoEmMinutos;
	
	//METODO CONSTRUTOR
	public Titulo(String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public Titulo(TituloOmdb meuTitulo) {
		this.nome = meuTitulo.title();
		this.anoDeLancamento = Integer.valueOf(meuTitulo.year());
		this.duracaoEmMinutos = Integer.valueOf(meuTitulo.runtime().substring(0, 2));
;	}

	//VOID NÃO DEVOLVE VALORES
	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
		System.out.println("Incluido no plano: " + incluidoNoPlano);
		System.out.println("Avaliações: " + avaliacao);
		}
	
	//MÉTODO QUE RECEBE UM PARAMETRO DO TIPO DOUBLE
	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
	
	//MÉTODO COM TIPO DEFINIDO RETORNAM VALORES
	public double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}
	
	//ATRAVÉS DOS GETTERS PODEMOS LER OS ATRIBUTOS
	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	//OS SETTERS PERMITEM A MODIFICAÇÃO DOS ATRIBUTOS
	public void setNome(String nome) {
		//O this FAZ REFERÊNCIA AO ATRIBUTO DA CLASSE
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	@Override
	public String toString() {
		return "nome= " + nome + ", anoDeLancamento= "
				+ anoDeLancamento + ", duracao= " + duracaoEmMinutos;
	}
	
	//MÉTODO DA INTERFACE Comparable
	@Override
	public int compareTo(Titulo outroTitulo) {
		//COMPARANDO O NOME DE UM TITULO COM O getNome() DE OUTRO TITULO
		return this.getNome().compareTo(outroTitulo.getNome());
	}
}

