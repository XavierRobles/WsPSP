package videojuegoconHilos;
public class Arma {

	private int  dañoMinimo;
	private int dañomaximo;

	
	
	public int usar() {
		
		int dañocausado = util.generadornumeros(dañoMinimo, dañomaximo);
		return dañocausado;
		
	}
	
	public int getDañoMinimo() {
		return dañoMinimo;
	}
	public void setDañoMinimo(int dañoMinimo) {
		this.dañoMinimo = dañoMinimo;
	}
	public int getDañomaximo() {
		return dañomaximo;
	}
	public void setDañomaximo(int dañomaximo) {
		this.dañomaximo = dañomaximo;
	}

	
}
