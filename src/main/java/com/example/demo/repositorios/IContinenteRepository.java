package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.continenteEntity;


public interface IContinenteRepository  extends JpaRepository<continenteEntity, Integer>{

}
