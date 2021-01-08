package videojuegoconHilos;

public class Boss extends Personaje {

	private int fuerza;

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void atacar(Personaje p) {
		int dañoTotal;
		if (this.getArma() instanceof Espada || this.getArma() instanceof Arco) {
			dañoTotal = getArma().usar() + fuerza;

		} else {
			dañoTotal = getArma().usar();
		}

		dañoTotal += getFuerza() * 2;
		System.err.println("BOSS hace " + dañoTotal);
		p.setSalud(p.getSalud() - dañoTotal);
	}

	@Override
	public void run() {
		
	}

}

