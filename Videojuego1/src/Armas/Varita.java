package Armas;

import java.util.Random;

import Videojuego.Arma;

public class Varita extends Arma {

	Random rm = new Random();
	String bono = "";
	int dañoVariable = rm.nextInt(100 * 2);
	int dañototal = getDaño() + dañoVariable;
	private int especial = rm.nextInt(100) + 1;

	@Override
	public int dañoAleatorio() {
		dañototal = getDaño() + dañoVariable;
		return dañototal;
	}

	@Override
	public void usar() {
		dañototal += getDaño();
		System.out.println(getTipoataque());
		System.out.println(getEfectosonoro());
		if (dañototal > 100) {
			System.err.println("Daño " + dañototal + " CRITICO!!!");
		} else {
			System.out.println("Daño " + dañototal);
		}

	}

	@Override
	public int especial() {
		int fuego = especial;
		return fuego;

	}

	@Override
	public String bonificacion() {
		if (especial > 60) {
			System.err.println("El hechizo provoca un incendio achicharrando a todos"+" + " + especial +"PH" + " por quemaduras CRITICAS!!!");
		} else {
			System.out.println("El hechizo provoca un incendio achicharrando a todos"+" + " + especial +"PH" + " por quemaduras");
		}
		return bono;
	}

}
