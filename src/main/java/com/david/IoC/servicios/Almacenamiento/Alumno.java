package com.david.IoC.servicios.Almacenamiento;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("alumno")
public class Alumno implements Almacenamiento{
	
	@Override
	public String getRuta() {
		
		return "/ficheros/alumno";
	}

	@Override
	public float getCapacidad() {

		return 0.1f;
	}

	
}
