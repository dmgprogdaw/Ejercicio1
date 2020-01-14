package com.david.IoC.servicios;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ComponenteClases {

	
	public String[] getAsignatura() {
		
		String[] asignaturas = {"Lengua", "Matematicas"};
		
		return asignaturas;
	}
}
