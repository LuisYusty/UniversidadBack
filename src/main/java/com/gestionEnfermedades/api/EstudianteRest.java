package com.gestionEnfermedades.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionEnfermedades.model.Estudiante;
import com.gestionEnfermedades.service.IEstudianteService;


@RestController
@RequestMapping("/api/estudiante")
public class EstudianteRest {
	
	@Autowired
	private IEstudianteService service;

	@GetMapping
	public List <Estudiante>listarTodos() {
		return service.listarTodos();
	}
}
