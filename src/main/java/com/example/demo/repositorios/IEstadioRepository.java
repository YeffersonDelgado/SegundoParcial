package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.estadioEntity;



public interface IEstadioRepository extends JpaRepository<estadioEntity, Integer> {

}
