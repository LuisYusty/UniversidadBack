package com.gestionEnfermedades.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gestionEnfermedades.model.TipoIdentificacion;
import com.gestionEnfermedades.service.ITipoIdentificacionService;

// re usa la notacion Rest para saber que es un servicio


@RestController // para que sepa que se va a trabajar con servicios web restfull
@RequestMapping ("/api/tipo-identificacion")// para identificar la clase  la de abajo :v y acceder mediante url
                                            //

public class TipoIdentificacionRest {

	// aqui ponemos los servicios o servicios web que queremos exponer, pero primero instaciamos
	// el servicio
	
	@Autowired
	private ITipoIdentificacionService service; // instanciamos el servicio que vamos a usar
	
	
	@GetMapping("")  // get para obtener la lista de TipoIdentificacion
	public List<TipoIdentificacion> listarTodos(){
		return service.listarTodos();
	}

	
}
