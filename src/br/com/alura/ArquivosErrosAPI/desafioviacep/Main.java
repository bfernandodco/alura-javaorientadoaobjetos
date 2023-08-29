package br.com.alura.ArquivosErrosAPI.desafioviacep;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ConsultaCep consulta = new ConsultaCep();
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe o CEP para a busca");
		var cep = leitura.nextLine();
		try {
			Endereco novoEndereco = consulta.buscaEndereco(cep);
			System.out.println(novoEndereco);
			GeradorDeJSON gerador = new GeradorDeJSON();
			gerador.salvaJson(novoEndereco);
		
		} catch (RuntimeException | IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Finalizando a aplicação");
		} leitura.close();
	}
}