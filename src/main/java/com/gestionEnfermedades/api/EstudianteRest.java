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

	@GetMapping("{id}") // sigue el id despues del @RequestMapping
	public Estudiante listarPorId(@PathVariable int id) { // @PathVariable indica que el id es el mismo del GetMapping
		return service.listarPorId(id);
	}

	@PostMapping("")
	public void registrar(@RequestBody Estudiante entidad) {

		service.registrar(entidad);
	}

	@PutMapping("")
	public void actualizar(@RequestBody Estudiante entidad) {
		service.actualizar(entidad);

	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);

	}
	
	
}


/*
 PARA PRUEBA DE POST EN POSTMAN PARA REGISTRAR
 
 { 
"numeroIdentificacion":"7772",
"nombre":"tina",
"apellido":"cardoso",
"fechaNacimiento":"2022-01-17",
"tipoIdentificacion":{
    "id":3
},
"tipoSangre":{
    "id":1
}

} 

*/

/* PRUEBA PARA ACTUALIZAR usamos el PUT
 
   { 
"id:1",   
"numeroIdentificacion":"7772",
"nombre":"tina",
"apellido":"cardoso",
"fechaNacimiento":"2022-01-17",
"tipoIdentificacion":{
    "id":3
},
"tipoSangre":{
    "id":1
}

} 
  
 */


/*
 PRUEBA PARA ELIMINAR inidacmos la peticion o verbo delete, indicamos la direccion y un /+id que queremos eliminar
 localhost:8282/api/estudiante/4
 
  */

/*
 para buscar cambiamos la perticiion a GET /+id que queremos buscar
  */



