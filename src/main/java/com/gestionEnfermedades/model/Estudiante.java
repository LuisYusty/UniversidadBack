package com.gestionEnfermedades.model;

import java.time.LocalDate;

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
@Table(name = "estudiante")
public class Estudiante {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	
	@Column (name = "numero_identificacion",nullable = false)
	private String numero_identificacion;
	
	@Column(name = "nombre",nullable = false)
	private String nombre;
	
	@Column(name = "apellido",nullable = false)
	private String apellido;
	
	@Column(name = "fecha_nacimiento",nullable = false)
	private LocalDate fecha_nacimiento;
	
	
	@ManyToOne  //muchas enfermedades puede tener 1 estudiante
	@JoinColumn(name = "id_tipo_identificacion", nullable = false)
	private TipoIdentificacion TipoIdentificacion ; //ya que es un FK se usa el nombre de la clase como el tipo de dato
	
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_sangre", nullable = false)
	private TipoSangre TipoSangre;

	
}
