package br.com.alura.ArquivosErrosAPI.screenmatch.modelos;

//RECORD É IMUTÁVEL
public record TituloOmdb(String title, String year, String runtime) {

	@Override
	public String toString() {
		return "TituloOmdb [title=" + title + ", year=" + year + ", runtime=" + runtime + "]";
	}
}
	