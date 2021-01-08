package Ejercicio2;

public class Directores extends Trabajadores {
	private String nombre;
	private double sueldobase;
	private double incentivos;





	public Directores(String nombre, double sueldobase, double incentivos) {
		super();
		this.nombre = nombre;
		this.sueldobase = sueldobase;
		this.incentivos = incentivos;
	}

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	@Override
	public String toString() {
		return "Directores [nombre=" + nombre + ", sueldobase=" + sueldobase + ", incentivos=" + incentivos + "]";
	}

}
