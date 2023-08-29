package br.com.alura.ArquivosErrosAPI.screenmatch;

import com.google.gson.*;

import br.com.alura.ArquivosErrosAPI.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.ArquivosErrosAPI.screenmatch.modelos.Titulo;
import br.com.alura.ArquivosErrosAPI.screenmatch.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBusca {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner leitura = new Scanner(System.in);
		String filme = "";
		List<Titulo> titulos = new ArrayList<>();
		Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
				.setPrettyPrinting()
				.create();
		
		/*
		 * O MÉTODO equalsIgnoreCase() AGUARDA A INSTRUÇÃO PARA INTERROMPER
		 * O LAÇO. ENQUANTO A BUSCA FOR DIFERENTE DE sair
		 */
		while (!filme.equalsIgnoreCase("sair")) {
			System.out.println("Digite um filme para a busca");
			filme = leitura.nextLine();

			if (filme.equalsIgnoreCase("sair")) {
				leitura.close();
				break;
			}
			String endereco = "http://www.omdbapi.com/?t=" + filme.replace(" ", "+") + 
					"&apikey=fd9f2b16";
			try {
				HttpClient client = HttpClient.newHttpClient();
				HttpRequest request = HttpRequest.newBuilder()
						.uri(URI.create(endereco)).build();
				HttpResponse<String> response = client.send
						(request, HttpResponse.BodyHandlers.ofString());
				String json = response.body();
				System.out.println(response.body());
				
				/*
				 * TRANSFORMANDO CLASSE Titulo EM UM Gson
				 *Gson gsonTitulo = new Gson();
				  gsonTitulo.fromJson(json, Titulo.class);
				 *System.out.println("Titulo: " + meuTitulo);
				 *
				 *
				 * USANDO GsonBuilder(); PARA APLICAR UPPER NAS 
				 * VARIAVEIS DO RECORD TituloOmdb
				 *
				 *
				 * Gson gsonMeuTituloOmdb = new GsonBuilder().setFieldNamingPolicy
				 * (FieldNamingPolicy.UPPER_CAMEL_CASE).create();
				 * TituloOmdb meuTituloOmdb = gsonMeuTituloOmdb.fromJson(json, TituloOmdb.class);
				 * System.out.println("Titulo: " + meuTituloOmdb);
				 */

				
				TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
				System.out.println("\nTitulo: " + meuTituloOmdb);
				
				Titulo meuTitulo = new Titulo(meuTituloOmdb);
				System.out.println("Meu Título já convertido" + meuTitulo);
				
				titulos.add(meuTitulo);
				
			} catch (NumberFormatException e) {
				System.out.println("Aconteceu um erro:\n");
				System.out.println(e.getMessage());
			} catch (IllegalArgumentException e) {
				System.out.println("\nOcorreu um erro na busca\n");
				System.out.println(e.getMessage());
			} catch (ErroDeConversaoDeAnoException e) {
				System.out.println(e.getMessage());
			/*
			 * } finally {
				System.out.println("O programa finalizou corretamente");
			 */
			}
		} leitura.close(); 
		System.out.println(titulos);
		
		FileWriter escrita = new FileWriter("filmes.json");
		escrita.write(gson.toJson(titulos));
		escrita.close();

	}
}