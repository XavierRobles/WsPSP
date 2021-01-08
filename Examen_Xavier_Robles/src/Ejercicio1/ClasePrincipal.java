package Ejercicio1;

import java.util.Scanner;

public class ClasePrincipal {

	private int num1, num2, num3, num4, num5;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ClasePrincipal main = new ClasePrincipal();
		main.hilosNumeros();

	}

	public void hilosNumeros() {
		System.out.println("Introduce el numero 1");
		num1 = sc.nextInt();
		Calculo c1 = new Calculo(num1);
		System.out.println("Introduce el numero 2");
		num2 = sc.nextInt();
		Calculo c2 = new Calculo(num2);
		System.out.println("Introduce el numero 3");
		num3 = sc.nextInt();
		Calculo c3 = new Calculo(num3);
		System.out.println("Introduce el numero 4");
		num4 = sc.nextInt();
		Calculo c4 = new Calculo(num4);
		System.out.println("Introduce el numero 5");
		num5 = sc.nextInt();
		Calculo c5 = new Calculo(num5);

		Thread h1 = new Thread(c1);
		Thread h2 = new Thread(c2);
		Thread h3 = new Thread(c3);
		Thread h4 = new Thread(c4);
		Thread h5 = new Thread(c5);
		h1.setName("Hilo1");
		h2.setName("Hilo2");
		h3.setName("Hilo3");
		h4.setName("Hilo4");
		h5.setName("Hilo5");

		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();

	}

}
