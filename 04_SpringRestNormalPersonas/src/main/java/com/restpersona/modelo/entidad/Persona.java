package com.restpersona.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//Todas las aplicacion se empiezan siempre por las entidades, que se pueded
//hacer con javabeans o se pueden hacer como tablas y relaciones de BBDD

@Entity
public class Persona {
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private int edad;
	private double peso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}

}
