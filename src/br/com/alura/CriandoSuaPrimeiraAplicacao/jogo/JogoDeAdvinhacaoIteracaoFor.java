package br.com.alura.CriandoSuaPrimeiraAplicacao.jogo;

import java.util.Random;
import java.util.Scanner;

/*DESAFIO
 * CRIE UM PROGRAMA QUE SIMULA UM JOGO DE ADIVINHAÇÃO, QUE DEVE GERAR UM NÚMERO
 * ALEATÓRIO ENTRE 0 E 100 E PEDIR PARA O USUÁRIO TENTAR ADIVINHAR EM ATÉ 5
 * TENTATIVAS. A CADA TENTATIVA, O PROGRAMA DEVE INFORMAR SE O NUMERO DIGITADO
 * PELO USUÁRIO É MAIOR OU MENOR DO QUE O NÚMERO GERADO
 */


public class JogoDeAdvinhacaoIteracaoFor {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int aleatorio = new Random().nextInt(100);
		
		//INFORMAÇÃO PARA TESTAR O PROGRAMA
		System.out.println(aleatorio);
		
		//UTILIZANDO A ITERAÇÃO FOR
		for (int i = 0; i <= 5; i++ ) {
			System.out.println("Tente advinhar o numero");
			int tentativa = numero.nextInt();
			if (tentativa == aleatorio) {
				System.out.println("Parabéns! Você conseguiu!");
				break;
			} else if (tentativa < aleatorio) {
				System.out.println("Incorreto. Tente um número maior");
			} else {
				System.out.println("Incorreto. Tente um número menor");
			}
		}
		System.out.println("Fim das tentativas :(");
	}
}