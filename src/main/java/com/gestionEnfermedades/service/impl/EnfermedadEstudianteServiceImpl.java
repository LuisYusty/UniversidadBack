package com.gestionEnfermedades.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestionEnfermedades.model.EnfermedadEstudiante;
import com.gestionEnfermedades.repository.IEnfermedadEstudianteRepository;
import com.gestionEnfermedades.service.IEnfermedadEstudianteService;

// implementamos cada servicio que tengamos
// creamos una clase

@Service  // esto indica que es la implementacion de un servicio y hacer la inyeccion de dependencias en otro lugar
public class EnfermedadEstudianteServiceImpl implements IEnfermedadEstudianteService{
	
	
	// comenzamos a hacer uso de la inyeccion de dependencias
	
	
	@Autowired  // busca la implementacion de la interfaz que el framewok ya lo hizo
	            // INSTANCIAMOS EL REPOSITORIO
 
	private IEnfermedadEstudianteRepository repo; //instaciamos el repositorio pero es necesario hacer la inyeccion de dependencias
	
	
	
	// implementados los metodos que heredamos del CRUD

	@Override
	public List<EnfermedadEstudiante> listarTodos() {

		return repo.findAll(); // hace un selec*from para retornar lo de la tabla 
	}

	@Override
	public EnfermedadEstudiante listarPorId(int id) {

		return repo.findById(id).orElse(null); // listamos por Id, hacer una consulta
	}

	@Override
	public void registrar(EnfermedadEstudiante entidad) {
		repo.save(entidad); // el .save sirve para registrar y actualizar

	}

	@Override
	public void actualizar(EnfermedadEstudiante entidad) {
		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}
	
	// YA ESTÁ HECHO EL CRUD DE LA TABLA ESTUDIANTE
	
}
