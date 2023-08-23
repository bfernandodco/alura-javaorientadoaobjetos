package br.com.alura.screematch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
	private int tempoTotal = 0;
	
	public int getTempoTotal() {
		return tempoTotal;
	}
	
	/*SOBRECARGA DE MÉTODOS PARA RECURSIVIDADE
	public void inclui(Filme filme) {
		this.tempoTotal += filme.getDuracaoEmMinutos();
	}
	
	public void inclui(Serie serie) {
		this.tempoTotal += serie.getDuracaoEmMinutos();
	}*/
	
	//UTILIZANDO A SUPERCLASSE, TANTO Filme como Serie SÃO PARAMETROS PARA Título
	//ESSE É O CONCEITO DE POLIMORFISMO
	public void inclui(Titulo titulo) {
		this.tempoTotal += titulo.getDuracaoEmMinutos();
	}
}