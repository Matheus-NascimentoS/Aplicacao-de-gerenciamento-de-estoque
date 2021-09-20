package br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Form.GameForm;
import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Model.Game;
import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Repository.GameRepository;
import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Service.GameService;

@Controller
@RequestMapping("Jogos")
public class GameController {

	@Autowired
	GameRepository repository;
	
	@Autowired
	GameService service = new GameService(repository);
	
	@GetMapping("/Home")
	public String GetAll(Model model) {
		
		return service.GetAll(model);
		
	}
	
	@GetMapping("/Disponiveis")
	public String GetAvaible(Model model) {
		
		return service.GetAvaibleGames(model);
		
	}
	
	@GetMapping("/Formulario/Novo")
	public String Post() {
		
		return service.NewGameForm();
		
	}
	
	@PostMapping("/NovoJogo")
	public String ViewNewGame(GameForm form, Model model) {
		
		return service.NewGameView(form, model);
		
		
	}
	
	@GetMapping("delete/{id}")
	public String Delete(@PathVariable("id") long id, Model model) {
		
		return service.Delete(id, model);
		
	}
	
}
