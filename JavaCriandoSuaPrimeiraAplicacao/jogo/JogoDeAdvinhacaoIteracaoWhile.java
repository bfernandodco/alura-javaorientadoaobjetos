package jogo;

import java.util.Random;
import java.util.Scanner;

/*DESAFIO
 * CRIE UM PROGRAMA QUE SIMULA UM JOGO DE ADIVINHAÇÃO, QUE DEVE GERAR UM NÚMERO
 * ALEATÓRIO ENTRE 0 E 100 E PEDIR PARA O USUÁRIO TENTAR ADIVINHAR EM ATÉ 5
 * TENTATIVAS. A CADA TENTATIVA, O PROGRAMA DEVE INFORMAR SE O NUMERO DIGITADO
 * PELO USUÁRIO É MAIOR OU MENOR DO QUE O NÚMERO GERADO
 */

public class JogoDeAdvinhacaoIteracaoWhile {

	public static void main(String[] args) {
		int aleatorio = new Random().nextInt(100);
		Scanner numero = new Scanner(System.in);

		//PARA FIM DE TESTES
		System.out.println(aleatorio);
		
		int contador = 0;
		while (contador <= 5) {
			contador++;
			
			System.out.println("Informe um número de 1 a 100");
			int tentativa = numero.nextInt();
			
			if (contador == 5) {
				System.out.println("Você perdeu");
				break;
			}else if (tentativa == aleatorio) {
				System.out.println("Parabéns! Você acertou!");
				break;
			} else if (tentativa < aleatorio) {
				System.out.println("Tente um número maior");
			} else {
				System.out.println("Tente um número menor");
			}
			
		}
	}
}
