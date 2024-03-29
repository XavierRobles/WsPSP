package jpadata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jpadata.modelo.entidad.Equipo;
import jpadata.modelo.entidad.Jugador;
import jpadata.modelo.persistencia.DaoEquipo;
import jpadata.modelo.persistencia.DaoJugador;

@SpringBootApplication
public class SprintJpadataRelacionesApplication {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(SprintJpadataRelacionesApplication.class, args);

		Jugador j1 = context.getBean("jugador", Jugador.class);
		j1.setNombre("Mesi");
		j1.setDorsal(1);

		Jugador j2 = context.getBean("jugador", Jugador.class);
		j2.setNombre("Iniesta");
		j2.setDorsal(2);
		
		
		Equipo e1 = context.getBean("equipo", Equipo.class);
		e1.setNombre("Barca");
		e1.setCiudad("barcelona");
		
		List<Jugador> listaJugadores = new ArrayList<Jugador>();
		listaJugadores.add(j1);
		listaJugadores.add(j2);
		
		e1.setListaJugadores(listaJugadores);
		DaoEquipo daoEquipo = context.getBean("daoEquipo", DaoEquipo.class);
		DaoJugador daoJugador = context.getBean("daoJugador", DaoJugador.class);
	
		
		j1.setEquipo(e1);
		j2.setEquipo(e1);
	
		
		daoEquipo.save(e1);
		
		Jugador j3 = daoJugador.findById(1).get();
		
		System.out.println(j3);
		
	}
}
