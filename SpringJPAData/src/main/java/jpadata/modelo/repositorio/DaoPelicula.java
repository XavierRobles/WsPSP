package jpadata.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpadata.modelo.entidad.Pelicula;

@Repository // hace todas las querys
public interface DaoPelicula extends JpaRepository<Pelicula, Integer> {
	
	public Pelicula findByTitulo(String titulo);

}
