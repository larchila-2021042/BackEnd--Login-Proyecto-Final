package com.director.controlador;


public class Login{

	IngresoDatos texto=new IngresoDatos();
	String usuario;
	String clave;
	int falso;
	ControladorUsuario cUsuario=new ControladorUsuario();
	
	public void loginInicial(){
		
		System.out.println("---------------------");
		System.out.println("Ingrese el usuario --director--o--coordinador--");
		usuario=texto.ingresarTexto();
		System.out.println("---------------------");
		System.out.println("Ingrese la clave");
		clave=texto.ingresarTexto();
		if(usuario.equals("director")){
		cUsuario.loginInicial(usuario,clave);
		}else if(usuario.equals("coordinador")){
		cUsuario.loginSecond(usuario,clave);
		}else{
		falso++;	
		}
		if(falso==1){
		System.out.println("Usuario no reconocido");
		System.exit(1);
		}
	}
	
	
	public void loginSecundario(){
		System.out.println("---------------------");
		System.out.println("Ingrese el usuario --director--o--coordinador-- o usuario ingresado");
			usuario=texto.ingresarTexto();
			System.out.println("---------------------");
			System.out.println("Ingrese la clave");
			clave=texto.ingresarTexto();
			if(usuario.equals("director")){
			cUsuario.loginInicial(usuario,clave);
			}else if(usuario.equals("coordinador")){
			cUsuario.loginSecond(usuario,clave);
			}else if(usuario.equals("alumno")){
			cUsuario.loginThird(usuario,clave);
		}else{
		falso++;	
		}
		if(falso==2){
		System.out.println("Usuario no reconocido");
		System.exit(1);
		}
		
	}

}