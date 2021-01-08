import java.util.ArrayList;
import java.util.List;

public class MainPrincipal {

	public static void main(String[] args) {

		Personaje G1 = new Guerrero();
		Personaje C1 = new Healer();
		Personaje M1 = new Mago();
		Arma e1 = new Espada();
		Arma e2 = new Rezo();
		Arma e3 = new Arco();
		
		
		G1.setNombre("Akiles");
		G1.setNivel(5);
		G1.setSalud(200);
		G1.setIniciativa(5);
		G1.setArma(e1);
		e1.setDa�omaximo(20);
		e1.setDa�oMinimo(5);
		
		
		C1.setNombre("Tarutaru");
		C1.setNivel(5);
		C1.setSalud(200);
		C1.setIniciativa(5);
		C1.setArma(e2);
		e2.setDa�omaximo(20);
		e2.setDa�oMinimo(5);
		
		M1.setNombre("BlackMage");
		M1.setNivel(5);
		M1.setSalud(200);
		M1.setIniciativa(5);
		M1.setArma(e3);
		e3.setDa�omaximo(20);
		e3.setDa�oMinimo(5);
		
		
		List<Personaje> listaPersonajes = new ArrayList<Personaje>();
		listaPersonajes.add(G1);
		listaPersonajes.add(C1);
		listaPersonajes.add(M1);
		
		int contrincante1 = util.generadornumeros(0, 3);
		int contrincante2 = 0;
		do {
			contrincante2 = util.generadornumeros(0, 3);
		}while(contrincante1 == contrincante2);
		
		Personaje luchador1 = listaPersonajes.get(contrincante1);
		Personaje luchador2 = listaPersonajes.get(contrincante2);
		
		Arena combate = new Arena(G1, C1);
		
		Personaje Ganador = combate.combate();
		System.out.println("Ganador es: "+Ganador);
		
		
		
	}

}
