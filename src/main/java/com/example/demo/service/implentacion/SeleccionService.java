package com.example.demo.service.implentacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.seleccionEntity;
import com.example.demo.repositorios.SeleccionRepository;
import com.example.demo.service.interfaces.SeleccionServiceInterface;

@Service
public class SeleccionService implements SeleccionServiceInterface {

	@Autowired
	SeleccionRepository seleccionRepository;
	
	@Override
	public List<seleccionEntity> getAllSeleccion() {
	
		return seleccionRepository.findAll();
	}
	
	@Override
	public Optional<seleccionEntity> getSeleccionById(Integer id) {
		
			Optional<seleccionEntity> seleccion=seleccionRepository.findById(id);
			if(seleccion.isPresent()) {
				return seleccion;
			}
			return null;
		}
	
	
	@Override
	public seleccionEntity createSeleccion(seleccionEntity seleccion) {
		return seleccionRepository.save(seleccion);
	}
	
	
	@Override
	public seleccionEntity updateSeleccion(seleccionEntity seleccion) {
		Optional<seleccionEntity>seleccionCurrent=seleccionRepository.findById(seleccion.getId());
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
	
	@Override
	public void deleteSeleccion(Integer id) {
	
		seleccionRepository.deleteById(id);
		
	}

	@Override
	public List<seleccionEntity> listGrupos(String grupo) {
	
		return seleccionRepository.findByGrupo(grupo);
	}
	
	
	
}
