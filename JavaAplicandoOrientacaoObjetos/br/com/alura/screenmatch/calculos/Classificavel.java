package br.com.alura.screenmatch.calculos;

/*
 * INTERFACES SÃO UMA FORMA DE DEFINIR UM CONTRATO QUE AS CLASSES DEVEM SEGUIR
 * INTERFACE NÃO TEM IMPLEMENTAÇÃO. É UTILIZADA COMO UM CONTRATO DE UTILIZAÇÃO
 * NÃO É POSSÍVEL INSTANCIAR UM OBJETO DE INTERFACE
 */
public interface Classificavel {
	int getClassificacao();
	String getNome();
}
