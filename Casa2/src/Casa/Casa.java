package Casa;

public class Casa {
	private int habitaciones;
	private String propietario;
	private Direccion direcion;
	public Casa(int habitaciones, String propietario, Direccion direcion) {
		super();
		this.habitaciones = habitaciones;
		this.propietario = propietario;
		this.direcion = direcion;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public Direccion getDirecion() {
		return direcion;
	}
	public void setDirecion(Direccion direcion) {
		this.direcion = direcion;
	}
	@Override
	public String toString() {
		return "Casa [habitaciones=" + habitaciones + ", propietario=" + propietario + ", direcion=" + direcion + "]";
	}
	

}
