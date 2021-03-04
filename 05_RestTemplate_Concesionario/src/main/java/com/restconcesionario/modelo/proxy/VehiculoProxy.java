package com.restconcesionario.modelo.proxy;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.restconcesionario.modelo.entidad.Vehiculo;

@Service
public class VehiculoProxy {

	//Constante con la URL del servicio rest al que vamos a acceder
	public static final String URL_VEHICULOS = "http://localhost:8090/vehiculos/";

	public List<Vehiculo> listar(){
		//Este objeto sera el encargado de hacer las peticiones HTTP
		RestTemplate restTemplate = new RestTemplate();

		//Hacemos una peticion GET a la url y decimos que nos parsee el json a la un array de vehiculos
		//El metodo getForEntity hace la peticion a la URL y tambien le decimos a que clase me tiene que 
		//convertir el json resultante
		//Con el siguiente metedo hacemos una peticion get a "http://localhost:8090/vehiculos/"
		ResponseEntity<Vehiculo[]> response = restTemplate.getForEntity(URL_VEHICULOS, Vehiculo[].class);
		
		//Lo que tiene el body es un array de personas, porque el
		//ResponseEntity es un array de personas
		Vehiculo[] arrayVehiculos = response.getBody();
		
		//Convertimos el array de personas a una lista de personas
		List<Vehiculo> lista = Arrays.asList(arrayVehiculos); 
		
		return lista;
	}
	
	public Vehiculo obtener(int id) {
		RestTemplate restTemplate = new RestTemplate();

		String personaResourceUrl = URL_VEHICULOS + id;

		ResponseEntity<Vehiculo> response = restTemplate.getForEntity(personaResourceUrl, Vehiculo.class);
		
		//Esta vez el body solo tendra una persona, no una lista
		return response.getBody();
	}
	
	public Vehiculo alta(Vehiculo vehiculo) {
		RestTemplate restTemplate = new RestTemplate();

		// Crear un objeto HttpEntity que sera el encargado de
		// rellenar en el body del mensaje Http la entidad que le digamos
		// en este caso, una vehiculo
		HttpEntity<Vehiculo> requestBody = new HttpEntity<>(vehiculo);

		// Enviamos la peticion HTTP por POST con el metodo postForObject
		Vehiculo vehiculoCreado = restTemplate.postForObject(URL_VEHICULOS, requestBody, Vehiculo.class);

		return vehiculoCreado;
	}
	
	public Vehiculo modificar(Vehiculo vehiculo) {
		RestTemplate restTemplate = new RestTemplate();

		// Crear un objeto HttpEntity que sera el encargado de
		// rellenar en el body del mensaje Http la entidad que le digamos
		// en este caso, una vehiculo
		HttpEntity<Vehiculo> requestBody = new HttpEntity<>(vehiculo);

		// Enviamos la peticion HTTP por PUT con el metodo exchange
		ResponseEntity<Vehiculo> response = 
				restTemplate.exchange(URL_VEHICULOS + vehiculo.getId(), 
						HttpMethod.PUT, 
						requestBody, 
						Vehiculo.class);
 
		return response.getBody();
	}
	
	public void borrar(int id) {
		RestTemplate restTemplate = new RestTemplate();
		 
        // Send request with DELETE method.
        restTemplate.delete(URL_VEHICULOS + id);
	}
	
}
