package br.com.alura.ArquivosErrosAPI.desafioviacep;

public record Endereco(String cep, String logradouro, String bairro, String uf) {

	@Override
	public String toString() {
		return "Endereco [cep = " + cep + ", logradouro = " + logradouro + ", bairro = "
				+ bairro + ", uf = " + uf + "]";
	}
}