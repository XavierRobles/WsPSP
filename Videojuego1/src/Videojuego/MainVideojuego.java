package Videojuego;

import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Armas.Arco;
import Armas.Baston;
import Armas.Espada;
import Armas.Varita;
import Personajes.Arquero;
import Personajes.Curandero;
import Personajes.Guerrero;
import Personajes.Mago;

public class MainVideojuego {

	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources/context.xml");

	public static void main(String[] args) {
		

		Personaje G1 = context.getBean("G1", Guerrero.class);
		Personaje A1 = context.getBean("A1", Arquero.class);
		Personaje M1 = context.getBean("M1", Mago.class);
		Personaje C1 = context.getBean("C1", Curandero.class);
		Arma e1 = context.getBean("e1", Espada.class);
		Arma e2 = context.getBean("e2", Arco.class);
		Arma e3 = context.getBean("e3", Varita.class);
		Arma e4 = context.getBean("e4", Baston.class);

		int dead = 0;
		int vidaGuerrero = G1.getSalud();
		int vidaArquero = A1.getSalud();
		int vidaMago = M1.getSalud();
		int vidaCurandero = C1.getSalud();
		int manaGuerrero = G1.getMana();
		int manaArquero = A1.getMana();
		int manaMago = M1.getMana();
		int manaCurandero = C1.getMana();

		Random rm = new Random();
		
		System.out.println(G1.getSalud());
		/*
		 * While controla el numero maximo de victorias para acabar la partida max 3
		 */
		while (dead != 3) {

			int dados = rm.nextInt(4);
			int contrincante = rm.nextInt(4);
			System.out.println("Los dados ruedan.... ");
			System.out.println("Numero de los dados: " + dados + "\r");
			switch (dados) {

			/*
			 * Switch contro de batallas, cada caso pertenece a el Personaje que va atacar.
			 */

			case 0:
				// Guerrero
				contrincante = rm.nextInt(4);
				G1.setArma(e1);
				if (contrincante == 1 && vidaArquero >= 0 && G1.getSalud() >= 0) {
					//ataca Arquero
					G1.Atacar(A1);				
					
					if (G1.getArma() == e1) {
						vidaArquero -= G1.getArma().dañoAleatorio();
						vidaArquero -= G1.getArma().especial();
						System.out.println("(((Arquero le quedan " + vidaArquero + ")))\r");

					} else {
						vidaArquero -= G1.getArma().dañoAleatorio();
						System.out.println("(((Arquero le quedan " + vidaArquero + ")))\r");
					}

					if (vidaArquero <= 0) {
						System.err.println("(((" + A1.getNombre() + " ha muerto)))");
						dead++;
					}

				} else if (contrincante == 2 && vidaMago >= 0 && G1.getSalud() >= 0) {
					System.out.println("Guerrero ataca a ===>" + M1.getNombre());
					G1.Atacar(M1);
					G1.getArma().usar();

					if (G1.getArma() == e1) {
						System.out.print(G1.getArma().bonificacion());
						vidaMago -= G1.getArma().dañoAleatorio();
						vidaMago -= G1.getArma().especial();
						System.out.println("(((Mago le quedan " + vidaMago + ")))\r");

					} else {

						vidaMago -= G1.getArma().dañoAleatorio();
						System.out.println("(((Mago le quedan " + vidaMago + ")))\r");
					}

					if (vidaMago <= 0) {
						System.err.println("(((" + M1.getNombre() + " ha muerto)))");
						dead++;
					}
				} else if (contrincante == 3 && vidaCurandero >= 0 && G1.getSalud() >= 0) {
					System.out.println("Guerrero ataca a ===> " + C1.getNombre());
					G1.Atacar(C1);
					G1.getArma().usar();

					if (G1.getArma() == e1) {
						System.out.print(G1.getArma().bonificacion());
						vidaCurandero -= G1.getArma().dañoAleatorio();
						vidaCurandero -= G1.getArma().especial();
						System.out.println("(((Curandero le quedan " + vidaCurandero + ")))\r");
					} else {

						vidaCurandero -= G1.getArma().dañoAleatorio();
						System.out.println("(((Curandero le quedan " + vidaCurandero + ")))\r");
					}

					if (vidaCurandero <= 0) {
						System.err.println("(((" + C1.getNombre() + " ha muerto)))");
						dead++;
					}
				} else if (contrincante == 0 && vidaGuerrero >= 0) {
					System.out.println("El gerrero se tropieza y pierde el turno");
					G1.Atacar(G1);

				}

				break;

			case 1:
				// Arquero
				contrincante = rm.nextInt(4);
				A1.setArma(e1);
				if (contrincante == 1 && vidaGuerrero >= 0 && vidaArquero >= 0 && vidaArquero >= 0) {
					System.out.println("Arquero ataca a ===> " + G1.getNombre());
					A1.Atacar(G1);
					A1.getArma().usar();
					if (A1.getArma() == e2) {
						System.out.print(A1.getArma().bonificacion());
						vidaGuerrero -= A1.getArma().dañoAleatorio();
						vidaGuerrero -= A1.getArma().especial();
						System.out.println("(((Guerrero le quedan " + vidaGuerrero + ")))\r");

					} else {
						vidaGuerrero -= A1.getArma().dañoAleatorio();
						System.out.println("(((Guerrero le quedan " + vidaGuerrero + ")))\r");
					}

					if (vidaGuerrero <= 0) {
						System.err.println("(((" + G1.getNombre() + " ha muerto)))");
						dead++;
					}

				} else if (contrincante == 2 && vidaMago >= 0 && vidaArquero >= 0) {
					System.out.println("Arquero ataca a ===> " + M1.getNombre());
					A1.Atacar(M1);
					A1.getArma().usar();
					if (A1.getArma() == e2) {
						System.out.print(A1.getArma().bonificacion());
						vidaMago -= A1.getArma().dañoAleatorio();
						vidaMago -= A1.getArma().especial();
						System.out.println("(((Mago le quedan " + vidaMago + ")))\r");
					} else {
						vidaMago -= A1.getArma().dañoAleatorio();
						System.out.println("(((Mago le quedan " + vidaMago + ")))\r");
					}
					if (vidaMago <= 0) {
						System.err.println("(((" + M1.getNombre() + " ha muerto)))");
						dead++;
					}
				} else if (contrincante == 3 && vidaCurandero >= 0 && vidaArquero >= 0) {
					System.out.println("Arquero ataca a ===> " + C1.getNombre());
					A1.Atacar(C1);
					A1.getArma().usar();
					if (A1.getArma() == e2) {
						System.out.print(A1.getArma().bonificacion());
						vidaCurandero -= A1.getArma().dañoAleatorio();
						vidaCurandero -= A1.getArma().especial();
						System.out.println("(((Curandero le quedan " + vidaCurandero + ")))\r");
					} else {
						vidaCurandero -= A1.getArma().dañoAleatorio();
						System.out.println("(((Curandero le quedan " + vidaCurandero + ")))\r");
					}
					if (vidaCurandero <= 0) {
						System.err.println("(((" + C1.getNombre() + " ha muerto)))");
						dead++;
					}
				} else if (contrincante == 0 && vidaArquero >= 0) {
					System.out.println("Al Arquero se le ronpe la cuerda y pierde el turno");
					A1.Atacar(A1);
					System.out.println("Aaauuuch!!");

				}

				break;
			case 2:
				// Mago
				contrincante = rm.nextInt(4);
				M1.setArma(e3);
				if (contrincante == 1 && vidaGuerrero >= 0 && vidaMago >= 0) {
					System.out.println("Mago ataca a ===> " + G1.getNombre());
					M1.Atacar(G1);
					M1.getArma().usar();

					if (M1.getArma() == e3) {
						System.out.print(M1.getArma().bonificacion());
						vidaGuerrero -= M1.getArma().dañoAleatorio();
						vidaGuerrero -= M1.getArma().especial();
						System.out.println("(((Guerrero le quedan " + vidaGuerrero + ")))\r");
					} else {
						vidaGuerrero -= M1.getArma().dañoAleatorio();
						System.out.println("(((Guerrero le quedan " + vidaGuerrero + ")))\r");
					}
					if (vidaGuerrero <= 0) {
						System.err.println("(((" + G1.getNombre() + " ha muerto)))");
						dead++;
					}

				} else if (contrincante == 2 && vidaArquero >= 0 && vidaMago >= 0) {
					System.out.println("Mago ataca a ===> " + A1.getNombre());
					M1.Atacar(A1);
					M1.getArma().usar();
					if (M1.getArma() == e3) {
						System.out.print(M1.getArma().bonificacion());
						vidaArquero -= M1.getArma().dañoAleatorio();
						vidaArquero -= M1.getArma().especial();
						System.out.println("(((Arquero le quedan " + vidaArquero + ")))\r");
					} else {
						vidaArquero -= M1.getArma().dañoAleatorio();
						System.out.println("(((Arquero le quedan " + vidaArquero + ")))\r");
					}
					if (vidaArquero <= 0) {
						System.err.println("(((" + A1.getNombre() + " ha muerto)))");
						dead++;
					}
				} else if (contrincante == 3 && vidaCurandero >= 0 && vidaMago >= 0) {
					System.out.println("Mago ataca a ===> Curandero ");
					M1.Atacar(C1);
					M1.getArma().usar();
					if (M1.getArma() == e3) {
						System.out.print(M1.getArma().bonificacion());
						vidaCurandero -= M1.getArma().dañoAleatorio();
						vidaCurandero -= M1.getArma().especial();
						System.out.println("(((Arquero le quedan " + vidaCurandero + ")))\r");
					}
					vidaCurandero -= M1.getArma().dañoAleatorio();
					System.out.println("(((Curandero le quedan " + vidaCurandero + ")))\r");

					if (vidaCurandero <= 0) {
						System.err.println("(((" + C1.getNombre() + " ha muerto)))");
						dead++;
					}
				} else if (contrincante == 0 && vidaMago >= 0) {
					System.out.println("Al Mago le explota en la cara una bola de fuego y pierde el turno");
					M1.Atacar(M1);
					System.out.println("AY!!!AY!!!AY!!!!\r");

				}

				break;

			case 3:
				// Curandero
				contrincante = rm.nextInt(4);
				C1.setArma(e4);
				if (contrincante == 1 && vidaGuerrero >= 0 && vidaCurandero >= 0) {
					System.out.println("Curandero ataca a ===> " + G1.getNombre());

					C1.Atacar(G1);
					C1.getArma().usar();

					if (C1.getArma() == e4) {
						System.out.print(C1.getArma().bonificacion());
						System.out.print("Puntos de vida Actuales: " + vidaCurandero + " + " + C1.getArma().especial()
								+ " puntos de vida");
						vidaCurandero += C1.getArma().especial();
						System.out.println(" Total: " + vidaCurandero + "PH");
						vidaGuerrero -= C1.getArma().dañoAleatorio();
						System.out.println("(((Guerrero le quedan " + vidaGuerrero + ")))\r");
					} else {
						vidaGuerrero -= C1.getArma().dañoAleatorio();
						System.out.println("(((Guerrero le quedan " + vidaGuerrero + ")))\r");
					}

					if (vidaGuerrero <= 0) {
						System.err.println("(((" + G1.getNombre() + " ha muerto)))");
						dead++;
					}

				} else if (contrincante == 2 && vidaArquero >= 0 && vidaCurandero >= 0) {
					System.out.println("Curandero ataca a ===> " + A1.getNombre());
					C1.Atacar(A1);
					C1.getArma().usar();

					if (C1.getArma() == e4) {
						System.out.print(C1.getArma().bonificacion());
						System.out.print("Puntos de vida Actuales: " + vidaCurandero + " + " + C1.getArma().especial()
								+ " puntos de vida");
						vidaCurandero += C1.getArma().especial();
						System.out.println(" Total: " + vidaCurandero + "PH");
						vidaArquero -= C1.getArma().dañoAleatorio();
						System.out.println("(((Arquero le quedan " + vidaArquero + ")))\r");
					} else {
						vidaArquero -= C1.getArma().dañoAleatorio();
						System.out.println("(((Arquero le quedan " + vidaArquero + ")))\r");
					}
					if (vidaArquero <= 0) {
						System.err.println("(((" + A1.getNombre() + " ha muerto)))");
						dead++;
					}
				} else if (contrincante == 3 && vidaMago >= 0 && vidaCurandero >= 0) {
					System.out.println("Curandero ataca a ===> " + M1.getNombre());
					C1.Atacar(M1);
					C1.getArma().usar();

					if (C1.getArma() == e4) {
						System.out.print(C1.getArma().bonificacion());
						System.out.print("Puntos de vida Actuales: " + vidaCurandero + " + " + C1.getArma().especial()
								+ " puntos de vida");
						vidaCurandero += C1.getArma().especial();
						System.out.println(" Total: " + vidaCurandero + "PH");

					} else {
						vidaCurandero += C1.getArma().especial();
						System.out.println(" Total: " + vidaCurandero + "PH");
					}
					vidaMago -= C1.getArma().dañoAleatorio();
					System.out.println("(((Mago le quedan " + vidaMago + ")))\r");

					if (vidaMago <= 0) {
						System.err.println("(((" + M1.getNombre() + " ha muerto)))");
						dead++;
					}
				} else if (contrincante == 0 && vidaCurandero >= 0) {
					System.out.println("Al curandero le atacan los animales y pierde el turno");

					System.out.println("Quitar bichos!!!! Fueraaa!!!\r");

				}

				break;
			default:
				break;
			}

		}
		String ganador;
		if (vidaGuerrero > vidaArquero) {
			if (vidaGuerrero > vidaMago) {
				ganador = G1.getNombre();
			} else {
				ganador = M1.getNombre();
			}

		} else if (vidaArquero > vidaCurandero) {
			ganador = A1.getNombre();
		} else {
			ganador = C1.getNombre();
		}
		System.out.println("==========================");
		System.out.println("**************************");
		System.out.println("GANADOR>>>" + ganador);
		System.out.println("**************************");
		System.out.println("==========================");
		Pintar a = new Pintar();
		a.crearWeb();
		a.escritura();
		a.abrirArchivo();
		//escritura();
	}
}
