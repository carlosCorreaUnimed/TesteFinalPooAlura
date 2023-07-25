package br.com.alura.myusica.modelos;

public class Audio {
	private String titulo;
	private int totalReproducoes;
	private int totalCurtidas;
	private int classificacao;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTotalReproducoes() {
		return totalReproducoes;
	}
	public int getTotalCurtidas() {
		return totalCurtidas;
	}
	public int getClassificacao() {
		return classificacao;
	}
	
	public void curte() {
		this.totalCurtidas++;
	}
	public void reproduz() {
		this.totalReproducoes++;
	}
	public int asMelhores() {
		int Tops = (this.getTotalCurtidas() + this.getTotalReproducoes()) / 2;
		return Tops;
	}
	
}
