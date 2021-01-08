
public class Silla {



	public synchronized void  descansar(Obreros o) {
		
		System.out.println("Soy el obrero "+ o.getNombre()+ " y voy a descansar 10 segundos");
		for (int i = 10; i > 0; i--) {
			System.out.println("Al obrero "+o.getNombre()+" le queda por descansar: "+i+" segundos");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

		System.out.println("El obrero "+ o.getNombre()+ " Vuelve a su puesto de trabajo");
	}
	
}
