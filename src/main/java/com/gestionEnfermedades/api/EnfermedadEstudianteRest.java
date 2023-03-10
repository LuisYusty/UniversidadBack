package com.gestionEnfermedades.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionEnfermedades.model.EnfermedadEstudiante;
import com.gestionEnfermedades.service.IEnfermedadEstudianteService;


@RestController
@RequestMapping("/api/enfermedad-estudiante")
public class EnfermedadEstudianteRest {
	
	@Autowired
	private IEnfermedadEstudianteService service;
	
	@GetMapping("")
	public List<EnfermedadEstudiante> listarTodos(){
		
		return service.listarTodos();
		
	}
	
	@PostMapping("")
	public void registrar(@RequestBody EnfermedadEstudiante entidad) {
		service.registrar(entidad);
		
	}
	

}
