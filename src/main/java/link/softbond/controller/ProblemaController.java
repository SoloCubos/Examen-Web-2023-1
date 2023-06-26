package link.softbond.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import link.softbond.entities.Problema;
import link.softbond.entities.Tabla;
import link.softbond.repositorios.ProblemaRepository;
import link.softbond.service.TablaService;

@RestController
@RequestMapping("/problemas/list")
public class ProblemaController  {
	
	
	@Autowired
	ProblemaRepository problemaRepository;
	
	@Autowired
	TablaService tablaSerrvice;
	//obtener todos los problemas
	@GetMapping
	public List<Problema> getProblemasAll(){
		return problemaRepository.findAll();
	}

	
	@GetMapping("/problemas/{id}/tablas")
	public List<Tabla> listarTablasDeProblema(@PathVariable("id") Integer id ){
		Problema problema=obtenerProblemaPorId(id);
		if(problema==null) {
			return null;
		}
		List<Tabla> tablas=tablaSerrvice.obtenerTablasPorProblema(problema);
		return tablas;
	}
	
	private Problema obtenerProblemaPorId(Integer problemaId) {
		Problema problema=problemaRepository.findById(problemaId).get();
		
		return problema;
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
