package br.com.alura.CriandoSuaPrimeiraAplicacao.leituraDeDados;

import java.util.Scanner;

public class Scanear {

	public static void main(String[] args) {
		/*CONSTRUINDO UM OBJETO SCANNER COM O PARAMETRO System.in QUE REALIZA LEITURAS DO TECLADO
		DIFERENTE DO JOPTIONPANE, O Scanner SOLICITA A ENTRADA DE DADOS NO CONSOLE
		*/
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite seu filme favorito");
		String filme = leitura.nextLine();
		System.out.println(filme);
		System.out.println("Ano de lançamento");
		String ano = leitura.nextLine();
		System.out.println(ano);
		System.out.println("Qual é a nota que você dá para o filme?");
		//INFORME A NUMERAÇÃO CONFORME O IDIOMA DO TECLADO LOCAL (EX: PT-BR = 9,9)
		double nota = leitura.nextDouble();
		System.out.println(nota);
	}
}