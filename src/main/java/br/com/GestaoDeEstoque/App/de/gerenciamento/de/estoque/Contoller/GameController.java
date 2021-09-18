package br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Model.Game;
import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Repository.GameRepository;

@Controller
@RequestMapping("Jogos")
public class GameController {

	@Autowired
	GameRepository repository;
	
	@GetMapping("/Home")
	public String GetAll(Model model) {
		
		model.addAttribute("games", repository.findAll());
		
		return "HomePage";
		
	}
	
	@GetMapping("delete/{id}")
	public String DeleteGame(@PathVariable("id") long id, Model model) {
		
		Game game = repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
		
		repository.delete(game);
		
		model.addAttribute("games", repository.findAll());
		
		return "HomePage";
		
	}
	
}
