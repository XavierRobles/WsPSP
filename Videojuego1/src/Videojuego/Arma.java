package Videojuego;

public abstract class Arma {
	private int da�o;
	private String tipoataque, efectosonoro;

	public abstract void usar();

	public abstract int da�oAleatorio();
	public abstract String bonificacion();

	public abstract int especial();

	public String getEfectosonoro() {
		return efectosonoro;
	}

	public void setEfectosonoro(String efectosonoro) {
		this.efectosonoro = efectosonoro;
	}

	public int getDa�o() {
		return da�o;
	}

	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}

	public String getTipoataque() {
		return tipoataque;
	}

	public void setTipoataque(String tipoataque) {
		this.tipoataque = tipoataque;
	}

}
