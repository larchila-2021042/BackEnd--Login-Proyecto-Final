package com.director.controlador;
import com.director.modelo.Instructor;
import java.util.ArrayList;
import java.util.Formatter;

public class ControladorInstructor{
	ArrayList<Instructor> lInstruc=new ArrayList<Instructor>();
	IngresoDatos texto=new IngresoDatos();
	
	String nombre;
	String apellido;
	String direccion;
	String dato;
	int telefono;
	int falso;
	int contador;
	Formatter archivo = null;
	
		public void ingresarInstructor(int codInstructor,String nombre,String apellido,String direccion,int telefono){
		lInstruc.add(new Instructor(codInstructor,nombre,apellido,direccion,telefono));
		dato=texto.ingresarTexto();	
		}
	
		public void reporteInstructor(){
			for(Instructor i: lInstruc){
			System.out.println("Mostrando arreglo del curso");
		System.out.println(i.getCodInstructor()+" | "+i.getNombre()+" | "+i.getApellido()+" | "+i.getDireccion()+" | "+i.getTelefono());
		}
	}
		
	
		public void buscarInstructor(int codInstructor){	
			for(Instructor in:lInstruc){
				if(codInstructor==in.getCodInstructor()){
					System.out.println("---------------------");
					System.out.println("Instructor encontrado");
					System.out.println(in.getCodInstructor()+" | "+in.getNombre()+" | "+in.getApellido()+" | "+in.getDireccion()+" | "+in.getTelefono());
					System.out.println("---------------------");
					System.out.println("Ingrese nuevo instructor");
					nombre=texto.ingresarTexto();
					System.out.println("---------------------");
					System.out.println("Ingrese nuevo apellido");
					apellido=texto.ingresarTexto();
					System.out.println("---------------------");
					System.out.println("Ingrese nueva direccion");
					direccion=texto.ingresarTexto();
					System.out.println("---------------------");
					System.out.println("Ingrese nuevo numero de telefono");
					telefono=texto.ingresarNumero();
					in.setNombre(nombre);
					in.setApellido(apellido);
					in.setDireccion(direccion);
					in.setTelefono(telefono);				
					}else{
					falso++;
					}
					}
				if(falso==lInstruc.size()){
				System.out.println("Instructor no encontrado");
				}
		System.out.println("Mostrando Instructor modificado");
		for(Instructor in:lInstruc){
			System.out.println("---------------------");
		System.out.println(in.getCodInstructor()+" | "+in.getNombre()+" | "+in.getApellido()+" | "+in.getDireccion()+" | "+in.getTelefono());
		}
	}
	
	public void eliminarInstructor(int codInstructor){
		
		for(Instructor in:lInstruc){
			if(codInstructor==in.getCodInstructor()){
				System.out.println("Instructor encontrado");
				System.out.println("---------------------");
				System.out.println(in.getCodInstructor()+" | "+in.getNombre()+" | "+in.getApellido()+" | "+in.getDireccion()+" | "+in.getTelefono());
				lInstruc.remove(contador);
				break;
				}else{
				falso++;	
				}
				contador++;
			}
		if(falso==lInstruc.size()){
			System.out.println("Instructor no encontrado");
		}
	}
	
	public void asignarInstructor(int getCod){
		for(Instructor in:lInstruc){
			if(getCod==in.getCodInstructor()){
				System.out.println("Instructor encontrado");
				System.out.println("---------------------");
				System.out.println(in.getCodInstructor()+"   "+in.getNombre()+" | "+in.getApellido()+" | "+in.getDireccion()+" | "+in.getTelefono());
				System.out.println("Instructor seleccionado | "+in.getNombre());
			}else{
				falso++;
				}
				}
				if(falso==lInstruc.size()){
			System.out.println("Instructor no encontrado o ya asignado");	
		}
	}
	
	public void asignacion(int getCod){
		for(Instructor in:lInstruc){
			if(getCod==in.getCodInstructor()){
			System.out.println("Instructor seleccionado | "+in.getNombre());
			break;
			}else{
					falso++;
					}
					}
				if(falso==lInstruc.size()){
				System.out.println("Instructor no encontrado");
			}
		}
		
		public void generarReporte(String ruta){
			for(Instructor in:lInstruc){
			try{
				archivo = new Formatter(ruta+"\\Archivo.txt");
				archivo.format(in.getNombre()+" | "+in.getApellido()+" | "+in.getDireccion()+" | "+in.getTelefono());
			}catch(Exception e){
				System.out.println("Ha ocurrido un error: " +e.toString());
			}finally{
				archivo.close();
			}
		}
		}
	}
