package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "partido")
public class partidoEntity {
  
	
	@Id
	@SequenceGenerator(name="partido_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "partido_id_seq")
	private Integer id;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name="estadio_id")
	private estadioEntity estadio;
	@JsonIgnore
	@OneToMany(mappedBy = "partido")
	private List<resultadoEntity>resultados;
	
	


	
	

    


}