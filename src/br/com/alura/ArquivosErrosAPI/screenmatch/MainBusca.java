package br.com.alura.ArquivosErrosAPI.screenmatch;

import com.google.gson.*;

import br.com.alura.ArquivosErrosAPI.screenmatch.modelos.Titulo;
import br.com.alura.ArquivosErrosAPI.screenmatch.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainBusca {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um filme para a busca");
		var filme = leitura.nextLine();
		
		String endereco = "http://www.omdbapi.com/?t=" + filme + 
				"&apikey=fd9f2b16";
		
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
		*/
		
		/*
		 * USANDO GsonBuilder(); PARA APLICAR UPPER NAS 
		 * VARIAVEIS DO RECORD TituloOmdb
		 *
		 *
		 * Gson gsonMeuTituloOmdb = new GsonBuilder().setFieldNamingPolicy
		 * (FieldNamingPolicy.UPPER_CAMEL_CASE).create();
		 * TituloOmdb meuTituloOmdb = gsonMeuTituloOmdb.fromJson(json, TituloOmdb.class);
		 * System.out.println("Titulo: " + meuTituloOmdb);
		 */
				
		
		Gson gsonMeuTitulo = new GsonBuilder().setFieldNamingPolicy
				(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
		TituloOmdb meuTituloOmdb = gsonMeuTitulo.fromJson(json, TituloOmdb.class);
		System.out.println("Titulo: " + meuTituloOmdb);
		Titulo meuTitulo = new Titulo(meuTituloOmdb);
		System.out.println("Meu Título já convertido" + meuTitulo);
		
	}
}