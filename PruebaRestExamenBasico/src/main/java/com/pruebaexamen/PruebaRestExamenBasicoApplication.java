package com.pruebaexamen;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pruebaexamen.modelo.entidad.Asignatura;
import com.pruebaexamen.modelo.entidad.Tarea;
import com.pruebaexamen.modelo.persitance.Daoasignaturas;

@SpringBootApplication
public class PruebaRestExamenBasicoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PruebaRestExamenBasicoApplication.class, args);
		Daoasignaturas dao = context.getBean("daoasignaturas", Daoasignaturas.class);
		Asignatura a = new Asignatura();
		List<Tarea> s = null;
		a.setNombre("Gafeeee");
		a.setListaTareas(s);
		dao.save(a);
		
		
		
	}

}
