package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static final int PUERTO = 2020;
	public static final String IP_SERVER = "localhost";
	private static int opcion;

	public static void main(String[] args) {

		System.out.println("      APLICACIÓN DE SERVIDOR      ");
		System.out.println("----------------------------------");
		ServerSocket servidorSocket = null;
		Socket socketConexion = null;
		PrintStream salida = null;
		InputStreamReader entrada = null;

		try {
			servidorSocket = new ServerSocket();
			InetSocketAddress direccion = new InetSocketAddress(IP_SERVER, PUERTO);
			servidorSocket.bind(direccion);

			while (true) {
				System.out.println("SERVIDOR: Esperando peticion..........");
				socketConexion = servidorSocket.accept();

				entrada = new InputStreamReader(socketConexion.getInputStream());
				BufferedReader bf = new BufferedReader(entrada);
				String stringRecibido = bf.readLine();
				System.out.println("SERVIDOR: Me ha llegado del cliente: " + stringRecibido);
				String[] operadores = stringRecibido.split("-");
				int num1 = Integer.parseInt(operadores[0]);
				int num2 = Integer.parseInt(operadores[1]);
				int num3 = Integer.parseInt(operadores[2]);

				opcion = num3;
				salida = new PrintStream(socketConexion.getOutputStream());

				switch (opcion) {
				case 1:
					int resultado = num1 + num2;
					salida.println(resultado);

					break;

				case 2:
					resultado = num1 - num2;
					salida.println(resultado);
					break;
				case 3:
					resultado = num1 * num2;
					salida.println(resultado);
					break;
				case 4:
					resultado = num1 / num2;
					salida.println(resultado);
					break;

				default:
					break;
				}
				

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (salida != null && entrada != null) {

				try {
					salida.close();
					entrada.close();
					socketConexion.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
