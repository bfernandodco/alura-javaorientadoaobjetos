package br.com.alura.CriandoSuaPrimeiraAplicacao.desafio;

import java.util.Scanner;

/*
 * A proposta é iniciarmos os dados do cliente como um extrato, e em 
 * seguida, teremos quatro opções de operações com a linha para inserir a 
 * opção desejada:

	***********************
	Dados iniciais do cliente:
	
	Nome: Jacqueline Oliveira
	Tipo conta: Corrente
	Saldo inicial: R$ 2500,00
	***********************
	
	Operações
	
	1- Consultar saldos
	2- Receber valor
	3- Transferir valor
	4- Sair
	
	Digite a opção desejada:
 */

public class Desafio {

	public static void main(String[] args) {
		
		String nome = "Eliot Anderson";
		String tipoConta = "Corrente";
		double saldo = 1599.99;
		
		System.out.println("*********************");
		System.out.println("\nNome do cliente: " + nome);
		System.out.println("Tipo de conta: " + tipoConta);
		System.out.println("Saldo atual : " + saldo + "\n");
		System.out.println("*********************");
		
		int opcao = 0;
		String menu = """
				SELECIONE UMA OPÇÃO
				1 - Consultar saldo
				2 - Transferir valor
				3 - Receber valor
				4 - Sair
				""";
		
		Scanner leitura = new Scanner(System.in);
		
		while (opcao != 4) {
			System.out.println(menu);
			opcao = leitura.nextInt();
			if (opcao == 1) {
				System.out.println("Saldo em conta: " + saldo + "\n");
			} else if (opcao == 2) {
				System.out.println("Informe o valor que deseja transferir: ");
				double valor = leitura.nextDouble();
				if (valor > saldo) {
					System.out.println("Valor indisponível para transferência");
				} else {
					System.out.println("Valor transferido com sucesso! Saldo atual: " + (saldo - valor));
				}
			} else if (opcao == 3) {
				System.out.println("Informe o valor a receber");
				double valor = leitura.nextDouble();
				System.out.println("Valores recebidos com sucesso. Saldo atual: " + (saldo + valor));
			} else if (opcao == 4) {
				System.out.println("Aplicativo encerrado...");
				break;
			} else {
				System.out.println("Opção inválida");
			}
		}
	}
}