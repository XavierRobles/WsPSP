package Armas;

import java.util.Random;

import Videojuego.Arma;

public class Varita extends Arma {

	Random rm = new Random();
	String bono = "";
	int da�oVariable = rm.nextInt(100 * 2);
	int da�ototal = getDa�o() + da�oVariable;
	private int especial = rm.nextInt(100) + 1;

	@Override
	public int da�oAleatorio() {
		da�ototal = getDa�o() + da�oVariable;
		return da�ototal;
	}

	@Override
	public void usar() {
		da�ototal += getDa�o();
		System.out.println(getTipoataque());
		System.out.println(getEfectosonoro());
		if (da�ototal > 100) {
			System.err.println("Da�o " + da�ototal + " CRITICO!!!");
		} else {
			System.out.println("Da�o " + da�ototal);
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
