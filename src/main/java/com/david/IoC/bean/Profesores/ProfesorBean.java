package com.david.IoC.bean.Profesores;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.david.IoC.Almacenamiento;

@Component
public class ProfesorBean implements Almacenamiento {

	@Qualifier("profesor")
	
	@Override
	public String getPath() {

		return "/ficheros/profesor";
	}

	@Override
	public double getCapacidad() {

		return 2;
	}


		
}
