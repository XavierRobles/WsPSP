package Personajes;

import Videojuego.Personaje;

public class Curandero extends Personaje {

	@Override
	public void Atacar(Personaje Enemigo) {
		System.out.print(getNombre() + getRol());
		System.out.println(getFraseataque());
	}



}
