package com.gestionEnfermedades.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionEnfermedades.model.Estudiante;
import com.gestionEnfermedades.repository.IEstudianteRepository;
import com.gestionEnfermedades.service.IEstudianteService;


@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepository repo;

	@Override
	public List<Estudiante> listarTodos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Estudiante listarPorId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(Estudiante entidad) {
		repo.save(entidad);
		
	}

	@Override
	public void actualizar(Estudiante entidad) {
		repo.save(entidad);
		
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
		
	}
	
	
}
