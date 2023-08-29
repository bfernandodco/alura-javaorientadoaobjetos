package br.com.alura.ArquivosErrosAPI.desafioviacep;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConsultaCep {

	public Endereco buscaEndereco(String cep) {
		URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
		try {
			HttpRequest request = HttpRequest.newBuilder()
					.uri(endereco)
					.build();
			HttpResponse<String> response = HttpClient
					.newHttpClient()
					.send(request, HttpResponse.BodyHandlers.ofString());
			return new Gson().fromJson(response.body(), Endereco.class);
		} catch (Exception e) {
			throw new RuntimeException("\nCEP não encontrado");
		} 
	}
}