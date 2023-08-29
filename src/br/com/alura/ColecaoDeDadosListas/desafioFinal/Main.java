package br.com.alura.ColecaoDeDadosListas.desafioFinal;

import java.util.Collections;
import java.util.Scanner;

import br.com.alura.AplicandoOrientacaoObjetos.desafioFinal.modelos.CartaoDeCredito;
import br.com.alura.AplicandoOrientacaoObjetos.desafioFinal.modelos.Compra;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o limite do cartão: ");
		double limite = leitura.nextDouble();
		CartaoDeCredito cartao = new CartaoDeCredito(limite);
		
		int sair = 1;
		while (sair != 0) {
			System.out.println("Digite a descrição da compra: ");
			String descricao = leitura.next();
			
			System.out.println("Digite o valor da compra: ");
			double valor = leitura.nextDouble();
			
			Compra compra = new Compra(descricao, valor);
			boolean compraRealizada = cartao.lancaCompra(compra);
			if (compraRealizada == true){
				limite -= valor;
				Scanner continuar = new Scanner(System.in);
				System.out.println("Compra realizada!\nDigite 0 para sair ou 1 para continuar");
				sair = continuar.nextInt();
			} else if (compraRealizada == false) {
				System.out.println("Saldo insuficiente!\n");
				sair = 0;
			}
		}
		
		System.out.println("COMPRAS REALIZADAS:\n");
		Collections.sort(cartao.getCompras());
		for (Compra c : cartao.getCompras()) {
			System.out.println(c);
		}
		System.out.println("\nSaldo do Cartao: " + cartao.getSaldo());
	}
}