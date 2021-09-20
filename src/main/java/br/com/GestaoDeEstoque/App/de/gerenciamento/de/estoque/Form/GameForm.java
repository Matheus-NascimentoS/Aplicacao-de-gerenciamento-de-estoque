package br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Form;

import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Model.Game;

public class GameForm {
	
	private String titulo;
	private String descricao;
	private String quantidadeEstoque;
	private String preco;
	
	public GameForm(String titulo, String descricao, String quantidadeEstoque, String preco) {
		
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

	public String getQuantidadeEstoque() {
	
		return quantidadeEstoque;
	
	}

	public void setQuantidadeEstoque(String quantidadeEstoque) {
	
		this.quantidadeEstoque = quantidadeEstoque;
	
	}

	public String getPreco() {
	
		return preco;
	
	}

	public void setPreco(String preco) {
	
		this.preco = preco;
	
	}
	
	public Game Convert() {
		
		Game game = new Game(titulo, descricao, Integer.parseInt(quantidadeEstoque), Double.parseDouble(preco));
		
		return game;
		
	}
	
	
	
}
