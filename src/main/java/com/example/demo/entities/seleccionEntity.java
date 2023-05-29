package com.example.demo.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "seleccion")
public class seleccionEntity {

		


	@Id
	@SequenceGenerator(name="seleccion_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seleccion_id_seq")
	private Integer id;
	private String nombre;
	@ManyToOne
	@JoinColumn(name="continente_id")
	private continenteEntity continente;
	private String grupo;

		
	}
	

