package br.com.alura.AplicandoOrientacaoObjetos.desafioFinal.modelos;

public class Compra {
	private String descricao;
	private double valor;
	
	public String getDescricao() {
		return descricao;
	}
	public double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "Descrição da Compra: " + descricao + ",Valor: " + valor;
	}
}
