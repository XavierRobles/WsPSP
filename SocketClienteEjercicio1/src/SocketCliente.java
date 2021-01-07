import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketCliente {

	public static final int PUERTO = 2020;
	public static final String IP_SERVER = "localhost";

	public static final int SUMAR = 1;
	public static final int RESTAR = 2;
	public static final int MULTIPLICAR = 3;
	public static final int DIVIDIR = 4;
	public static final int SALIR = 5;
	private static Scanner sc = new Scanner(System.in);

	public static int mostraMenu() {
		System.out.println("Selecione una operacion a realizar.");
		System.out.println(SUMAR + "-Sumar");
		System.out.println(RESTAR + "-Restar");
		System.out.println(MULTIPLICAR + "-Multiplicar");
		System.out.println(DIVIDIR + "-Dividir");
		System.out.println(SALIR + "-Salir");
		int opcion = Integer.parseInt(sc.nextLine());
		return opcion;

	}

	public static void main(String[] args) {

		System.out.println("        APLICACIÓN CLIENTE");
		System.out.println("-----------------------------------");

		Socket socketCliente = null;
		InputStreamReader entrada = null;
		PrintStream salida = null;
		InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);

		try {
			int opcion = mostraMenu();
			do {
				socketCliente = new Socket();
				socketCliente.connect(direccionServidor);
				System.out.println("Conexion establecida... a " + IP_SERVER + " por el puerto " + PUERTO);

				entrada = new InputStreamReader(socketCliente.getInputStream());
				salida = new PrintStream(socketCliente.getOutputStream());

				System.out.println("CLIENTE: Introduzca los numeros a sumar");
				String num1 = sc.nextLine();
				String num2 = sc.nextLine();
				String operandos = num1 + "-" + num2 + "-" + opcion;
				salida.println(operandos);

				BufferedReader bf = new BufferedReader(entrada);
				String resultado = bf.readLine();
				System.out.println("CLIENTE: " + resultado);
				opcion = mostraMenu();
			} while (opcion != SALIR);
			System.out.println("Cerrando Programa");
		} catch (IOException e) {
			System.err.println("Error");
			e.printStackTrace();
		} finally {

			try {
				salida.close();
				entrada.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
