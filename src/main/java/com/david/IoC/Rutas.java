package com.david.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.david.IoC.Iva.Servicios.InterfazIVA;
import com.david.IoC.Iva.Servicios.ServicioIva;
import com.david.IoC.servicios.Almacenamiento.Almacenamiento;

@Controller
public class Rutas {

	@Autowired
	@Qualifier("alumno")
	Almacenamiento alumno;
	
	@Autowired
	@Qualifier("profesor")
	Almacenamiento profesor;
	
	@Autowired
	@Qualifier("francia")
	InterfazIVA francia;
	
	@Autowired
	@Qualifier("espania")
	InterfazIVA espania;
	
	@Autowired
	@Qualifier("iva")
	ServicioIva servicioIva;
	
	
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
	
	@GetMapping("/precio/francia/{cantidad}")
	@ResponseBody
	public String rutaFrancia(@PathVariable float cantidad) {
		
		float precioFinal = 0;
		float precioIVA = 0;
		String resultado;
		
		precioIVA = servicioIva.calcularIVA(cantidad, francia.getIva());
		
		precioFinal = cantidad + precioIVA;
		
		
		return resultado = "El precio original era: " + cantidad + "<br>" + 
						   "El porcentaje de IVA es: " + francia.getIva() + "<br>" + 
						   "El IVA es: " + precioIVA + "<br>" + 
						   "El precio final es: " + precioFinal;
	}
	
	@GetMapping("/precio/espania/{cantidad}")
	@ResponseBody
	public String rutaEspania(@PathVariable float cantidad) {
		
		float precioFinal = 0;
		float precioIVA = 0;
		String resultado;
		
		precioIVA = servicioIva.calcularIVA(cantidad, espania.getIva());
		
		precioFinal = cantidad + precioIVA;
			
		
		return resultado = "El precio original era: " + cantidad + "<br>" + 
				   		   "El porcentaje de IVA es: " + espania.getIva() + "<br>" + 
				   		   "El IVA es: " + precioIVA + "<br>" + 
				   		   "El precio final es: " + precioFinal;
	}
}

