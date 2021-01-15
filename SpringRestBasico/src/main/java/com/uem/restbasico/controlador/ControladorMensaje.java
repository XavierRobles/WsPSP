package com.uem.restbasico.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uem.restbasico.entidad.Persona;

//Esta clase servira como punto de entra de nuestro servicio REST
//Para elllo debemos de crear un objeto gestionado por spring para que reciba las peticiones
//para de alta un objeto utilizaremos la siguiente anotacion, 
@RestController
public class ControladorMensaje {
	private String mensaje = "Esto es un mensaje de prueba";
	// Los metodos de esta clase, gracias a la anotacion restcontroller, nos
	// servirar para recibit peticion http
	// de nuestro clientes(Que puede ser perfectamente de un navegador Web)

	// podemos mapear todos los recursos que queramos con el método http que

	// queramos tambie. Dentro de la etiqueta podemos poner el parámetro "produces"

	// que le estaremos indicando el mime type que tenemos que poner en nuestra

	// cabecera "content-type" de nuestro http response, y que sera leido por
	// nuestro

	// cliente e intrepretado a su manera.

	// si ponemos el mime type como "text/html" entonces el navegador leera el

	// body como un html, y si ponemos "text/plain" entonces lo interpretará como

	// un texto plano
	@GetMapping("mensaje")
	public String obtenerMensaje() {
		return mensaje;
	}

	// podemos mapear todos los recursos que queramos

	@GetMapping(value = "mensajeHTML", produces = "text/html")
	public String obtenerMensajeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<!DOCTYPE html>");
		buffer.append("<html>");
		buffer.append("<head>");
		buffer.append("<title> Prueba html</title>");
		buffer.append("</head>");
		buffer.append("<body>");
		buffer.append("<h1> Esto seria un mensaje en html</h1>");
		buffer.append("</body>");
		buffer.append("</html>");
		return buffer.toString();
	}

	@GetMapping("persona")
	public Persona obtenerPersona() {
		Persona p = new Persona();
		p.setNombre("Xavier");
		p.setEdad(38);
		return p;

	}
	@PutMapping("mensaje")
	public String modificarMensaje() {
		mensaje = "He modificado el mensaje";
				return "ok";
	}

}
