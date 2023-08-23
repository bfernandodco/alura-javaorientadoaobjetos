package br.com.alura.screenmatch.modelos;

public class Filme {
	private String nome;
	private int anoDeLancamento;
	boolean incluidoNoPlano;
	private double avaliacao;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	int duracaoEmMinutos;
	
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
	
	//ATRAVÉS DOS GETTERS TORNAMOS AS REGRAS DE NEGÓCIOS RECURSIVAS E ACESSÍVEIS
	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	//OS SETTERS PERMITEM A MANIPULAÇÃO DOS ATRIBUTOS
	public void setNome(String nome) {
		//O this FAZ REFERÊNCIA AO ATRIBUTO DA CLASSE
		this.nome = nome;
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
}