package Videojuego;

public abstract class Arma {
	private int daño;
	private String tipoataque, efectosonoro;

	public abstract void usar();

	public abstract int dañoAleatorio();
	public abstract String bonificacion();

	public abstract int especial();

	public String getEfectosonoro() {
		return efectosonoro;
	}

	public void setEfectosonoro(String efectosonoro) {
		this.efectosonoro = efectosonoro;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public String getTipoataque() {
		return tipoataque;
	}

	public void setTipoataque(String tipoataque) {
		this.tipoataque = tipoataque;
	}

}
