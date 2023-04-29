package com.director.controlador;
import com.director.modelo.Materia;
import java.util.ArrayList;
import java.util.Formatter;

public class ControladorMateria{
	ArrayList<Materia> cMateria=new ArrayList<Materia>();
	IngresoDatos texto=new IngresoDatos();
	
	String dato;
	int falso;
	int contador;
	String busqueda;
	Formatter archivo = null;
	
	public void ingresarMateria(int idMateria,String nombre,String descripcion){
		cMateria.add(new Materia(idMateria,nombre,descripcion));
	dato=texto.ingresarTexto();			
	}
	
	public void reporteMateria(){
	for(Materia m: cMateria){
		System.out.println("---------------------");
		System.out.println("Mostrando arreglo del curso");
	System.out.println(m.getCodMateria()+" | "+m.getNombre()+" | "+m.getDescrip());
		}
	}
	
	public void buscarMateria(int codMateria){
	
		for(Materia ma:cMateria){
			if(codMateria==ma.getCodMateria()){
				System.out.println("---------------------");
				System.out.println("Materia encontrada");
				System.out.println(ma.getCodMateria()+" | "+ma.getNombre()+" | "+ma.getDescrip());
				System.out.println("---------------------");
				System.out.println("Ingrese nueva materia");
				busqueda=texto.ingresarTexto();
				System.out.println("---------------------");
				System.out.println("Ingrese la nueva descripcion");
				dato=texto.ingresarTexto();
				ma.setNombre(busqueda);
				ma.setDescrip(dato);	
				}else{
				falso++;
				}
				}if(falso==cMateria.size()){
				System.out.println("Materia no encontrada");
				}		
			System.out.println("Mostrando materiaa modificada");
		for(Materia ma:cMateria){
		System.out.println(ma.getCodMateria()+" | "+ma.getNombre()+" | "+ma.getDescrip());
		}
	}
	
	public void eliminarMateria(int codMateria){
		
		for(Materia ma:cMateria){
			if(codMateria==ma.getCodMateria()){
				System.out.println("---------------------");
				System.out.println("Materia encontrada");
				System.out.println(ma.getCodMateria()+" | "+ma.getNombre()+" | "+ma.getDescrip());
				cMateria.remove(contador);
				break;
				}else{
				falso++;	
				}
				contador++;
				}
			if(falso==cMateria.size()){
				System.out.println("---------------------");
		System.out.println("Materia no encontrada");
		}
	}
	
	public void asignarMateria(int getCod){
		for(Materia ma:cMateria){
			if(getCod==ma.getCodMateria()){
				System.out.println("---------------------");
				System.out.println("Materia encontrada");
				System.out.println("------------------");
				System.out.println(ma.getCodMateria()+" | "+ma.getNombre()+" | "+ma.getDescrip());
				System.out.println("El instructor seleccionado impartira la materia de " +ma.getNombre());
			}else{
		falso++;
			}
		}
		if(falso==cMateria.size()){
			System.out.println("Materia no encontrada o ya asignada");
			
		}
	}
	
	public void asignacion(int getCod){
		for(Materia ma:cMateria){
			if(getCod==ma.getCodMateria()){
			System.out.println("Materia seleccionada | "+ma.getNombre());
			}else{
				falso++;
				}
				}if(falso==cMateria.size()){
					System.out.println("---------------------");
				System.out.println("Materia no encontrada");
			}		
		}
		
		public void generarReporte(String ruta){
			for(Materia ma:cMateria){
			try{
				archivo = new Formatter(ruta+"\\Archivo.txt");
				archivo.format(ma.getNombre()+" | "+ma.getDescrip());
			}catch(Exception e){
				System.out.println("Ha ocurrido un error: " +e.toString());
			}finally{
				archivo.close();
			}
		}
		}
	}

