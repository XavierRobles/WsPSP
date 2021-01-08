package Casa;

public class MainCasa {

	public static void main(String[] args) {

		Direccion d = new Direccion("Av", "Miravilla", 4, "34567");
		Piso p = new Piso(4, "pepe", d, "Antonio");
		
		
		System.out.println(p);
	}

}
