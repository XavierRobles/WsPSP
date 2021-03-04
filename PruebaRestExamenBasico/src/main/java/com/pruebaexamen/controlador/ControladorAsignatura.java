package com.pruebaexamen.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.pruebaexamen.modelo.entidad.Asignatura;
import com.pruebaexamen.modelo.negocio.GestorAsignaturas;

@RestController
public class ControladorAsignatura {
	
	@Autowired
	private GestorAsignaturas ga;
	
	
	@GetMapping("asignaturas")
	public ResponseEntity<List<Asignatura>> listar(){
		HttpStatus codigoRespuesta = null;
		System.out.println("Entrando por get (listar)");
		List<Asignatura> lista = ga.listar();	
		
		if(lista != null) {
			codigoRespuesta = HttpStatus.OK;
		}else {
			codigoRespuesta = HttpStatus.NOT_FOUND;
		}
		ResponseEntity<List<Asignatura>> re = 
				new ResponseEntity<List<Asignatura>>(lista, codigoRespuesta);	
		return re;
	}
	
	@PostMapping("asignaturas")
	public ResponseEntity<Asignatura> alta(@RequestBody Asignatura asignatura){
		System.out.println("Entrando por post");
		Asignatura aAlta = ga.alta(asignatura);
		HttpStatus codigoRespuesta = null;
		if(aAlta != null) {
			codigoRespuesta = HttpStatus.CREATED;
		}else {
			codigoRespuesta = HttpStatus.BAD_REQUEST;
		}
		
		ResponseEntity<Asignatura> re = 
				new ResponseEntity<Asignatura>(aAlta, codigoRespuesta);
		return re;
	}
	
	
}
