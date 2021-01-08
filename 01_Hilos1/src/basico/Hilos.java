package basico;

import java.util.Scanner;

public class Hilos implements Runnable {

	private double primo;

	public Hilos(double primo) {
		this.primo = primo;
	}

	@Override
	public void run() {

		Scanner sc = new java.util.Scanner(System.in);
		// aqui nacera el hilo
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());// obtenemos el nombre del hilo
		long start = System.currentTimeMillis();

		String resultado = "Es primo";
		
		for (int i = 2; i < primo; i++) {
			if (primo % i == 0) {
				resultado = " No es primo";
				break;
			}
			
			
		}
	

		System.out.println(Thread.currentThread().getName() + "dice: " + resultado);
		System.out.print("Total time = " + (double) (System.currentTimeMillis() - start) / 1000);
		System.out.println(" "+Thread.currentThread().getName() + "acabado\n");
		

	}
}
