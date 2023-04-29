package com.director.modelo;

public class Instructor{

	String nombre;
	String apellido;
	String direccion;
	int telefono;
	int codInstructor=0;
	
		
		public Instructor(int codInstructor,String nombre,String apellido,String direccion,int telefono){
		this.nombre=nombre;
		this.apellido=apellido;
		this.codInstructor=codInstructor;
		this.direccion=direccion;
		this.telefono=telefono;
		}
		
		public Instructor(int codInstructor){
			this.codInstructor=codInstructor;
		}
		
		public String getNombre(){
			return nombre;
		}
		
		public String getApellido(){
			return apellido;
		}
		
		public String getDireccion(){
			return direccion;
		}
		
		public int getTelefono(){
			return telefono;
		}
		
		public int getCodInstructor(){
			return codInstructor;
		}
		
		public void setNombre(String nombre){
			this.nombre=nombre;
		}
		
		public void setApellido(String apellido){
			this.apellido=apellido;
		}
		
		public void setDireccion(String direccion){
			this.direccion=direccion;
		}
		
		public void setTelefono(int telefono){
			this.telefono=telefono;
		}
		

}