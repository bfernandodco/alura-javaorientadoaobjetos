package br.com.alura.ArquivosErrosAPI.screenmatch;

import com.google.gson.*;
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
		String endereco = "http://www.omdbapi.com/?t=" + filme + "&apikey=fd9f2b16";
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create(endereco))
		//DESIGN PATTERN
		.build();
		 HttpResponse<String> response = client
				 .send(request, HttpResponse.BodyHandlers.ofString());
		 System.out.println(response.body());
		 
	}
}