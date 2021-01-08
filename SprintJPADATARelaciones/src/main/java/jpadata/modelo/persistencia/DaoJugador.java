package jpadata.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import jpadata.modelo.entidad.Jugador;

public interface DaoJugador extends JpaRepository<Jugador, Integer> {

}
