package br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Form;

import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Model.Game;

public class GameForm {
	
	private String titulo;
	private String descricao;
	private int quantidadeEstoque;
	private Double preco;
	
	public GameForm(String titulo, String descricao, int quantidadeEstoque, Double preco) {
		
		this.titulo = titulo;
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
		this.preco = preco;
	
	}

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

	public int getQuantidadeEstoque() {
	
		return quantidadeEstoque;
	
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
	
		this.quantidadeEstoque = quantidadeEstoque;
	
	}

	public Double getPreco() {
	
		return preco;
	
	}

	public void setPreco(Double preco) {
	
		this.preco = preco;
	
	}
	
	public Game Convert() {
		
		Game game = new Game(titulo, descricao, quantidadeEstoque, preco);
		
		return game;
		
	}
	
	
	
}
