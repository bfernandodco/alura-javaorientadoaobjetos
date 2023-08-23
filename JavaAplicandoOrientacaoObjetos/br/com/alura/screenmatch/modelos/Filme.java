package br.com.alura.screenmatch.modelos;

	//A CLASSE FILME ESTA HERDANDO OS MÉTODOS E ATRIBUTOS DA CLASSE TITULO
	public class Filme extends Titulo{
		
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
}