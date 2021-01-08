package videojuegoconHilos;
public abstract class Personaje  implements Runnable{

	private String nombre;
	private int salud;
	private int nivel;
	private int iniciativa;
	Arma arma;
	private Arena arena;
	public Arena getArena() {
		return arena;
	}



	public void setArena(Arena arena) {
		this.arena = arena;
	}

		
	
	public int getIniciativa() {
		return iniciativa;
	}



	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}



	public abstract void atacar(Personaje p);
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	@Override
	public void run() {
		arena.combate(this);
	}
	
}
