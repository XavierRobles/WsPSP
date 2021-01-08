package basico;



public class MainHilos {
	
	public static void main(String[] args) {	
	Hilos hilo1 = new Hilos(982451191);
	Hilos hilo2 = new Hilos(982451501);
	Hilos hilo3 = new Hilos(982451467);
	Thread h1 = new Thread(hilo1, "Hilo1:\n");
	Thread h2 = new Thread(hilo2, "Hilo2:\n");
	Thread h3 = new Thread(hilo3, "Hilo3:\n");
	
	h1.start();
	h2.start();
	h3.start();
	
	}
	
}
