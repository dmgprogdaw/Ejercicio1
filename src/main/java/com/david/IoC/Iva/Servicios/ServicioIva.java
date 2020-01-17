package com.david.IoC.Iva.Servicios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("iva")
public class ServicioIva {


	public float calcularIVA(float cant, float iva) {
		
		float precioIva = 0;
		
		precioIva = cant * iva;
		
		return precioIva;
	}
	
}
