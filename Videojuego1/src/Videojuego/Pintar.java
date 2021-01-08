package Videojuego;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Armas.Arco;
import Armas.Baston;
import Armas.Espada;
import Armas.Varita;
import Personajes.Arquero;
import Personajes.Curandero;
import Personajes.Guerrero;
import Personajes.Mago;

public class Pintar extends Personaje {
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources/context.xml");
	Personaje G1 = context.getBean("G1", Guerrero.class);
	Personaje A1 = context.getBean("A1", Arquero.class);
	Personaje M1 = context.getBean("M1", Mago.class);
	Personaje C1 = context.getBean("C1", Curandero.class);
	Arma e1 = context.getBean("e1", Espada.class);
	Arma e2 = context.getBean("e2", Arco.class);
	Arma e3 = context.getBean("e3", Varita.class);
	Arma e4 = context.getBean("e4", Baston.class);

	public  String crearWeb() {
		String incio = "<!DOCTYPE html><html lang='en'><head><meta charset='UTF-8'><meta name='viewport' "
				+ "content='width=device-width, initial-scale=1.0'><title>Batalla</title></head><body>"
				+ "<center><p style=\"font-size:80px;\">Batalla</h1><center></p>";
		String cuerpo = "<center>" + ""
				+ "<div style='float: right'><h1>" +"Nombre " + A1.getNombre() + "</h1><h1 style='color:red;'>"+"HP: " + A1.getSalud()+"</h1><h1  style='color:blue;'>"+"MP " + A1.getMana() + "<h1 style='color:green;'>"+"DPS: " + e2.getDaño() + "</h1>"
				+ "</h1><img src='https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRjuCtKMi4FBtvZnBFKFi2gbiyPBKevBM0rOw&usqp=CAU'style='550px;height:550px;'></div>"
				+ "<div style='float: right'><h1>"+"Nombre " + M1.getNombre() + "</h1><h1 style='color:red;'>"+"HP: " + M1.getSalud() + "</h1><h1 style='color:blue;'>"+"MP: " + M1.getMana()+ "<h1  style='color:green;'>"+"DPS: "+ e3.getDaño() + "</h1>"
				+ "</h1><img src='https://i.pinimg.com/originals/f1/e3/fd/f1e3fd11b75bcd82cefad61cc75a00f3.jpg'style='550px;height:550px;'></div>"
				+ "<div style='float: right'><h1>" +"Nombre " + C1.getNombre() + "</h1><h1 style='color:red;'>"+"HP: " + C1.getSalud() + "</h1><h1 style='color:blue;'>"+"MP: " + C1.getMana()+ "<h1  style='color:green;'>"+"DPS: "+e4.getDaño() + "</h1>"
				+ "</h1><img src='https://static.wikia.nocookie.net/esfinalfantasy/images/5/56/Maga_Blanca_Final_Fantasy.jpg'style='550px;height:550px;'></div>"
				+ "<div style='float: right'><h1>" +"Nombre " + G1.getNombre() + "</h1><h1 style='color:red;'>"+"HP: " + G1.getSalud() + "</h1><h1 style='color:blue;'>"+"MP: " + G1.getMana()+ "<h1  style='color:green;'>"+"DPS: "+e1.getDaño() + "</h1>"
				+ "</h1><img src='https://static.zerochan.net/Tarutaru.full.137293.jpg'style='550px;height:550px;'></div></center>";
		
		

		String fin = "</body></html>";
		return incio + cuerpo + fin;
	}

	public  void escritura() {
		

		FileWriter FW;
		try {
			FW = new FileWriter("C:\\Users\\xavie\\pruebasmenu\\Fileout\\Batalla.html");
			FW.write(crearWeb());
			FW.close();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void abrirArchivo() {
		crearWeb();
		ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
				"C:\\Users\\xavie\\pruebasmenu\\Fileout\\Batalla.html");
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}





	@Override
	public void Atacar(Personaje nombre) {
		// TODO Auto-generated method stub
		
	}


}
