package com.restpersona.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restpersona.modelo.entidad.Persona;
import com.restpersona.modelo.persistencia.DaoPersona;
@Service
public class GestorPersona {
	// En esta parte vamos a crear un servicio rest qu proporcione
	// Un Crud basico de personas a nuestro posibles clientes
	// app android, app ios, app, Java
	@Autowired
	private DaoPersona daopersona;

	public List<Persona> listar() {
		// Aqui podria poner toda la logica de negocio de mi app
		// Ejemplos
		// 1- Puede el usuario consultar las persona
		// 2- tengo que mostrar todas las persona o solo alguna?
		// 3- Authentificacion
		// Todo iria aqui
		// Dao manda lo que le pasas

		List<Persona> lista = daopersona.findAll();
		return lista;
	}

	public Persona obtenerPersona(int id) {

		Optional<Persona> opt = daopersona.findById(id);
		// si no encuentra el optional estaria vacio
		if (opt.isPresent()) {
			return opt.get(); // findbyid() devuelve un optional.
		} else {
			return null;
		}

	}

	/**
	 * 
	 * @param persona es el objeto que vamos a dar de alta en la bbdd
	 * @return la persona dada de alta de la bbdd o null n caso de que el nombre
	 *         tenga menor de 3 caracteres
	 */
	public Persona alta(Persona persona) {
		// podriamos poner toda la logica de la aplicavcion que queramos
		// En caso de que tengamos una regla de negocio de que el nombre
		// tenga que tener al menos 3 caracteres, la pondriamos aqui

		if (persona.getNombre().length() < 3) {
			return null;

		}
		Persona p = daopersona.save(persona);

		return p;

	}

	public Persona modificar(Persona persona) {

		if (persona.getNombre().length() < 3) {
			return null;

		}
		Persona p = daopersona.save(persona);

		return p;
	}

	public boolean borrar(int id) {
		if (daopersona.findById(id).isPresent()) {
			daopersona.deleteById(id);
			return true;
		} else {
			return false;
		}

	}

}
