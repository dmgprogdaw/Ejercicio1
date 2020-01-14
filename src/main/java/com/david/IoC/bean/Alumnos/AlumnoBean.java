package com.david.IoC.bean.Alumnos;

public class AlumnoBean {

	private String nombre;
	private String curso;
	private double capacidad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	@Override
	public String toString() {
		return nombre + " "  + curso + " " + capacidad+"GB";
	}
	
	
}
