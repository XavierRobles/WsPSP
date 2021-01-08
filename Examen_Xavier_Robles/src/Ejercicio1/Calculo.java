package Ejercicio1;

public class Calculo implements Runnable {
	private int num;
	
	public Calculo(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		
		Factorial(getNum());
	}

	

	
	private void Factorial(int num) {
		long factorial = 1;
		
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println(Thread.currentThread().getName()+" El factorial de " + num + " es: " + factorial);
		
	}
}

