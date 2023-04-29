package com.director.modelo;

public class Materia{

	String nombre;
	String descripcion;
	int codMateria=0;
	
		public Materia(int codMateria,String nombre,String descripcion){
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.codMateria=codMateria;
		}
		
		public String getNombre(){
			return nombre;
		}
		
		public String getDescrip(){
			return descripcion;
		}
		
		public int getCodMateria(){
			return codMateria;
		}
		
		public void setNombre(String nombre){
			this.nombre=nombre;
		}
		
		public void setDescrip(String descripcion){
			this.descripcion=descripcion;
		}
		
		
}