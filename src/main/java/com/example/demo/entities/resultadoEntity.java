package com.example.demo.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resultado")
public class resultadoEntity {
   
	
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Otros atributos de la entidad Resultado
    
    private Integer goles;
    private Integer amarillas;
    private Integer rojas;

    @ManyToOne
    @JoinColumn(name = "seleccion_id")
    private seleccionEntity seleccion;

    @ManyToOne
    @JoinColumn(name = "partido_id")
    private partidoEntity partido;
    


  
    
    
}
