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


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNumero_identificacion() {
		return numero_identificacion;
	}


	public void setNumero_identificacion(String numero_identificacion) {
		this.numero_identificacion = numero_identificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public TipoIdentificacion getTipoIdentificacion() {
		return TipoIdentificacion;
	}


	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		TipoIdentificacion = tipoIdentificacion;
	}


	public TipoSangre getTipoSangre() {
		return TipoSangre;
	}


	public void setTipoSangre(TipoSangre tipoSangre) {
		TipoSangre = tipoSangre;
	}
	
	
	
	
}
