package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entities.continenteEntity;
import com.example.demo.entities.seleccionEntity;
import com.example.demo.service.implentacion.SeleccionService;


@Controller
@RequestMapping("/selecciones")
public class SeleccionControllerT {
	
	@Autowired
	SeleccionService seleccionService;
	
	
	@GetMapping("/listar")
	public String listarSelecciones(Model model) {
		List<seleccionEntity> seleccion = seleccionService.getAllSeleccion();
		for(seleccionEntity selecciones : seleccion) {
			System.out.println(selecciones.getNombre());
		}
		model.addAttribute("selecciones", seleccion);
		return "seleccionListar";
	}
	
	
	/**@GetMapping("/obtener/{id}")
    public String getSeleccion(@PathVariable Integer id, seleccionEntity seleccionEntity, Model model)  {
   
		seleccionEntity seleccion = seleccionService.getSeleccionById(seleccionEntity.getId()).orElse(null);
		model.addAttribute("seleccionEntity", seleccion);
		
        return "seleccionMostrar";
        
	}*/
	
	@GetMapping("/registrar")
	public String registrarMiembro(seleccionEntity seleccion) {
		return "SeleccionRegistrar";
	} 
	
	@PostMapping("/registrar")
	public String procesarRegistroEjercicio(@Validated seleccionEntity seleccion, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "seleccionRegistrar";
		}
		seleccionService.createSeleccion(seleccion);
		return "redirect:/selecciones/listar";
	}
	
	
	
	@GetMapping("/editar/{id}")
	public String editarSeleccion(seleccionEntity seleccionEntity, Model model) {
		seleccionEntity seleccion = seleccionService.getSeleccionById(seleccionEntity.getId()).orElse(null);
		System.out.println(seleccion.getNombre() + " editable");
		model.addAttribute("seleccionEntity", seleccion);
		return "seleccionEditar";
	}
	
	@PostMapping("/editar/{id}")
	public String procesarMiembroEditar(@PathVariable("id") Integer id, seleccionEntity seleccionEntity) {
		seleccionEntity.setId(id);
		seleccionService.createSeleccion(seleccionEntity);
		return "redirect:/selecciones/listar";
	}
	
	
	
	@GetMapping("/eliminar/{id}")
	public String eliminarMiembro(@PathVariable("id") Integer id) {
		seleccionService.deleteSeleccion(id);
		return "redirect:/selecciones/listar";
	}
	
	@GetMapping("/grupo/{grupo}")
	public List<seleccionEntity> getGrupo(@PathVariable String grupo){
		
		return seleccionService.listGrupos(grupo);
	}

	
	/**
	@PostMapping
	public seleccionEntity saveEjercicio(@RequestBody seleccionEntity seleccion) {
	  
	    return seleccionService.createSeleccion(seleccion);
	}
	
	@PutMapping("/update")
	public seleccionEntity updateSeleccion(@RequestBody seleccionEntity seleccion) {
	
		return seleccionService.updateSeleccion(seleccion);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteEjercicio(@PathVariable Integer id) {
	 seleccionService.deleteSeleccion(id);
	}*/
	
	

}
