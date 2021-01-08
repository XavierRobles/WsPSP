package Carrera;

public class Carrera {

	public void iniciocarrera() {
		
		Meta m = new Meta();
		Caballo c1 = new Caballo("Rociante", m);
		Caballo c2 = new Caballo("Babienca", m);
		Caballo c3 = new Caballo("Imperioso", m);
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		
		for (int i = 4; i > 0; i--) {
			System.err.println("PIN... "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.err.println("START!!!!!");
		t1.start();
		t2.start();
		t3.start();
	}

}
