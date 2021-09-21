package br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Form.GameForm;
import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Form.GameFormUpdate;
import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Model.Game;
import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Repository.GameRepository;

@Service
public class GameService {
	
	GameRepository repository;

	@Autowired
	public GameService(GameRepository repository) {
	
		this.repository = repository;
	
	}
	
	public String GetAll(Model model) {
		
		model.addAttribute("games", repository.findAll());
		
		return "Paginas/Home";
		
	}
	
	public String GetAvaibleGames(Model model) {
		
		model.addAttribute("games", repository.findByQuantidadeEstoqueGreaterThan(0));
		return "Paginas/Disponiveis";
		
	}

	public String Delete(Long id, Model model) {
		
		Game game = repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Jogo invalido" + id));
		
		repository.delete(game);
		
		model.addAttribute("games", repository.findAll());
		
		return "Paginas/Delete";
		
	}

	public String NewGameForm() {
		
		return "Formularios/NewGame";

	}

	public String NewGameView(GameForm form, Model model) {

		Game game = form.Convert();
		
		repository.save(game);
		
		model.addAttribute("games", game);
		
		return "Paginas/ViewGame";
		
	}

	public String Edit(long id, Model model) {
		
		Game game = repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Jogo invalido" + id));
		model.addAttribute("games", game);
		return "Formularios/UpdateGame";
		
	}

	public String Update(long id, GameFormUpdate form, Model model) {

		Game game = form.Update(id, repository);
		
		repository.save(game);
		
		model.addAttribute("games", game);
		
		return "Paginas/ViewGame";
		
	}
	
}
