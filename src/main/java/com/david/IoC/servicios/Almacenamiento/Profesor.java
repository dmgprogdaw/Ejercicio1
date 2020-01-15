package com.david.IoC.servicios.Almacenamiento;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("profesor")
public class Profesor implements Almacenamiento {
	
	@Override
	public String getRuta() {

		return "/ficheros/profesor";
	}

	@Override
	public float getCapacidad() {

		return 2f;
	}


		
}
