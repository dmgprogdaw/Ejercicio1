package com.david.IoC.bean.Almacenamiento;

import org.springframework.context.annotation.Bean;

public class AlmacenamientoBuilder {

	@Bean(name="almacenamientoAlumnado")
	public AlmacenamientoBean alumnos() {
		
		AlmacenamientoBean almacenamiento = new AlmacenamientoBean();
		almacenamiento.setPath("/ficheros/alumnos");
		almacenamiento.setCapacidad(0.1f);
		
		return almacenamiento;
	}
	
	
	@Bean(name="almacenamientoProfesoradeo")
	public AlmacenamientoBean profesores() {
		
		AlmacenamientoBean almacenamiento = new AlmacenamientoBean();
		almacenamiento.setPath("/ficheros/profesores");
		almacenamiento.setCapacidad(2.0f);
		
		return almacenamiento;
	}
}
