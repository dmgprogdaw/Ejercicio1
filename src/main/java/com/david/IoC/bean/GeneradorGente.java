package com.david.IoC.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.david.IoC.bean.Alumnos.AlumnoBean;
import com.david.IoC.bean.Profesores.ProfesorBean;

@Configuration
public class GeneradorGente {

	@Bean
	public AlumnoBean pedro() {
		
		AlumnoBean alumno = new AlumnoBean();
		alumno.setNombre("Pedro");
		alumno.setCurso("1º ESO");
		alumno.setCapacidad(0.1);
		
		return alumno;
	}
	
	
	@Bean
	public ProfesorBean alba() {
		
		ProfesorBean profesor = new ProfesorBean();
		profesor.setNombre("Alba");
		profesor.setAsignatura("Matematicas");
		profesor.setCapacidad(2.0);
		
		return profesor;
	}
	
}
