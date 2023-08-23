package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

//A CLASSE FILME ESTA HERDANDO OS MÉTODOS E ATRIBUTOS DA CLASSE TITULO
//É OBRIGATÓRIO O USO DO MÉTODO DA INTERFACE
	public class Filme extends Titulo implements Classificavel{
		
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
	public String getNome() {
		return getNome();
	}
}