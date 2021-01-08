package Ejercicio2;

public class ClasePrincipal {
	public static void main(String[] args) {

		Trabajadores p = new Programadores();
		Trabajadores j = new JefesDeProyecto();
		Trabajadores d = new Directores("Felix", 1000, 200);
		p.setNombre("pepe");
		p.setSueldobase(1000);
		j.setNombre("pepe");
		j.setSueldobase(1000);
		d.setNombre("pepe");
		d.setSueldobase(1000);
		
		
		
		
		
		
		
		
		Thread h1 = new Thread(p);
		Thread h2 = new Thread(j);
		Thread h3 = new Thread(d);
		h1.start();
		h2.start();
		h3.start();

		
	}
}
