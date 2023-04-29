package com.director.controlador;
import com.director.modelo.*;
import java.util.ArrayList;
import java.util.Formatter;

public class ControladorSalon{
	ArrayList<Salon> lSalon=new ArrayList<Salon>();
	static IngresoDatos texto=new IngresoDatos();
	
	String dato;
	int falso;
	int digito;
	int contador;
	String busqueda;
	Formatter archivo = null;

	public void ingresarSalon(int idSalon,String nombre,int cantidad){
		lSalon.add(new Salon(idSalon,nombre,cantidad));
		dato=texto.ingresarTexto();
			
	}
	
	public void buscarSalon(int codSalon){
		for(Salon sa:lSalon){
			if(codSalon==sa.getCodSalon()){
				System.out.println("Salon encontrado");
				System.out.println("---------------------");
				System.out.println(sa.getCodSalon()+" | "+sa.getNombre()+" | "+sa.getCantidad());
				System.out.println("Ingrese nuevo salon");
				busqueda=texto.ingresarTexto();
				System.out.println("Ingrese la nueva cantidad");
				digito=texto.ingresarNumero();
				sa.setNombre(busqueda);
				sa.setCantidad(digito);	
			}else{
		falso++;
			}
		}
		if(falso==lSalon.size()){
			System.out.println("---------------------");
			System.out.println("Salon no encontrado");
		}
		
		System.out.println("Mostrando salon modificado");
		for(Salon sa:lSalon){
		System.out.println(sa.getCodSalon()+" | "+sa.getNombre()+" | "+sa.getCantidad());
		}
	}
	
	public void reporteSalon(){
		for(Salon s: lSalon){
		System.out.println("Mostrando arreglo del Salon");
		System.out.println("---------------------");
		System.out.println(s.getCodSalon()+" | "+s.getNombre()+" | "+s.getCantidad());
		}
	}
	
	public void eliminarSalon(int codSalon){
		
		for(Salon sa:lSalon){
			if(codSalon==sa.getCodSalon()){
				System.out.println("Salon encontrado");
				System.out.println("---------------------");
				System.out.println(sa.getCodSalon()+" | "+sa.getNombre()+" | "+sa.getCantidad());
				lSalon.remove(contador);
				break;
				}else{
				falso++;	
				}
				contador++;
			}
		if(falso==lSalon.size()){
			System.out.println("Salon no encontrado");
		}
	}
	
	
	
	public void asignarSalon(int getCod){
	
	for(Salon sa:lSalon){
			if(getCod==sa.getCodSalon()){
				System.out.println("Salon encontrado");
				System.out.println("----------------");
				System.out.println(sa.getCodSalon()+" | "+sa.getNombre()+" | "+sa.getCantidad());
				System.out.println("El salon asignado es | "+sa.getNombre());
			}else{
		falso++;
			}
		}
		if(falso==lSalon.size()){
			System.out.println("Salon no encontrado");
		}
	}
	
	public void asignacion(int getCod){
		for(Salon sa:lSalon){
			if(getCod==sa.getCodSalon()){
			System.out.println("Salon seleccionado | "+sa.getNombre());
			}else{
		falso++;
			}
		}
		if(falso==lSalon.size()){
			System.out.println("Salon no encontrado");
			}
		}
		
		public void generarReporte(String ruta){
			for(Salon sa:lSalon){
			try{
				archivo = new Formatter(ruta+"\\Archivo.txt");
				archivo.format(sa.getNombre()+" | "+sa.getCantidad());
			}catch(Exception e){
				System.out.println("Ha ocurrido un error: " +e.toString());
			}finally{
				archivo.close();
			}
		}
		}
	}

