package com.director.vista;
import com.director.controlador.*;

public class MenuPrincipal{
	IngresoDatos texto=new IngresoDatos();
	Login log=new Login();
	

	public void menuUsuario(){
		log.loginInicial();
	}
}