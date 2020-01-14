package com.david.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.david.IoC.bean.Alumnos.AlumnoBean;
import com.david.IoC.bean.Profesores.ProfesorBean;
import com.david.IoC.servicios.ComponenteClases;

@Controller
public class Rutas {

	@Autowired
	AlumnoBean pedro;
	
	@Autowired
	@Qualifier("pedro")
	AlumnoBean maria;
	
	@Autowired
	ProfesorBean alba;
	
	@Autowired
	@Qualifier("alba")
	ProfesorBean andres;
	
	/*@Autowired
	ComponenteClases asignaturas;*/
	
	
	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		
		
		String salidaAlumnos = "";
		String salidaProfesores = "";
		
		salidaAlumnos  += pedro.toString() + "<br>";
		maria.setNombre("Maria");
		maria.setCurso("2º Bachillerato");
		salidaAlumnos  += maria.toString();
		
		salidaProfesores += alba.toString() +"<br>";
		andres.setNombre("Andres");
		andres.setAsignatura("Lengua");		
		salidaProfesores += andres.toString();
		
		return  "*******Alumnos*******" + "<br>" + salidaAlumnos + "<br>" + "*******Profesores*******" + "<br>" + salidaProfesores;
		/*String mostrar = "";
		for(String str:asignaturas.getAsignatura()) {
			
			mostrar += str + "<br>";
		}*/
	}
	
	
	@GetMapping("/ficheros/profesores")
	@ResponseBody
	public String rutaProfesores() {
		
		String lista = "<ol>";
		lista += "<li>" + alba.toString() + "</li>";
		
		andres.setNombre("Andres");
		andres.setAsignatura("Lengua");
		
		lista += "<li>" + andres.toString() + "</li>" + "</ol>";

		
		return lista;
	}
	
	
	@GetMapping("/ficheros/alumnos")
	@ResponseBody
	public String rutaAlumnos() {
				
		String lista = "<ol>";
		lista += "<li>" + pedro.toString() + "</li>"; 
		
		maria.setNombre("Maria");
		maria.setCurso("2º Bachillerato");
		
		lista += "<li>" + maria.toString() + "</li>" + "</ol>";
			
		return lista;
	}
}

