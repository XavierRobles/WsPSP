package Casa;

public class Piso extends Casa {
	private String inquilino;

	public Piso(int habitaciones, String propietario, Direccion direcion) {
		super(habitaciones, propietario, direcion);
	}

	public Piso(int habitaciones, String propietario, Direccion direcion, String inquilino) {
		super(habitaciones, propietario, direcion);
		this.inquilino = inquilino;
	}

	public String getInquilino() {
		return inquilino;
	}

	public void setInquilino(String inquilino) {
		this.inquilino = inquilino;
	}
	
	

}
