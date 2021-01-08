
public class ClasePrincipal {
	public static void main(String[] args) {
		Silla s = new Silla();
		Obreros o1 = new Obreros(1, 100, s, "Pepe");
		Obreros o2 = new Obreros(101, 200, s, "Antonio");
		Obreros o3 = new Obreros(201, 300, s, "Javi");
		Obreros o4 = new Obreros(301, 400, s, "Maria");
		Obreros o5 = new Obreros(401, 500, s, "Cristina");
		
		Thread hilo1 = new Thread(o1);
		Thread hilo2 = new Thread(o2);
		Thread hilo3 = new Thread(o3);
		Thread hilo4 = new Thread(o4);
		Thread hilo5 = new Thread(o5);
		

		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
	}
}
