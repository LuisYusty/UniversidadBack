package com.gestionEnfermedades.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
// Esto es un mapero, es decir que le decimos a hibernet que esta clase hace referencia a la tabla tipo de identificacion
// y cada uno de los atributos como se llama en la BD

@Data
@Entity // indicamos que es una entidad
@Table(name = "tipo_identificacion") // indicamos a cual tabla hace referencia

public class TipoIdentificacion {
	
	// creamos los atributos
	
	// con estas 3 lineas estamos mapeando el atributo Id
	
	@Id   // indicamos que es una PK, se mapea de manera diferente
	@GeneratedValue(strategy =GenerationType.IDENTITY ) // le decimos que es una Id incrementable con el .IDENTITY
	private int id;
	
	
	@Column (name = "nombre",nullable = false) //le indicamos el nombre de la columna y que es notnull
	private String nombre;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	//Hemos terminado el mapeo de la tabla tipo_identificacion
	
	
	
	//HAGREGAMOS ESTO PARA PRUEBA UNITARIA NUMERO 4
	public  TipoIdentificacion() {
		
	}
	
    public  TipoIdentificacion(int id) {
    this.id=id;		
	}
	
	
	
	
	
	
	
	
	
	// esto no sirve porque usamos lombok, sin embargo se deja comentado como guia
	// AHORA CREAMOS LOS SETTERS Y GETTERS 

	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	*/
	
	
	
}
