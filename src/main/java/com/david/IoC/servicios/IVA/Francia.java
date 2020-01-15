package com.david.IoC.servicios.IVA;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("francia")
public class Francia implements InterfazIVA{

	@Override
	public String getRuta() {
		
		return "/precio/francia/{cantidad}";
	}

	@Override
	public float getIva() {

		return 0.25f;
	}

	
}
