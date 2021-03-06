package org.generation.game.repository;

import java.util.List;

import org.generation.game.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByNomeContainingIgnoreCase (String nome);
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
	
}
