package link.softbond.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import link.softbond.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	public Optional<Usuario> findByEmail(String email) ;

}
