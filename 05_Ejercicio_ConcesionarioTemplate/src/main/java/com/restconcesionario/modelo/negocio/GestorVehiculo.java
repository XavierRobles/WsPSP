package com.restconcesionario.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restconcesionario.modelo.entidad.Vehiculo;
import com.restconcesionario.modelo.persistencia.DaoVehiculo;

@Service
public class GestorVehiculo {
	@Autowired
	private DaoVehiculo daovehiculo;

	public List<Vehiculo> listarVehiculos() {
		List<Vehiculo> lista = daovehiculo.findAll();
		return lista;
	}

	public Vehiculo obtenerVehiculo(int id) {
		Optional<Vehiculo> opt = daovehiculo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;

	}
	
	public Vehiculo altaVehiculo(Vehiculo vehiculo) {
		Vehiculo v = daovehiculo.save(vehiculo);
		
		return v;
		
	}
	
	public Vehiculo modificarVehiculo(Vehiculo vehiculo) {
		//Optional<Vehiculo> opt = daovehiculo.findById(id);
		//if (opt.isPresent()) {
			Vehiculo v = daovehiculo.save(vehiculo);
			return v;
		//}
		
		//return null;
		
	}
	public boolean borraVehiculo(int id) {
		if (daovehiculo.findById(id).isPresent()) {
			daovehiculo.deleteById(id);
			
		}
		return false;
		
		
	}

}
