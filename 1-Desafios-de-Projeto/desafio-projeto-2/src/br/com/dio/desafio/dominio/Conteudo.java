package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	// Declaração dos atributos da classe
	protected static final double XP_PADRAO = 10;
	private String titulo; 
	private String descricao;
	
	// Criação dos métodos get e set 
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	// Criação do método abstrato calcularXp()
	public abstract double calcularXp();
}