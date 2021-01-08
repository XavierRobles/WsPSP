package Carrera;

public class ClasePrincipal {
	public static void main(String[] args) {
		Carrera c = new Carrera();
		c.iniciocarrera();
	}
}
















/**
 * 
 * private synchronized void solucionFactorial() {
		long factorial = 1;
		for (long i = numerofactorial; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("PARA EL HILO "+Thread.currentThread().getName()+"El factorial de " + numerofactorial + " es: " + factorial);
		
	}
 * 
 * 
 * 
 * 
 * 
 * public class Main{

    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
  
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}
 **/
