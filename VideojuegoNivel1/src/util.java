import java.util.concurrent.ThreadLocalRandom;

public class util {
	public static int generadornumeros(int rangoA, int rangoB) {
		
		int numero = ThreadLocalRandom.current().nextInt(rangoA, rangoB);
		return numero;
		
	}

}
