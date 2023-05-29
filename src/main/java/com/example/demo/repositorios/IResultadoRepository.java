package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.resultadoEntity;



public interface IResultadoRepository extends JpaRepository<resultadoEntity, Integer> {

}
