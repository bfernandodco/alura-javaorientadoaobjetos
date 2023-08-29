package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
	
	/*
	 * MÉTODO CONSTRUTOR PARA INICIAR O CONSTRUTOR COM PARÂMETROS
	 * EXPLICITANDO O CONSTRUTOR DE HERANÇA DA CLASSE TITULO
	 */
	public Serie(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento) ;
	}

	private int temporada;
	private int episodiosPorTemporada;
	private boolean ativa;
	private int minutosPorEpisodio;
	
	public int getTemporada() {
		return temporada;
	}
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	public int getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}
	public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}
	public void setMinutosPorEpisodio(int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
	@Override //POSSIBILITA A SOBRESCRITA DE MÉTODO
	public int getDuracaoEmMinutos() {
		return temporada * episodiosPorTemporada * minutosPorEpisodio;
	}
}