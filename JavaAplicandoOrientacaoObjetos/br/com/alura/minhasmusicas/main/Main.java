package br.com.alura.minhasmusicas.main;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {

	public static void main(String[] args) {
		Musica musica = new Musica();
		musica.setTitutlo("The Phantom of Opera");
		musica.setArtista("Nightwish");
		musica.setAlbum("Once");
		
		for (int i = 0; i < 1000; i++) {
			musica.reproduz();
		}
		
		for (int i = 0; i < 50; i++) {
			musica.curte();
		}
		
		Podcast podcast = new Podcast();
		podcast.setTitutlo("Boas práticas em Java");
		podcast.setApresentador("Paulo Silveira");
		podcast.setDescricao("Desenvolvimento de código limpo e organizado");
		podcast.setTempo(40);
		
		for (int i = 0; i < 5000; i++) {
			podcast.reproduz();
		}
		
		for (int i = 0; i < 1000; i++) {
			podcast.curte();
		}
	}
}