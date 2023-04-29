package com.director.modelo;

public class Usuario{

	String nombre;
	String rol;
	String clave;
	int idUsuario=0;
	
	public Usuario(){
		idUsuario=0;
		nombre="director";
		clave="1234";
		rol="d";	
	}
	
	
	public Usuario(int idUsuario,String nombre,String clave,String rol){
		this.idUsuario=idUsuario;
		this.nombre=nombre;
		this.clave=clave;
		this.rol=rol;
	}
	
	
		public String getNombre(){
			return nombre;
		}
		
		public String getRol(){
			return rol;
		}
		
		public String getClave(){
			return clave;
		}
		
		public int getIdUsuario(){
			return idUsuario;
		}
		
		private void setNombre(String nombre){
			this.nombre=nombre;
		}
		
		private void setRol(String rol){
			this.rol=rol;
		}
		
		private void setClave(String clave){
			this.clave=clave;
		}
		
		
}