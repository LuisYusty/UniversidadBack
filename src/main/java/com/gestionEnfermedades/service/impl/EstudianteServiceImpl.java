package com.gestionEnfermedades.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestionEnfermedades.model.Estudiante;
import com.gestionEnfermedades.repository.IEstudianteRepository;
import com.gestionEnfermedades.service.IEstudianteService;


@Service
public class EstudianteServiceImpl implements IEstudianteService{

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Estudiante entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
