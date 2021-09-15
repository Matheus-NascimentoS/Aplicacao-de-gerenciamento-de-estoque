package br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.GestaoDeEstoque.App.de.gerenciamento.de.estoque.Model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

	List<Game> findByQuantidadeEstoqueGreaterThan(Integer quantidade);
	
}
