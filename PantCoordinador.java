package com.director.controlador;
public class PantCoordinador{

	IngresoDatos texto=new IngresoDatos();
	ControladorMateria cM=new ControladorMateria();
	ControladorInstructor cI=new ControladorInstructor();
	ControladorSalon cS=new ControladorSalon();
	static Login lg=new Login();
	
	
	String datos;
	String dato2;
	String descrip;
	int opcion;
	int dato3;
	int codMateria=0;
	int codInstructor=1000;


	public void menuPrincipal(){
		System.out.println("------------------------------------------------");
		System.out.println("----Bienvenido Coordinador----");
		System.out.println("1....Materia....");
		System.out.println("2....Instructor....");
		System.out.println("3....Asignar Materia");
		System.out.println("4....Salir");
		System.out.println("------------------------------------------------");
		opcion=texto.ingresarNumero();
		switch(opcion){
			
			case 1:
			this.menuMateria();
			break;
			
			case 2:
			this.menuInstructor();
			break;
			
			case 3:
			this.menuAsignar();
			break;
			
			case 4:
			lg.loginSecundario();
			break;
			
			default:
			System.out.println("Opcion ingresada irreconocible");
			break;
		}
	}

	public void menuMateria(){
		do{
		System.out.println("------------------------------------------------");
		System.out.println("----Bienvenido a Materia----");
		System.out.println("1....Crear....");
		System.out.println("2....Modificar....");
		System.out.println("3....Elminar....");
		System.out.println("4....regresar....");
		System.out.println("------------------------------------------------");
		opcion=texto.ingresarNumero();
		switch(opcion){
			case 1:
			do{
			codMateria++;
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese la nueva materia");
			datos=texto.ingresarTexto();
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese la descripcion de la clase");
			descrip=texto.ingresarTexto();
			cM.ingresarMateria(codMateria,datos,descrip);
			cM.reporteMateria();
			System.out.println("Desea agregar otro?");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
		}while(datos.equals("si"));
			
			break;
			
			case 2:
			do{
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese el codigo de la materia que desea modificar");
			dato3=texto.ingresarNumero();
			cM.buscarMateria(dato3);
			System.out.println("Desea agregar otro?");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
			}while(datos.equals("si"));
			System.out.println("Desea ver reporte de las Materias?");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
			if(datos.equals("si")){
			cM.reporteMateria();
			}
			break;
			
		    case 3:
			do{
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese el codigo de la materia que desea eliminar");
			dato3=texto.ingresarNumero();
			cM.eliminarMateria(dato3);
			System.out.println("Desea eliminar otro?");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
			}while(datos.equals("si"));
			System.out.println("Desea ver reporte de las Materias?");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
			if(datos.equals("si")){
			cM.reporteMateria();
			}
			break;
			
			case 4:
			this.menuPrincipal();
			break;
			
			default:
			System.out.println("Opcion ingresada irreconocible");
			break;
		}
		System.out.println("Desea realizar otra opcion en materia?");
		datos=texto.ingresarTexto();
		datos=datos.toLowerCase();
		}while(datos.equals("si"));
		
		System.out.println("desea regresar a menu principal?");
		datos=texto.ingresarTexto();
		datos=datos.toLowerCase();
		if(datos.equals("si")){
			this.menuPrincipal();
		}
	}
	
	
	public void menuInstructor(){
		do{
		System.out.println("------------------------------------------------");
		System.out.println("----Bienvenido a Instructor----");
		System.out.println("1....Crear....");
		System.out.println("2....Modificar....");
		System.out.println("3....Eliminar....");
		System.out.println("4....Regresar....");
		System.out.println("------------------------------------------------");
		opcion=texto.ingresarNumero();
		switch(opcion){
			case 1:
			do{
			codInstructor++;
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese el nuevo instructor");
			datos=texto.ingresarTexto();
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese apellido");
			descrip=texto.ingresarTexto();
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese la direccion");
			dato2=texto.ingresarTexto();
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese numero de telefono");
			dato3=texto.ingresarNumero();
			cI.ingresarInstructor(codInstructor,datos,descrip,dato2,dato3);
			cI.reporteInstructor();
			System.out.println("Desea agregar otro");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
			}while(datos.equals("si"));
			break;
			
			case 2:
			do{
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese el codigo del instructor que desea modificar");
			dato3=texto.ingresarNumero();
			cI.buscarInstructor(dato3);
			System.out.println("Desea modificar otro?");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
			}while(datos.equals("si"));
			System.out.println("Desea ver reporte de los instructores?");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
			if(datos.equals("si")){
			cI.reporteInstructor();
			}
			break;
			
			case 3:
			do{
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese el codigo del instructor que desea eliminar");
			dato3=texto.ingresarNumero();
			cI.eliminarInstructor(dato3);
			System.out.println("Desea eliminar otro?");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
			}while(datos.equals("si"));
			System.out.println("Desea ver reporte de los instructores?");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
			if(datos.equals("si")){
			cI.reporteInstructor();
			}
			break;
			
			case 4:
			this.menuPrincipal();
			break;
			
			default:
			System.out.println("Opcion ingresada irreconocible");
			break;
		}
		System.out.println("Desea realizar otra opcion en Instructor?");
		datos=texto.ingresarTexto();
		datos=datos.toLowerCase();
		}while(datos.equals("si"));
		
		System.out.println("desea regresar a menu principal?");
		datos=texto.ingresarTexto();
		datos=datos.toLowerCase();
		if(datos.equals("si")){
			this.menuPrincipal();
		}
	}
	
	
	public void menuAsignar(){
		do{
		System.out.println("1....Agregar");
		System.out.println("3....regresar");
		opcion=texto.ingresarNumero();
		switch(opcion){
			
			case 1:
			do{
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese codigo del instructor que desea designar");
			opcion=texto.ingresarNumero();
			cI.asignarInstructor(opcion);
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese el codigo de la materia que impartira el instructor");
			dato3=texto.ingresarNumero();
			cM.asignarMateria(dato3);
			System.out.println("---------------------");
			System.out.println("Mostrano reporte....");
			cI.asignacion(opcion);
			cM.asignacion(dato3);
			System.out.println("------");
			System.out.println("---------------------");
			System.out.println("Desea agregar otro");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
			}while(datos.equals("si"));	
			
			
			break;
			
			case 2:
			this.menuPrincipal();
			break;
			
			default:
			System.out.println("Opcion ingresada irreconocible");
			break;
				}
			System.out.println("---------------------");
			System.out.println("Desea realizar otra opcion en Asignar?");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
			}while(datos.equals("si"));
		
			System.out.println("---------------------");
			System.out.println("desea regresar a menu principal?");
			datos=texto.ingresarTexto();
			datos=datos.toLowerCase();
			if(datos.equals("si")){
			this.menuPrincipal();
		}else{
			System.exit(1);
		}
	}

	}
