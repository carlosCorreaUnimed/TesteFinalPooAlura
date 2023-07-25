package br.com.alura.myusica;

import java.util.Iterator;

import br.com.alura.myusica.modelos.MinhasPreferidas;
import br.com.alura.myusica.modelos.Musicas;
import br.com.alura.myusica.modelos.Podcasts;

public class main {

	public static void main(String[] args) {
		Musicas minhaMusica = new Musicas();

		minhaMusica.setTitulo("Sombra");
		minhaMusica.setCantor("Yung Li");
		
		for (int i = 0; i<1000; i++) {
			minhaMusica.reproduz();
		}
		
		for (int i = 0; i < 50;i++) {
			minhaMusica.curte();
		}
		
		Podcasts meuPodcast = new Podcasts();
		meuPodcast.setTitulo("Coisas");
		meuPodcast.setApresentador("Chapolin");
		
		for (int i=0; i<5000; i++) {
			 meuPodcast.reproduz();
		 }
		
		for (int i = 0; i<1000; i++) {
			meuPodcast.curte();
		}
		minhaMusica.asMelhores();
		
		System.out.println(meuPodcast.asMelhores());
		MinhasPreferidas preferidas = new MinhasPreferidas();
		preferidas.inclui(meuPodcast);
		preferidas.inclui(minhaMusica);
	}
	

}
