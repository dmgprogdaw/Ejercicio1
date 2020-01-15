package com.david.IoC.bean.Almacenamiento;

public class AlmacenamientoBean {

	private String path;
	private float capacidad;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public float getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}
	
	@Override
	public String toString() {
		return "AlmacenamientoBean [path=" + path + ", capacidad=" + capacidad + "]";
	}
	
}
