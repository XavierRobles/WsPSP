package Casa;

public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private int numeroportal;
	private String codigoPostal;
	public Direccion(String tipoVia, String nombreVia, int numeroportal, String codigoPostal) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.numeroportal = numeroportal;
		this.codigoPostal = codigoPostal;
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public int getNumeroportal() {
		return numeroportal;
	}
	public void setNumeroportal(int numeroportal) {
		this.numeroportal = numeroportal;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", numeroportal=" + numeroportal
				+ ", codigoPostal=" + codigoPostal + "]";
	}

}
