package Videojuego;

public abstract class Personaje {
	
	private String nombre, rol, fraseataque;
	private int salud, mana;
	private Arma arma;
	
	public abstract void Atacar(Personaje nombre);	
	
	public String getFraseataque() {
		return fraseataque;
	}

	public void setFraseataque(String fraseataque) {
		this.fraseataque = fraseataque;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	

}
