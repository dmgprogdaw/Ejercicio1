package com.david.IoC.bean.Alumnos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.david.IoC.Almacenamiento;

@Component
public class Alumno implements Almacenamiento{

	@Qualifier("alumno")
	
	@Override
	public String getPath() {
		
		return "/ficheros/alumno";
	}

	@Override
	public double getCapacidad() {

		return 0.1;
	}

	
}
