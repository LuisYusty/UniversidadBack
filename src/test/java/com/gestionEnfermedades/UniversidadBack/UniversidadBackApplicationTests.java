package com.gestionEnfermedades.UniversidadBack;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import com.gestionEnfermedades.model.Estudiante;
import com.gestionEnfermedades.model.TipoIdentificacion;
import com.gestionEnfermedades.model.TipoSangre;
import com.gestionEnfermedades.service.IEstudianteService;

@SpringBootTest
class UniversidadBackApplicationTests {

	// CREAMOS UN CRUD PARA REALIZAR UN TEST de la pueba 2
	@Autowired
	private IEstudianteService serviceEstudiante;

	@Test
	void contextLoads() {

		 //prueba 1
		 // prueba unitaria para verificacion de lombok 
		/*
		  Estudiante estudiante= new Estudiante(); 
		  estudiante.setNombre("Luis");
		  System.out.println(estudiante.getNombre());
		 
        */
		
		
		// REALIZAMOS PRUEBAS UNITARIAS
		// prueba 2 para metodo listar todos, es decir mostrar todos los registros
		 	
		/*List<Estudiante> listaEstudiante = serviceEstudiante.listarTodos();

		for (Estudiante estudiante : listaEstudiante) {
			System.out.println(estudiante.toString());
		}
	    */
		
		// prueba 3 para listar por id, es decir buscar por id
		  /*
		   
		   Estudiante estudiante= serviceEstudiante.listarPorId(1);
		System.out.println(estudiante.toString());
		    */
		 
		
		
		
		/*prueba para registrar prueba 4
		Estudiante estudiante =new Estudiante();
		
		estudiante.setNumeroIdentificacion("9999");
		estudiante.setNombre("canelo");
		estudiante.setApellido("xxxxx");
		estudiante.setFechaNacimiento(LocalDate.now());
		estudiante.setTipoIdentificacion(new TipoIdentificacion(3));
		estudiante.setTipoSangre(new TipoSangre(2));
		serviceEstudiante.registrar(estudiante);
		 * */

		
		// para actualizar prueba 5
		/*
        Estudiante estudiante =new Estudiante();
		estudiante.setId(5);
		estudiante.setNumeroIdentificacion("9999");
		estudiante.setNombre("canelo");
		estudiante.setApellido("rodriguez");
		estudiante.setFechaNacimiento(LocalDate.now());
		estudiante.setTipoIdentificacion(new TipoIdentificacion(3)); // ya que no es un id sino un objeto
		estudiante.setTipoSangre(new TipoSangre(2));
		
		serviceEstudiante.actualizar(estudiante);
		*/
		
		
		// pueba 6 eliminar
		// serviceEstudiante.eliminar(2);;
	
	}

}
