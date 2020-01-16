package com.david.IoC.servicios.IVA;

import org.springframework.stereotype.Service;

@Service
public class Operaciones {

	
	
	public static float sacarIva(float cant, float iva) {
		
		float precioIva = 0;
		
		precioIva = cant * iva;
		
		return precioIva;
	}
	
}
