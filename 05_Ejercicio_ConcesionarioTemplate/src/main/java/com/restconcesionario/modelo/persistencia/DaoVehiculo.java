package com.restconcesionario.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restconcesionario.modelo.entidad.Vehiculo;

public interface DaoVehiculo extends JpaRepository<Vehiculo, Integer> {

}
