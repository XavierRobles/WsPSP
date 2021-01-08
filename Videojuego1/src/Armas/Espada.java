package Armas;

import java.util.Random;

import Videojuego.Arma;
import Videojuego.MainVideojuego;

public class Espada extends Arma {

	Random rm = new Random();
	String bono = "";
	int dañovariable = rm.nextInt(100 * 2);
	int dañototal = getDaño() + dañovariable;
	private int especial = rm.nextInt(100) + 1;

	@Override
	public int dañoAleatorio() {
		dañototal = getDaño() + dañovariable;
		return dañototal;
	}

	@Override
	public int especial() {
		int hemorragia = especial +dañototal;
		return hemorragia;
	}

	@Override
	public void usar() {
		dañototal += getDaño();
		System.out.println(getTipoataque());
		System.out.println(getEfectosonoro());
		if (dañototal > 150) {
			System.err.println("Daño " + dañototal + " CRITICO!!!");
		} else {
			System.out.println("Daño " + dañototal);
		}

	}

	@Override
	public String bonificacion() {

		if (especial > 100) {
			System.err.println("Daño extra por hemorragia: " + dañototal+"PH" + " + " + especial + "PH de daño por sangrado"
					+ " CRITICA!!!");
		} else {
			System.out
					.println("Daño extra por hemorragia: " + dañototal+"PH" + " + " + especial + "PH de daño por sangrado");
		}

		return bono;
	}

}
