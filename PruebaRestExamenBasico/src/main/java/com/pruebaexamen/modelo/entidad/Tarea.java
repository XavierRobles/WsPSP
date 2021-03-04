package com.pruebaexamen.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;

@Entity
@Scope("prototype")
public class Tarea {
	@Id
	@GeneratedValue
	private int id;
	private String Nombre;
	private String fecha;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Tarea [id=" + id + ", Nombre=" + Nombre + ", fecha=" + fecha + "]";
	}

}
