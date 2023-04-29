package com.director.controlador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IngresoDatos{
	
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	String datos=null;
	int numero=0;
	char caracter;
	
	public String ingresarTexto(){
	try{
		datos=bf.readLine();	
		}catch(IOException ioe){
				System.out.println("Error de texto");
				System.exit(1);
		} return datos;
	}
		
	public int ingresarNumero(){
	try{
		numero=Integer.parseInt(bf.readLine());
		}catch(IOException ioe){
				System.out.println("Digito desconocido");
				System.exit(1);
		}return numero;
	 }
	 
	 
	public char leerCaracter(){
	try{
		caracter=datos.charAt(0);
		}catch(NullPointerException ioe){
			System.out.println("caracter irreconocible");
			System.exit(1);
		}return caracter;
	}
	

}