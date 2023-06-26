package link.softbond.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import link.softbond.entities.Problema;
import link.softbond.repositorios.ProblemaRepository;

@RestController
@RequestMapping("/problemas/list")
public class ProblemaController  {
	
	
	@Autowired
	ProblemaRepository problemaRepository;
	
	//obtener todos los problemas
	@GetMapping
	public List<Problema> getProblemasAll(){
		return problemaRepository.findAll();
	}
	
	
	/**
	@GetMapping("/{id}")
	public Usuario getUsuariosbyId(@PathVariable Integer id ) {
		
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		
		if(usuario.isPresent()) {
			return usuario.get();
		}
		
		return  null;
		
	}
	*/

}
