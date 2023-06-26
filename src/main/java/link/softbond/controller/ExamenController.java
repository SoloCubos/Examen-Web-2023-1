package link.softbond.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import link.softbond.entities.Examen;
import link.softbond.repositorios.ExamenRepository;

@RestController
@RequestMapping("/examenes")
public class ExamenController {
	
	
	@Autowired
	ExamenRepository examenRepository;
	
	@GetMapping("/{id}/listar")
	public Examen getExamenbyId(@PathVariable Integer id ) {
		
		Optional<Examen> examen = examenRepository.findById(id);
		
		if(examen.isPresent()) {
			return examen.get();
		}
		
		return  null;
		
	}

}
