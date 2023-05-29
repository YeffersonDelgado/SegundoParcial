package com.example.service.implentacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.seleccionEntity;
import com.example.demo.repositorios.SeleccionRepository;
import com.example.service.interfaces.SeleccionServiceInterface;

@Service
public class SeleccionService {

	@Autowired
	SeleccionRepository seleccionRepository;
	
	@GetMapping
	public List<seleccionEntity> lista(){
		return seleccionRepository.findAll();
	}
	@GetMapping("/{id}")
	public Optional<seleccionEntity> findSeleccionById(@PathVariable Integer id){
		Optional<seleccionEntity>seleccion=seleccionRepository.findById(id);
		if(seleccion.isPresent()) {
			return seleccion;
		}
		return null;
		
	}
	
	@Override
	public List<seleccionEntity> seleccionByGrupo(seleccionEntity seleccion){
		
		return SeleccionServiceInterface.(seleccion);
	}
	
	@PostMapping
	public seleccionEntity postSeleccion(@RequestBody seleccionEntity seleccion) {
		seleccionRepository.save(seleccion);
		return seleccion;
	}
	
	
	@PutMapping
	public seleccionEntity updateSeleccion(@PathVariable Integer id,@RequestBody seleccionEntity seleccion) {
		Optional<seleccionEntity>seleccionCurrent=seleccionRepository.findById(id);
		if(seleccionCurrent.isPresent()) {
			seleccionEntity seleccionReturn =seleccionCurrent.get();
			seleccionReturn.setNombre(seleccion.getNombre());
			seleccionReturn.setContinente(seleccion.getContinente());
			seleccionReturn.setGrupo(seleccion.getGrupo());
			seleccionRepository.save(seleccionReturn);
			return seleccionReturn;
		}
		return null;
	}
	@DeleteMapping("/{id}")
	public seleccionEntity deleteSeleccion(@PathVariable Integer id ) {
		Optional<seleccionEntity>seleccion=seleccionRepository.findById(id);
		if(seleccion.isPresent()) {
			seleccionRepository.deleteById(id);
			return seleccion.get();
		}
		return null;
	}
	
}
