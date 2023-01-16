package com.gestionEnfermedades.service;

import java.util.List;

// La interfaz nos ayuda reutulizar codigo en los cruds
//nos ayuda a indicar cuales son los metodos de los cruds

// ESTAS SON LAS INTERFACES y sirven para crear un servicio de cada modelo

public interface ICrudService <T>{ // interfaz generica ,T tipo de dato cualquiera
	
	
	// metodos que todo CRUD debe llevar, se agrega uno ya que es generico
	public List<T> listarTodos(); // ya que es una interfaz generica creamos este metodo

	public T listarPorId(int id);

	public void registrar(T entidad);

	public void actualizar(T entidad);

	public void eliminar(int id);
	
}
