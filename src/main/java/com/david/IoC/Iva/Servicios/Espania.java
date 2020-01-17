package com.david.IoC.Iva.Servicios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("espania")
public class Espania implements InterfazIVA{

	@Override
	public float getIva() {

		return 0.21f;
	}

	
}
