package com.uem.restbasicoJuego.controlador;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uem.restbasicoJuego.entidad.Videojuego;
@RestController
public class ControlVideojuego {

	
	Videojuego v = new Videojuego();
		private int precio = 30;

		@GetMapping("videojuego")
		public int obtenerMensaje() {
			
			return precio;
		}
	
	
		
		// podemos mapear todos los recursos que queramos

		@GetMapping(value = "juegoHTML", produces = "text/html")
		public String obtenerMensajeHTML() {
			StringBuffer buffer = new StringBuffer();
			v.setId(1);
			v.setNombre("GTA-V");
			v.setPrecio(precio);
			v.setCompañia("Rockstar");
			buffer.append("<!DOCTYPE html>");
			buffer.append("<html>");
			buffer.append("<head>");
			buffer.append("<title> Prueba Videojuego</title>");
			buffer.append("</head>");
			buffer.append("<body>");
			buffer.append("<h1> Videojuego </h1>");
			buffer.append("<img src='https://images-na.ssl-images-amazon.com/images/I/81Ow0EK3azL._AC_SL1500_.jpg'  style='width: 200px; height: 277px;'></img>");
			buffer.append("<h1>ID: "+v.getId()+"</h1>");
			buffer.append("<h1>Nombre: "+v.getNombre()+"</h1>");
			buffer.append("<h1>Compañia: "+v.getCompañia()+"</h1>");	
			buffer.append("<h1>Precio: "+v.getPrecio()+"$</h1>");
			buffer.append("</body>");
			buffer.append("</html>");
			return buffer.toString();
		}

		@GetMapping("juego")
		public Videojuego obtenerJuego() {
			v.setId(1);
			v.setNombre("GTA-V");
			v.setCompañia("Rockstar");
			
			
			return v;

		}
		@PutMapping("videojuego")
		public String modificarMensaje() {
			 precio = v.getPrecio()+10;
					return "Precio aumentado en 10€";
		}
	
	
}
