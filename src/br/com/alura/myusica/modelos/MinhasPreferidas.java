package br.com.alura.myusica.modelos;

public class MinhasPreferidas {
	
	public void inclui(Audio audio) {
		if(audio.getClassificacao() >= 8) {
			System.out.println(audio.getTitulo() + " Considerado bom");
		} else {
			System.out.println(audio.getTitulo() + " Ouve depois");
		}
	}
}
