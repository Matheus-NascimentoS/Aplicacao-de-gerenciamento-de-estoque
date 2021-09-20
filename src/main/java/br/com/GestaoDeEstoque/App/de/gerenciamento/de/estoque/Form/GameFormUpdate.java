package br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Form;

import java.util.Optional;

import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Model.Game;
import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Repository.GameRepository;

public class GameFormUpdate {
	
	private int quantidadeEstoque;
	private Double preco;
	
	public Game Update(Long id, GameRepository gameRepo) {
		
		Optional<Game> game = gameRepo.findById(id);
		game.get().setPreco(this.preco);
		game.get().setQuantidadeEstoque(this.quantidadeEstoque);
		return game.get();
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
	
	

}
