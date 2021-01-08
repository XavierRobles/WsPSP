package Carrera;

import java.sql.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Caballo implements Runnable {
	private String nombre;
	private Date tiempo;
	private Meta meta;

	


	public Caballo(String nombre, Meta meta) {
		super();
		this.nombre = nombre;
		this.meta = meta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getTiempo() {
		return tiempo;
	}

	public void setTiempo(Date tiempo) {
		this.tiempo = tiempo;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	@Override
	public void run() {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			System.out.println(i + " : " + nombre);
			int randomNum = ThreadLocalRandom.current().nextInt(1, 11);
			try {
				Thread.sleep(randomNum);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.print("Total time = " + (double) (System.currentTimeMillis() - start) / 1000+" ");

		meta.apuntarCaballo(this);

	}

}
