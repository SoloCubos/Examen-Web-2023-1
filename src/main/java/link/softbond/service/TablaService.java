package link.softbond.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import link.softbond.entities.Problema;
import link.softbond.entities.Tabla;
import link.softbond.repositorios.TablaRepository;

@Service
public class TablaService {
	
	@Autowired
	TablaRepository tablaRepository;
	
	public List<Tabla> obtenerTablasPorProblema(Problema problema){
		List<Tabla> tablas=tablaRepository.findbyProblema(problema);
		return tablas;
	}
}
