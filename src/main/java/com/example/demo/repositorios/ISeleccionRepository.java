package com.example.demo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.seleccionEntity;


public interface ISeleccionRepository extends JpaRepository<seleccionEntity, Integer> {
	
	public List<seleccionEntity>findByGrupo(String grupo);

}
