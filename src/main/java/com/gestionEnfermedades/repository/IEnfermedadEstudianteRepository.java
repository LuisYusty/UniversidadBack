package com.gestionEnfermedades.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionEnfermedades.model.EnfermedadEstudiante;

// creamos una interfaz para cada modelo, es decir para HEREDAR EL CRUD que nos ofrece el framework de spring
// es decir, cada modelo tiene su CRUD heredado de la clase JpaRepository

// para crar un reposotorio se usa la interfaz


// la interfaz lleva el mismo nombre de la clase con I y Repository

// heredamos de la clase JpaRepository e indicamos el modelo y el tipo de dato de la PK de ese modelo


@Repository
public interface IEnfermedadEstudianteRepository extends JpaRepository<EnfermedadEstudiante, Integer>  {

}

// cada modelo tiene un repositorio y cada repositorio funciona para herar un CRUD DE Jpareposotry 
//y esto para ralizar consultas personalizadas cuando sea necesario