package Armas;

import java.util.Random;

import Videojuego.Arma;

public class Baston extends Arma {

	static Random rm = new Random();
	String bono ="";
	private int dañoVariable = rm.nextInt(100 * 2);
	private int especial = rm.nextInt(100) + 1;
	private int dañototal = getDaño() + dañoVariable;

	@Override
	public int dañoAleatorio() {
		dañototal = getDaño() + dañoVariable;
		return dañototal;
	}

	@Override
	public int especial() {
		int cura = especial;
		return cura;

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
	public String bonificacion() {
		
		if (especial > 100) {
			System.out.println("El curandero al usar baston se AutoCura un total de: " + especial +"PH"+ " Cura potenciada");
		} else {
			System.out.println("El curandero al usar baston se AutoCura un total de: " + especial+ "PH");
		}
		
		return bono;
	}

}
