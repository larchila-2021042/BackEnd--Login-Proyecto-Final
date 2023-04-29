package com.director.controlador;
import com.director.modelo.Usuario;
import com.director.modelo.UsuarioC;
import com.director.controlador.Login;
import java.util.ArrayList;
import java.util.Formatter;

public class ControladorUsuario{
	ArrayList<Usuario> usuario=new ArrayList<Usuario>();
	IngresoDatos texto=new IngresoDatos();
	Usuario us=new Usuario();
	UsuarioC uC=new UsuarioC();
	PantDirector pDirector=new PantDirector();
	PantCoordinador pCoordinador=new PantCoordinador();
	 static Login lg=new Login();
	
	String dato;
	Formatter archivo = null;
			
		public void loginInicial(String user,String clave){		
			if(user.equals(us.getNombre())&& clave.equals(us.getClave())){
			if(us.getRol().equals("d")){
				pDirector.menuPrincipal();
				}else if(us.getRol().equals("c")){
				pCoordinador.menuPrincipal();
				}else if(us.getRol().equals("a")){
				}
			}else{
			System.out.println("Credenciales incorrectas");
		}
	}
	
		public void loginSecond(String user,String clave){		
			if(user.equals(uC.getNombreC())&& clave.equals(uC.getClaveC())){
				if(uC.getRolC().equals("c")){
				pCoordinador.menuPrincipal();
				}else if(uC.getRolC().equals("a")){
				}
				}else{
			System.out.println("Credenciales incorrectas");
		}
	}	
	
		public void loginThird(String user,String clave){
			if(user.equals(us.getNombre())&& clave.equals(us.getClave())){
				System.out.println("Usuario encontrado");
				System.out.println("Materias no asignadas");
				}else{
				System.out.println("Credenciales incorrectas");
				}
				System.out.println("Desea regresar al login?");
				dato=texto.ingresarTexto();
				if(dato.equals("si")){
				System.out.println("regressando al login");
				lg.loginSecundario();
			}else{
		System.exit(1);
		}										
	}
	
		public void ingresarUsuario(int id,String nombre,String clave,String rol){
			usuario.add(new Usuario(id,nombre,clave,rol));
		System.out.println("Nuevo Usuario Ingresado");
		System.out.println("---------------------");
	}
		
		public void reporteUsuario(){
			for(Usuario us: usuario){
			System.out.println("Mostrando Usuario agregado");
			System.out.println("---------------------");
		System.out.println(us.getIdUsuario()+"   "+us.getNombre()+"   "+us.getClave()+"   "+us.getRol());
		}
	}
	
	public void generarReporte(String ruta){
			for(Usuario us: usuario){
			try{
				archivo = new Formatter(ruta+"\\Archivo.txt");
				archivo.format(us.getNombre()+" | "+us.getClave()+" | "+us.getRol());
			}catch(Exception e){
				System.out.println("Ha ocurrido un error: " +e.toString());
			}finally{
				archivo.close();
			}
		}
		}

}