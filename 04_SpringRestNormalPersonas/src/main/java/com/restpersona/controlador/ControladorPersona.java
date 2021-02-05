package com.restpersona.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restpersona.modelo.entidad.Persona;
import com.restpersona.modelo.negocio.GestorPersona;
import com.restpersona.modelo.persistencia.DaoPersona;
//va dar de alta un objeto de tipo controlador persona con capacidad de recibir peticiones

//Dentro de un MVC esta capa se encargaria de recibir la informacion de los clientes traducirla y mandarsela a la capa de negocio para 
//consultar o procesar la peticion
@RestController
public class ControladorPersona {
	@Autowired
	private GestorPersona gp;

	@GetMapping(value = "personas")
	public ResponseEntity<List<Persona>> listar() {

		List<Persona> lista = gp.listar();
		ResponseEntity<List<Persona>> re = new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
		return re;

	}

	// cuando tenemos parte de la url que es variable normalmente un id
	// debemos poner esa parte entre los cocrchetes
	// y para recuperar dicho valor debemos usar la anotacion @PathVariable con el
	// nombre de la vairable
	@GetMapping(value = "personas/{id}")
	public ResponseEntity<Persona> obtener(@PathVariable("id") int id) {

		Persona p = gp.obtenerPersona(id);
		HttpStatus codigoDeRespuesta = null;
		if (p != null) {
			codigoDeRespuesta = HttpStatus.OK;

		} else {
			codigoDeRespuesta = HttpStatus.HTTP_VERSION_NOT_SUPPORTED.NOT_FOUND;
		}

		ResponseEntity<Persona> re = new ResponseEntity<Persona>(p, codigoDeRespuesta);
		return re;

	}
	//Ejemplo meter datos
	//{"nombre":"pepe", "edad": 38, "peso": 80}
	@PostMapping("personas")
	public ResponseEntity<Persona> alta(@RequestBody Persona persona) {
		HttpStatus codigoDeRespuesta = null;
		Persona pAlta = gp.alta(persona);
		if (pAlta != null) {
			codigoDeRespuesta = HttpStatus.CREATED;

		} else {
			codigoDeRespuesta = HttpStatus.BAD_REQUEST;
		}
		ResponseEntity<Persona> re = new ResponseEntity<Persona>(pAlta, codigoDeRespuesta);

		return re;

	}

	@PutMapping(value = "personas/{id}")
	public ResponseEntity<Persona> modificar(@RequestBody Persona persona, @PathVariable("id") int id) {
		persona.setId(id);

		HttpStatus codigoDeRespuesta = null;
		Persona pModificar = gp.modificar(persona);
		if (pModificar != null) {
			codigoDeRespuesta = HttpStatus.OK;

		} else {
			codigoDeRespuesta = HttpStatus.BAD_REQUEST;
		}
		ResponseEntity<Persona> re = new ResponseEntity<Persona>(pModificar, codigoDeRespuesta);

		return re;

	}

	@DeleteMapping("personas/{id}")
	public ResponseEntity<Integer> borrar(@PathVariable("id") int id) {

		boolean borrado = gp.borrar(id);

		HttpStatus codigoRespuesta = null;

		if (borrado) {

			codigoRespuesta = HttpStatus.OK;

		} else {

			codigoRespuesta = HttpStatus.BAD_REQUEST;

		}

		return new ResponseEntity<Integer>(id, codigoRespuesta);

	}
}
