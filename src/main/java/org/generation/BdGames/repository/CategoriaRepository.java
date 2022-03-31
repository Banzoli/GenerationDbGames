package org.generation.BdGames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.generation.BdGames.model.Categoria;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllByDescricaoContainingIgonoreCase( String descricao);
	
}