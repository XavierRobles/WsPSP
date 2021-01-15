package com.uem.restbasicoJuego.controlador;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uem.restbasicoJuego.entidad.Videojuego;
@RestController
public class ControlVideojuego {

	
	
		private String precio = "30€";

		@GetMapping("videojuego")
		public String obtenerMensaje() {
			
			return precio;
		}

		// podemos mapear todos los recursos que queramos

		@GetMapping(value = "juegoHTML", produces = "text/html")
		public String obtenerMensajeHTML() {
			StringBuffer buffer = new StringBuffer();
			buffer.append("<!DOCTYPE html>");
			buffer.append("<html>");
			buffer.append("<head>");
			buffer.append("<title> Prueba Videojuego</title>");
			buffer.append("</head>");
			buffer.append("<body>");
			buffer.append("<h1> Videojuego </h1>");
			buffer.append("<img src='https://images-na.ssl-images-amazon.com/images/I/81Ow0EK3azL._AC_SL1500_.jpg'  style='width: 200px; height: 277px;'></img>");
			buffer.append("<h1>"+precio+"<h1>");
			buffer.append("</body>");
			buffer.append("</html>");
			return buffer.toString();
		}

		@GetMapping("juego")
		public Videojuego obtenerJuego() {
			Videojuego v = new Videojuego();
			v.setId(1);
			v.setNombre("GTA-V");
			v.setCompañia("Rockstar");
			v.setPrecio(30);
			
			return v;

		}
		@PutMapping("videojuego")
		public String modificarMensaje() {
			precio = "50€";
					return "Precio aumentado";
		}
	
	
}
