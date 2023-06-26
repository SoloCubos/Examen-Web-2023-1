package link.softbond.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import link.softbond.dto.UsuarioDTO;
import link.softbond.entities.Usuario;
import link.softbond.repositorios.UsuarioRepository;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    
    @GetMapping("/{email}/login/{clave}")
	public Boolean login(@PathVariable String email,@PathVariable String clave) {
		Optional<Usuario>userCurrent=usuarioRepository.findByEmail(email);
		if(userCurrent.isPresent()) {
			if(userCurrent.get().getClave().equals(clave)) {
				return true;
			}
		}
		return false;
	}
    
    @PostMapping(path = "/registrar")
    public ResponseEntity<?> registrar(@RequestBody UsuarioDTO usuarioDTO){
        try {
            Usuario usuario = Usuario.builder()
                                     .usuario(usuarioDTO.getUsuario())
                                     .nombre(usuarioDTO.getNombre())
                                     .clave(passwordEncoder.encode(usuarioDTO.getClave()))
                                     .email(usuarioDTO.getEmail())
                                     .estado(usuarioDTO.getEstado())
                                     .build();

            return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.save(usuario));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Ha ocurrido un error: " + e + " .\"}");
        }
    }

}
