package Armas;

import java.util.Random;

import Videojuego.Arma;
import Videojuego.MainVideojuego;

public class Espada extends Arma {

	Random rm = new Random();
	String bono = "";
	int da�ovariable = rm.nextInt(100 * 2);
	int da�ototal = getDa�o() + da�ovariable;
	private int especial = rm.nextInt(100) + 1;

	@Override
	public int da�oAleatorio() {
		da�ototal = getDa�o() + da�ovariable;
		return da�ototal;
	}

	@Override
	public int especial() {
		int hemorragia = especial +da�ototal;
		return hemorragia;
	}

	@Override
	public void usar() {
		da�ototal += getDa�o();
		System.out.println(getTipoataque());
		System.out.println(getEfectosonoro());
		if (da�ototal > 150) {
			System.err.println("Da�o " + da�ototal + " CRITICO!!!");
		} else {
			System.out.println("Da�o " + da�ototal);
		}

	}

	@Override
	public String bonificacion() {

		if (especial > 100) {
			System.err.println("Da�o extra por hemorragia: " + da�ototal+"PH" + " + " + especial + "PH de da�o por sangrado"
					+ " CRITICA!!!");
		} else {
			System.out
					.println("Da�o extra por hemorragia: " + da�ototal+"PH" + " + " + especial + "PH de da�o por sangrado");
		}

		return bono;
	}

}
