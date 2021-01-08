package Personajes;

import Videojuego.Personaje;

public class Arquero extends Personaje {

		
	
	@Override
	public void Atacar(Personaje Enemigo) {
		System.out.print((getNombre() + getRol()));		
		System.out.println(getFraseataque());
		
	}


	

}
