package Armas;

import java.util.Random;

import Videojuego.Arma;

public class Arco extends Arma {

	Random rm = new Random();
	String bono = "";
	int dañovariable = rm.nextInt(100 * 1);
	int dañototal = getDaño() + dañovariable;
	private int especial;

	@Override
	public int dañoAleatorio() {
		dañototal = getDaño() + dañovariable;
		return dañototal;
	}

	@Override
	public void usar() {
		dañototal += getDaño();
		System.out.println(getTipoataque());
		System.out.println(getEfectosonoro());
		if (dañototal > 200) {
			System.err.println("Daño " + dañototal + " CRITICO!!!");
		} else {
			System.out.println("Daño " + dañototal);
		}
	}

	@Override
	public int especial() {
	int	dualshot = especial;
		return dualshot;
	}

	@Override
	public String bonificacion() {
		especial = dañototal*2;
		if (especial > 300) {
			System.err.println("Habilidad ranger dual atack: " + especial/2+"PH" + " + " + especial/2 + "PH de daño por por doble ataque"
					+ " CRITICA!!!");
		} else {
			System.out.println("Habilidad ranger dual atack: " + especial+"PH" + " + " + especial + "PH de daño por por doble ataque"
	);
		}

		return bono;
	}

}
