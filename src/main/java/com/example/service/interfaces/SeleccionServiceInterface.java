package com.example.service.interfaces;

import java.util.*;

import com.example.demo.entities.seleccionEntity;


public interface SeleccionServiceInterface {

	
		public List<seleccionEntity> getAllSeleccion();
		
		public Optional<seleccionEntity> getSeleccionById(Integer id);
		
		public seleccionEntity createSeleccion(seleccionEntity seleccion);
		
		public seleccionEntity updateSeleccion(seleccionEntity seleccion);
		
		public void deleteSeleccion(Integer id);
	}


