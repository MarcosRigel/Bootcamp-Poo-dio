package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d; // isso é uma constante !
	
	private String titulo; // atributos
	private String descricao; // atributos 
	
	public abstract double calcularXp();

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
	
}