package com.david.IoC.bean.Iva;

import org.springframework.context.annotation.Bean;

public class IvaBuilder {

	
	@Bean
	public IVA francia() {
		
		IVA iva = new IVA();
		iva.setRuta("/precio/francia/{cantidad}");
		iva.setIva(0.25f);
		
		return iva;
	}
	
	
	@Bean 
	public IVA españa() {
		
		IVA iva = new IVA();
		iva.setRuta("/precio/españa/{cantidad}");
		iva.setIva(0.21f);
		
		return iva;
	}
}
