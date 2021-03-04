package com.restconcesionario;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.restconcesionario.modelo.entidad.Vehiculo;
import com.restconcesionario.modelo.proxy.VehiculoProxy;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = 
				SpringApplication.run(Application.class, args);
				
		VehiculoProxy vProxy = 
				context.getBean("vehiculoProxy",VehiculoProxy.class);
		
		System.out.println("LISTAR");
		List<Vehiculo> listaVehiculos = vProxy.listar();
		System.out.println(listaVehiculos);
		
		System.out.println("OBTENER");
		Vehiculo v2 = vProxy.obtener(1);
		System.out.println(v2);
		
		Vehiculo v1 = new Vehiculo();
		//no le ponemos el id, porque el servicio rest me asignara el id
		v1.setMarca("Opellhhoas");
		v1.setModelo("Astra GTCladahh");
		v1.setMatricula("7918GHasXlhhj");
		v1.setPotencia(200);
		/*
		System.out.println("ALTA");
		v1 = vProxy.alta(v1);
		//con la respuesta del servicio rest, ya tengo el objeto con el id
		System.out.println(v1);
		v2 = new Vehiculo();
		
		v2.setMarca("Opehh");
		v2.setModelo("Astra Zafira");
		v2.setMatricula("8018GHXhhh");
		v2.setPotencia(100);
		
	
		System.out.println("MODIFICAR");
		Vehiculo v3 = vProxy.modificar(v1);
		
		System.out.println(v3);
//			*/
//		System.out.println("BORRAR");
//		vProxy.borrar(28);
//		System.out.println("Vehiculo borrado");
		
		System.out.println("LISTAR");
		listaVehiculos = vProxy.listar();
		System.out.println(listaVehiculos);
		
	}

}
