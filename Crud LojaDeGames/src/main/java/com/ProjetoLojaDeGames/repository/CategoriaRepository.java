package com.ProjetoLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoLojaDeGames.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>  {

	public List <Categoria> findAllByPlataformaContainingIgnoreCase(String plataforma);

	
}
