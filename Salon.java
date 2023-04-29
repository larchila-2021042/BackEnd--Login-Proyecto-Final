package com.director.modelo;

public class Salon{

	String nombre;
	int cantidad;
	int codSalon=0;
	
	
		public Salon(int codSalon,String nombre,int cantidad){
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.codSalon=codSalon;
		}
	
		public String getNombre(){
			return nombre;
		}
		
		public int getCantidad(){
			return cantidad;
		}
		
		public int getCodSalon(){
			return codSalon;
		}
		
		public void setNombre(String nombre){
			this.nombre=nombre;
		}
		
		public void setCantidad(int cantidad){
			this.cantidad=cantidad;
		}

}