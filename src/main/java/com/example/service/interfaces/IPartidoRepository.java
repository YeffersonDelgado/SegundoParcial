package com.example.service.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.partidoEntity;



public interface IPartidoRepository  extends JpaRepository<partidoEntity, Integer>{
	

}