package Carrera;

import java.util.ArrayList;
import java.util.List;

public class Meta {
	private List<Caballo> orden = new ArrayList<Caballo>();

	
	
	
	public List<Caballo> getOrden() {
		return orden;
	}




	public void setOrden(List<Caballo> orden) {
		this.orden = orden;
	}




	public synchronized void  apuntarCaballo(Caballo caballo) {
		//System.out.println(" El caballo " + caballo.getNombre()+ " llego en");
		orden.add(caballo);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println(caballo.getNombre() + " posicion: "+ orden.size());
	}

	
	
	
}
