package entidad;

public class Movil {
	private String url;
	private String descripcion;
	private String price;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "movil [url=" + url + ", descripcion=" + descripcion + ", price=" + price + "]";
	}

	
	
}
