package com.david.IoC.servicios.IVA;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("espania")
public class Espania implements InterfazIVA{

	@Override
	public String getRuta() {

		return "/precio/espania/{cantidad}";
	}

	@Override
	public float getIva() {

		return 0.21f;
	}

	
}
