package com.david.IoC.bean.Profesores;


public class ProfesorBean {

	private String nombre;
	private String asignatura;
	private double capacidad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	@Override
	public String toString() {
		return nombre + " " + asignatura + " " + capacidad+"GB";
	}
		
}
