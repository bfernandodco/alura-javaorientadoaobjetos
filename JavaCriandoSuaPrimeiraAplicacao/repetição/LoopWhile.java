package repetição;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double nota = 0;
		double soma = 0;
		int totalDeNota = 0;
		
		while (nota != -1) {
			System.out.println("Informe a nota para o filme ou digite -1 para sair:");
			nota = leitura.nextDouble();
			if (nota != -1) {
				soma += nota;
				totalDeNota++;
			}
		}
		System.out.printf("A média de avaliação é de: %.2f", soma / totalDeNota );
	}
}