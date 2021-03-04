package com.pruebaexamen.modelo.persitance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebaexamen.modelo.entidad.Asignatura;

@Repository
public interface Daoasignaturas extends JpaRepository<Asignatura, Integer> {
		

}
