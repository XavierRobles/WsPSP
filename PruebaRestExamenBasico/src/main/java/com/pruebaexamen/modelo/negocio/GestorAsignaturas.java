package com.pruebaexamen.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.pruebaexamen.modelo.entidad.Asignatura;
import com.pruebaexamen.modelo.entidad.Tarea;
import com.pruebaexamen.modelo.persitance.Daoasignaturas;
@Service
public class GestorAsignaturas {
	@Autowired
	private Daoasignaturas dao;

	public List<Asignatura> listar(){
		//aqui podria poner toda la  logica de negocio de mi app
		//ejempolos:
		//1- puede el usuario consultar las personas
		//2- Tengo que mostrar todas las personas o solo algunas?
		List<Asignatura> lista = dao.findAll();

		return lista;
	}

	public Asignatura alta(Asignatura asignatura) {
			if(asignatura.getNombre().length() < 3) {
				return null;
			}
		return asignatura;
	}

}
