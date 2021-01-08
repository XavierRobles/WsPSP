package Personajes;

import Armas.Espada;
import Videojuego.Personaje;

public class Guerrero extends Personaje {

	@Override
	public void Atacar(Personaje enemigo) {
		getArma();
		System.out.println("Guerrero ataca a ===> " + enemigo.getNombre());
		if (getArma() instanceof Espada) {
			System.out.print((getNombre() + getRol()));
			System.out.println(getFraseataque());
			getArma().bonificacion();
		} else {
			System.out.print((getNombre() + getRol()));
			System.out.println(getFraseataque());
			
		}
		getArma().usar();

	}

}
