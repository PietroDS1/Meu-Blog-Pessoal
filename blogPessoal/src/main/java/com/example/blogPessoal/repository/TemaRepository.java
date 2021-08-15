package com.example.blogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blogPessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{

	public List<Tema> findAllByDescrica1ContainingIgnoreCase(String descrica1);
	
	public Optional<Tema> findByDescrica1ContainingIgnoreCase (String descrica1);
    
    public Tema findByDescrica1(String descrica1);
}
