package jpadata;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jpadata.modelo.entidad.Pelicula;
import jpadata.modelo.repositorio.DaoPelicula;

@SpringBootApplication
public class SpringJpaDataApplication {
public static ApplicationContext context = null;
	public static void main(String[] args) {
		context =SpringApplication.run(SpringJpaDataApplication.class, args);
		
		Pelicula p = new Pelicula();
		p.setTitulo("Star Wars");
		p.setDirector("George Lucas");
		p.setAnio(1982);
		
		DaoPelicula dao = context.getBean("daoPelicula" , DaoPelicula.class);
//		dao.save(p);
//		
//		
//		//Para modificar
//		p.setTitulo("Criaturas fantasticas y donde encontrarlas");
//		p.setDirector("J.J.K");
//		p.setId(1);
//		dao.save(p);
//		
		
		Pelicula p2 = dao.findById(2).get();
		System.out.println(p2);
		
		Pelicula p3 = dao.findByTitulo("Criaturas fantasticas y donde encontrarlas");
		System.out.println(p3);
		
		List<Pelicula> listaPeliculas = dao.findAll();
		System.out.println(listaPeliculas);
		
	}

}
