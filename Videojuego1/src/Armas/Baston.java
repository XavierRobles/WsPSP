package Armas;

import java.util.Random;

import Videojuego.Arma;

public class Baston extends Arma {

	static Random rm = new Random();
	String bono ="";
	private int da�oVariable = rm.nextInt(100 * 2);
	private int especial = rm.nextInt(100) + 1;
	private int da�ototal = getDa�o() + da�oVariable;

	@Override
	public int da�oAleatorio() {
		da�ototal = getDa�o() + da�oVariable;
		return da�ototal;
	}

	@Override
	public int especial() {
		int cura = especial;
		return cura;

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
	public String bonificacion() {
		
		if (especial > 100) {
			System.out.println("El curandero al usar baston se AutoCura un total de: " + especial +"PH"+ " Cura potenciada");
		} else {
			System.out.println("El curandero al usar baston se AutoCura un total de: " + especial+ "PH");
		}
		
		return bono;
	}

}
