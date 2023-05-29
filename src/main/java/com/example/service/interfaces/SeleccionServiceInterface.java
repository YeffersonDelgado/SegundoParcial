package com.example.service.interfaces;

import java.util.*;

import com.example.demo.entities.seleccionEntity;


public interface SeleccionServiceInterface {




	
		public List<seleccionEntity> getAllSeleccion();
		
		public seleccionEntity getSeleccionById(seleccionEntity seleccion);
		
		public seleccionEntity createEjercicio(seleccionEntity seleccion);
		
		public seleccionEntity updateEjercicio(seleccionEntity seleccion);
		
		public void deleteSeleccion(Integer id);
	}


