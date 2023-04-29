package com.director.modelo;

public class UsuarioC{

	String nombreC;
	String rolC;
	String claveC;
	int idUsuarioC=0;
	
	public UsuarioC(){
		idUsuarioC=0;
		nombreC="coordinador";
		claveC="1234";
		rolC="c";
		
	}
	
	
	
		public String getNombreC(){
			return nombreC;
		}
		
		public String getRolC(){
			return rolC;
		}
		
		public String getClaveC(){
			return claveC;
		}
		
		public int getIdUsuarioC(){
			return idUsuarioC;
		}
		
		private void setNombreC(String nombreC){
			this.nombreC=nombreC;
		}
		
		private void setRolC(String rolC){
			this.rolC=rolC;
		}
		
		private void setClaveC(String claveC){
			this.claveC=claveC;
		}
		
		
}