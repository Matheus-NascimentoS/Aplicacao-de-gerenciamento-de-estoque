package br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Repository.GameRepository;

@Controller
@RequestMapping("Jogos")
public class GameController {

	@Autowired
	GameRepository repository;
	
	@GetMapping("/Home")
	public String GetAll(Model model) {
		
		model.addAttribute("games", repository.findAll());
		
		return "Home";
		
	}
	
}
