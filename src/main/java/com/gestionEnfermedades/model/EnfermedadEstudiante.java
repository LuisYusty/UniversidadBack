package com.gestionEnfermedades.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "enfermedad_estudiante")
public class EnfermedadEstudiante {
	
	//atributos
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne // deberia ser oneToMany?
	@JoinColumn(name = "id_estudiante", nullable = false)
	private Estudiante estudiante; // nombre atributo en java
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "observacion")
	private String observacion;



}
