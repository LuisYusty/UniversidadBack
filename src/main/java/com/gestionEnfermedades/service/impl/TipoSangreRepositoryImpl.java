package com.gestionEnfermedades.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionEnfermedades.model.TipoSangre;
import com.gestionEnfermedades.repository.ITipoSangreRepository;
import com.gestionEnfermedades.service.ITipoSangreService;

@Service
public class TipoSangreRepositoryImpl  implements ITipoSangreService{

	@Autowired
	private ITipoSangreRepository repo;

	@Override
	public List<TipoSangre> listarTodos() {
		
		return repo.findAll();
	}

	@Override
	public TipoSangre listarPorId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(TipoSangre entidad) {
		repo.save(entidad);
		
	}

	@Override
	public void actualizar(TipoSangre entidad) {
		repo.save(entidad);
		
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
		
	}
	
	
}
