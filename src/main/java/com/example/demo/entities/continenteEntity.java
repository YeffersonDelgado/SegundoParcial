package com.example.demo.entities;


import lombok.Data;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;




@Data
@Entity
@Table (name = "continente")
public class continenteEntity{
	@Id
	@SequenceGenerator(name="continente_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "continente_id_seq")
	private Integer id;
	private String nombre;

}
