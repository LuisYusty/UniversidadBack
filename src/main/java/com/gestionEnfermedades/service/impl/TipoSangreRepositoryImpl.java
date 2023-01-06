package com.gestionEnfermedades.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionEnfermedades.model.TipoSangre;
import com.gestionEnfermedades.repository.ITipoSangreRepository;
import com.gestionEnfermedades.service.ITipoSangre;

@Service
public class TipoSangreRepositoryImpl  implements ITipoSangre{

	@Autowired
	private ITipoSangreRepository repo;

	@Override
	public List<TipoSangre> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoSangre listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrar(TipoSangre entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(TipoSangre entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
