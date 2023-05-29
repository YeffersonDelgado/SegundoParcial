package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.seleccionEntity;
import com.example.service.implentacion.SeleccionService;

@RestController
@RequestMapping("/selecciones")
public class SeleccionController {
	
	@Autowired
	SeleccionService seleccionService;
	
	@GetMapping("/listar")
	public List<seleccionEntity> ListSeleccion(){
	
		return seleccionService.getAllSeleccion();
	}
	
	
	@GetMapping("/{id}")
    public seleccionEntity getEjercicio(@PathVariable Integer id)  {
   
        return seleccionService.getAllSeleccion().get(id);
        
	}
	
	
	@PostMapping("/save")
	public seleccionEntity saveEjercicio(@RequestBody seleccionEntity seleccion) {
	  
	    return seleccionService.createSeleccion(seleccion);
	}
	
	@PutMapping("/update")
	public seleccionEntity updateSeleccion(@RequestBody seleccionEntity seleccion) {
	
		return seleccionService.updateSeleccion(seleccion);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void deleteEjercicio(@PathVariable Integer id) {
	 seleccionService.deleteSeleccion(id);
	}
	


}

