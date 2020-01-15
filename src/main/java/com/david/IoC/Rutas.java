package com.david.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.david.IoC.servicios.Almacenamiento.Almacenamiento;

@Controller
public class Rutas {

	@Autowired
	@Qualifier("alumno")
	Almacenamiento alumno;
	
	@Autowired
	@Qualifier("profesor")
	Almacenamiento profesor;
	
	
	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		
		return null;
	}
	
	
	@GetMapping("/ficheros/profesores")
	@ResponseBody
	public String rutaProfesores() {
		
		return profesor.getRuta() + " " + profesor.getCapacidad();
	}
	
	
	@GetMapping("/ficheros/alumnos")
	@ResponseBody
	public String rutaAlumnos() {
		
		return alumno.getRuta() + " " + alumno.getCapacidad();
	}
	
	@GetMapping("/precio/francia/{cantidad")
	@ResponseBody
	public String rutaFrancia() {
		

		return null;
	}
	
	@GetMapping("/precio/espania/{cantidad")
	@ResponseBody
	public String rutaEspania() {
		

		return null;
	}
}

