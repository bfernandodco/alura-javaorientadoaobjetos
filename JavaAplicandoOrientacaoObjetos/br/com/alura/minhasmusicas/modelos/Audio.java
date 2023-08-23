package br.com.alura.minhasmusicas.modelos;

public class Audio {
	private String titutlo;
	private int totalReproducoes;
	private int totalCurtidas;
	private int classificacao;
	
	public String getTitutlo() {
		return titutlo;
	}
	
	public void setTitutlo(String titutlo) {
		this.titutlo = titutlo;
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