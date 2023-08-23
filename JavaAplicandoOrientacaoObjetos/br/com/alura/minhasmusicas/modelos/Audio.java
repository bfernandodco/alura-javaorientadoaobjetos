package br.com.alura.minhasmusicas.modelos;

public class Audio {
	private String titulo;
	private int totalReproducoes;
	private int totalCurtidas;
	private int classificacao;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titutlo) {
		this.titulo = titutlo;
	}
	
	public int getTotalReproducoes() {
		return totalReproducoes;
	}
	
	public int getTotalCurtidas() {
		return totalCurtidas;
	}
	
	public int getClassificacao() {
		return classificacao;
	}
	
	public void curte() {
		this.totalReproducoes++;
	}
	
	public void reproduz() {
		this.totalReproducoes++;
	}
}