
public class Obreros implements Runnable {
	private int inicioponerladrillos, finponerladrillos;
	private Silla silla;
	private String nombre;

	public Obreros(int inicioponerladrillos, int finponerladrillos, Silla silla, String nombre) {
		super();
		this.inicioponerladrillos = inicioponerladrillos;
		this.finponerladrillos = finponerladrillos;
		this.silla = silla;
		this.nombre = nombre;
	}

	public int getInicioponerladrillos() {
		return inicioponerladrillos;
	}

	public void setInicioponerladrillos(int inicioponerladrillos) {
		this.inicioponerladrillos = inicioponerladrillos;
	}

	public int getFinponerladrillos() {
		return finponerladrillos;
	}

	public void setFinponerladrillos(int finponerladrillos) {
		this.finponerladrillos = finponerladrillos;
	}

	public Silla getSilla() {
		return silla;
	}

	public void setSilla(Silla silla) {
		this.silla = silla;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run() {
		ponerLadrillos();
		
	}

	private void ponerLadrillos() {
		
		for (int i = inicioponerladrillos; i < finponerladrillos; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Obrero "+ nombre +" esta poniendo ladrillos "+ i);
			if (i % 10 ==0) {
				silla.descansar(this);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}

}
