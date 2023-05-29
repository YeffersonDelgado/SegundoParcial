package com.example.service.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.resultadoEntity;



public interface IResultadoRepository extends JpaRepository<resultadoEntity, Integer> {

}
