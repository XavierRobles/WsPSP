package Ejercicio2;

public class Trabajadores implements Runnable {
	private String nombre;
	private double sueldobase;

	
	




	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getSueldobase() {
		return sueldobase;
	}



	public void setSueldobase(double sueldobase) {
		this.sueldobase = sueldobase;
	}



	@Override
	public  void run() {
		
		System.out.println(this);
	}



	@Override
	public String toString() {
		return "Trabajadores [nombre=" + nombre + ", sueldobase=" + sueldobase + "]";
	}

}
