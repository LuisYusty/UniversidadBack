package com.gestionEnfermedades.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionEnfermedades.model.Estudiante;
import com.gestionEnfermedades.service.IEstudianteService;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteRest {

	@Autowired
	private IEstudianteService service;

	@GetMapping("")
	public List<Estudiante> listarTodos() {
		return service.listarTodos();
	}

	@GetMapping("{id}")
	public Estudiante listarPorId(@PathVariable int id) { // @PathVariable indica que el id es el mismo del GetMapping
		return service.listarPorId(id);
	}

	@PostMapping("")
	public void registrar(@RequestBody Estudiante entidad) {

		service.registrar(entidad);
	}

	@PutMapping
	public void actualizar(Estudiante entidad) {
		service.actualizar(entidad);

	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);

	}
}
