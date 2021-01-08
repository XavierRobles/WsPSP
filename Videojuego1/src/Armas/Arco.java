package Armas;

import java.util.Random;

import Videojuego.Arma;

public class Arco extends Arma {

	Random rm = new Random();
	String bono = "";
	int da�ovariable = rm.nextInt(100 * 1);
	int da�ototal = getDa�o() + da�ovariable;
	private int especial;

	@Override
	public int da�oAleatorio() {
		da�ototal = getDa�o() + da�ovariable;
		return da�ototal;
	}

	@Override
	public void usar() {
		da�ototal += getDa�o();
		System.out.println(getTipoataque());
		System.out.println(getEfectosonoro());
		if (da�ototal > 200) {
			System.err.println("Da�o " + da�ototal + " CRITICO!!!");
		} else {
			System.out.println("Da�o " + da�ototal);
		}
	}

	@Override
	public int especial() {
	int	dualshot = especial;
		return dualshot;
	}

	@Override
	public String bonificacion() {
		especial = da�ototal*2;
		if (especial > 300) {
			System.err.println("Habilidad ranger dual atack: " + especial/2+"PH" + " + " + especial/2 + "PH de da�o por por doble ataque"
					+ " CRITICA!!!");
		} else {
			System.out.println("Habilidad ranger dual atack: " + especial+"PH" + " + " + especial + "PH de da�o por por doble ataque"
	);
		}

		return bono;
	}

}
