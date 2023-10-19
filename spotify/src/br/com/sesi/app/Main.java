package br.com.sesi.app;

import br.com.sesi.model.Musica;
import br.com.sesi.model.Podcast;

public class Main {

	public static void main(String[] args) {
		
		//MUSICA
		
		Musica imprimirMusica = new Musica();
		
		imprimirMusica.setTitulo("Style");
		imprimirMusica.setDuracao("5 minutos");
		imprimirMusica.setTotalDeReproducao(1);
		imprimirMusica.setCurtidas(3999);
		imprimirMusica.setClassificacao(1);
		
		imprimirMusica.curtir();
		imprimirMusica.reproduzir();
		imprimirMusica.imprimirMusica();
		
		System.out.println("-------------------------------------------------------------------");
		
		//----------------------------------------------------------------------------------------------------//
		
		//PODCAST
		
		Podcast imprimirPodcast = new Podcast();
		
		imprimirPodcast.setTitulo("Gente!");
		imprimirPodcast.setDuracao("50 minutos");
		imprimirPodcast.setTotalDeReproducao(1);
		imprimirPodcast.setCurtidas(3999);
		imprimirPodcast.setClassificacao(1);
		
		imprimirPodcast.curti();
		imprimirPodcast.reproduzi();
		imprimirPodcast.imprimirPodcast();
		 
	}

}
