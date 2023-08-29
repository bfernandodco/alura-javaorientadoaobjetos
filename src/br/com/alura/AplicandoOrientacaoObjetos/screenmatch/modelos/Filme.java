package br.com.alura.AplicandoOrientacaoObjetos.screenmatch.modelos;

import br.com.alura.AplicandoOrientacaoObjetos.screenmatch.calculos.Classificavel;

//A CLASSE FILME ESTA HERDANDO OS MÉTODOS E ATRIBUTOS DA CLASSE TITULO
//É OBRIGATÓRIO O USO DO MÉTODO DA INTERFACE
	public class Filme extends Titulo implements Classificavel{
	
		
	/*
	 * MÉTODO CONSTRUTOR PARA INICIAR O CONSTRUTOR COM PARÂMETROS
	 * EXPLICITANDO O CONSTRUTOR DE HERANÇA DA CLASSE TITULO
	 */
	public Filme(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento);
	}

	/*A PARTIR DA HERANÇA COM A CLASSE TÍTULO, A CLASSE FILME TERÁ SOMENTE
	 * ATRIBUTOS E MÉTODOS EXCLUSIVOS DE SEU CONCEITO
	 */
	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	//MÉTODOS DA INTERFACE
	@Override
	public int getClassificacao() {
		return (int) pegaMedia();
	}
	
	@Override
	public String toString() {
		return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
	}
}