package videojuegoconHilos;
public class Hechizo extends Arma{
private int probabilidadMagiaCaotica;
	@Override
	public int usar() {
int da�oGeneral = super.usar();

int numeroAleatorio = util.generadornumeros(1, 100);

if (numeroAleatorio <= probabilidadMagiaCaotica) {
	System.out.println("Magia caiotica");
	da�oGeneral = da�oGeneral *2;
	
}
		return super.usar();
		
	}

	
	
}
