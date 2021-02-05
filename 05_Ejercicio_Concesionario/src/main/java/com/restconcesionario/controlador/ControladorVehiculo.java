package com.restconcesionario.controlador;

import java.util.List;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restconcesionario.modelo.entidad.Vehiculo;
import com.restconcesionario.modelo.negocio.GestorVehiculo;

@RestController
public class ControladorVehiculo {
	@Autowired
	private GestorVehiculo gv;

	@GetMapping(value = "vehiculos")
	public ResponseEntity<List<Vehiculo>> listarVeiculos() {
		List<Vehiculo> listavehiculos = gv.listarVehiculos();

		ResponseEntity<List<Vehiculo>> respuesta = new ResponseEntity<List<Vehiculo>>(listavehiculos, HttpStatus.OK);
		return respuesta;

	}

	@GetMapping(value = "vehiculos/{id}")
	public ResponseEntity<Vehiculo> obtenerVehiculo(@PathVariable("id") int id) {
		Vehiculo v = gv.obtenerVehiculo(id);
		HttpStatus codigoRespuesta = null;
		if (v != null) {
			codigoRespuesta = HttpStatus.OK;
		} else {
			codigoRespuesta = HttpStatus.HTTP_VERSION_NOT_SUPPORTED.NOT_FOUND;
		}
		ResponseEntity<Vehiculo> respuesta = new ResponseEntity<Vehiculo>(v, codigoRespuesta);
		return respuesta;
	}

	@PostMapping("vehiculos")
	public ResponseEntity<Vehiculo> altaVehiculo(@RequestBody Vehiculo vehiculo) {
		HttpStatus codigoRespuesta = null;
		if (vehiculo.getPotencia() >= 0) {

			Vehiculo vehiculoAlta = gv.altaVehiculo(vehiculo);
			if (vehiculoAlta != null)
				codigoRespuesta = HttpStatus.CREATED;

			else {
				codigoRespuesta = HttpStatus.BAD_REQUEST;
			}

			ResponseEntity<Vehiculo> respuesta = new ResponseEntity<Vehiculo>(vehiculoAlta, codigoRespuesta);
			return respuesta;
		} else {

			codigoRespuesta = HttpStatus.BAD_REQUEST;
			ResponseEntity<Vehiculo> respuesta = new ResponseEntity<Vehiculo>(codigoRespuesta);
			return respuesta;
		}
	}

	@PutMapping(value = "vehiculos/{id}")
	public ResponseEntity<Vehiculo> modificarVehiculo(@RequestBody Vehiculo vehiculo, @PathVariable("id") int id) {
		HttpStatus codigoRespuesta = null;
		vehiculo.setId(id);
		if (vehiculo.getPotencia() >= 0) {
			System.err.println("llega");
			Vehiculo vehiculoModificado = gv.modificarVehiculo(vehiculo);
			if (vehiculoModificado != null)
				codigoRespuesta = HttpStatus.OK;

			else {
				codigoRespuesta = HttpStatus.BAD_REQUEST;
			}
			ResponseEntity<Vehiculo> respuesta = new ResponseEntity<Vehiculo>(codigoRespuesta);
			return respuesta;
		} else {
			codigoRespuesta = HttpStatus.BAD_REQUEST;
			ResponseEntity<Vehiculo> respuesta = new ResponseEntity<Vehiculo>(codigoRespuesta);
			return respuesta;
		}
	}

	public ResponseEntity<Integer> borrarVehiculo(@PathVariable("id") int id) {
		boolean borrarVehiculo = gv.borraVehiculo(id);
		HttpStatus codigoRespuesta = null;
		if (borrarVehiculo) {
			codigoRespuesta = HttpStatus.OK;

		} else {
			codigoRespuesta = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<Integer>(id, codigoRespuesta);
	}
}
