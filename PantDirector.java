package com.director.controlador;
public class PantDirector{

	IngresoDatos texto=new IngresoDatos();
	ControladorMateria cM=new ControladorMateria();
	ControladorInstructor cI=new ControladorInstructor();
	ControladorSalon cS=new ControladorSalon();
	static ControladorUsuario cU=new ControladorUsuario();
	 static Login log2=new Login();

	
	String datos;
	String dato2;
	String descrip;
	String rolCoordinador;
	String rolAlumno;
	int opcion;
	int dato3;
	int dato4;
	int codMateria=0;
	int codSalon=100;
	int codInstructor=1000;
	int codUsuario=2021000;
	int codCoordinador=10000;

	public void menuPrincipal(){
		System.out.println("------------------------------------------------");
			System.out.println("----Bienvenido Director----");
			System.out.println("1....Materia....");
			System.out.println("2....Instructor....");
			System.out.println("3....Salones....");
			System.out.println("4....Ingresar Usuario....");
			System.out.println("5....Asignar");
			System.out.println("6....Salir");
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
			this.menuSalon();
			break;
			
			case 4:
			this.menuUsuario();
			break;
			
			case 5:
			this.menuAsignar();
			break;
			
			case 6:
			log2.loginSecundario();
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
				System.out.println("---------------------");
				System.out.println("Desea agregar otro");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				}while(datos.equals("si"));	
				System.out.println("---------------------");
				System.out.println("Desea generar reporte en texto?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				if(datos.equals("si")){
				System.out.println("Ingrese la ruta en que sera almacenado");
				datos=texto.ingresarTexto();
				cM.generarReporte(datos);
				}
			break;
			
			case 2:
			do{
				System.out.println("------------------------------------------------");
				System.out.println("Ingrese el codigo de la materia que desea modificar");
				dato3=texto.ingresarNumero();
				cM.buscarMateria(dato3);
				System.out.println("---------------------");
				System.out.println("Desea agregar otro?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				}while(datos.equals("si"));
				System.out.println("---------------------");
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
				System.out.println("---------------------");
				System.out.println("Desea eliminar otro?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				}while(datos.equals("si"));
				System.out.println("---------------------");
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
			System.out.println("---------------------");
			System.out.println("Desea realizar otra opcion en materia?");
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
				System.out.println("---------------------");
				System.out.println("Desea agregar otro");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
			}while(datos.equals("si"));	
			System.out.println("---------------------");
				System.out.println("Desea generar reporte en texto?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				if(datos.equals("si")){
				System.out.println("Ingrese la ruta en que sera almacenado");
				datos=texto.ingresarTexto();
				cI.generarReporte(datos);
				}
			break;
			
			case 2:
			do{
				System.out.println("------------------------------------------------");
				System.out.println("Ingrese el codigo del instructor que desea modificar");
				dato3=texto.ingresarNumero();
				cI.buscarInstructor(dato3);
				System.out.println("---------------------");
				System.out.println("Desea modificar otro?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				}while(datos.equals("si"));
				System.out.println("---------------------");
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
				System.out.println("---------------------");
				System.out.println("Desea eliminar otro?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				}while(datos.equals("si"));
				System.out.println("---------------------");
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
			System.out.println("---------------------");
			System.out.println("Desea realizar otra opcion en Instructor?");
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
	
	public void menuSalon(){
		do{
			System.out.println("----Bienvenido a Salones----");
			System.out.println("1....Crear....");
			System.out.println("2....Modificar....");
			System.out.println("3....Eliminar....");
			System.out.println("4....Regresar....");
			opcion=texto.ingresarNumero();
		switch(opcion){
			
			case 1:
			do{
			codSalon++;
				System.out.println("------------------------------------------------");
				System.out.println("Ingrese el nombre del nuevo salon");
				datos=texto.ingresarTexto();
				System.out.println("------------------------------------------------");
				System.out.println("Ingrese la cantidad de personas del salon");
				dato3=texto.ingresarNumero();
				cS.ingresarSalon(codSalon,datos,dato3);
				cS.reporteSalon();
				System.out.println("---------------------");
				System.out.println("Desea agregar otro");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
			}while(datos.equals("si"));	
				System.out.println("---------------------");
				System.out.println("Desea generar reporte en texto?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				if(datos.equals("si")){
				System.out.println("Ingrese la ruta en que sera almacenado");
				datos=texto.ingresarTexto();
				cS.generarReporte(datos);
				}			
			break;
			
			case 2:
			do{
				System.out.println("------------------------------------------------");
				System.out.println("Ingrese el codigo del Salon que desea modificar");
				dato3=texto.ingresarNumero();
				cS.buscarSalon(dato3);
				System.out.println("---------------------");
				System.out.println("Desea modificar otro?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				}while(datos.equals("si"));
				System.out.println("---------------------");
				System.out.println("Desea ver reporte de los salones?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				if(datos.equals("si")){
				cS.reporteSalon();
			}
			break;
			
			case 3:
			do{
				System.out.println("------------------------------------------------");
				System.out.println("Ingrese el codigo del salon que desea eliminar");
				dato3=texto.ingresarNumero();
				cS.eliminarSalon(dato3);
				System.out.println("---------------------");
				System.out.println("Desea eliminar otro?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				}while(datos.equals("si"));
				System.out.println("---------------------");
				System.out.println("Desea ver reporte de los salones?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				if(datos.equals("si")){
				cS.reporteSalon();
			}
			break;
			
			case 4:
				this.menuPrincipal();
			break;
			
			default:
			System.out.println("Opcion ingresada irreconocible");
			break;
			}
			System.out.println("---------------------");
			System.out.println("Desea realizar otra opcion en Salones?");
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
	
	public void menuUsuario(){
		do{
			System.out.println("----Bienvenido a Usuario----");
			System.out.println("1....Para crear coordinador");
			System.out.println("2....Para crear alumno");
			System.out.println("3....Para regresar");
			opcion=texto.ingresarNumero();
		switch (opcion){
			
			case 1:
			do{
			codCoordinador++;
				rolCoordinador="c";
				System.out.println("1....Coloque el nombre del nuevo coordinador....");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				System.out.println("2....Designe su clave....");
				descrip=texto.ingresarTexto();
				System.out.println("....Asignacion automatica de rol....");
				cU.ingresarUsuario(codCoordinador,datos,descrip,rolCoordinador);
				cU.reporteUsuario();
				System.out.println("---------------------");
				System.out.println("Desea agregar otro");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
			}while(datos.equals("si"));	
			System.out.println("---------------------");
				System.out.println("Desea generar reporte en texto?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				if(datos.equals("si")){
				System.out.println("Ingrese la ruta en que sera almacenado");
				datos=texto.ingresarTexto();
				cU.generarReporte(datos);
				}
			break;
		
			case 2:
			do{
			codUsuario++;
				rolAlumno="a";
				System.out.println("1....Coloque el nombre del nuevo alumno....");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				System.out.println("2....Designe su clave....");
				descrip=texto.ingresarTexto();
				System.out.println("....Asignacion automatica de rol....");
				cU.ingresarUsuario(codUsuario,datos,descrip,rolAlumno);
				cU.reporteUsuario();
				System.out.println("---------------------");
				System.out.println("Desea agregar otro");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
			}while(datos.equals("si"));	
			System.out.println("---------------------");
				System.out.println("Desea generar reporte en texto?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				if(datos.equals("si")){
				System.out.println("Ingrese la ruta en que sera almacenado");
				datos=texto.ingresarTexto();
				cI.generarReporte(datos);
				}
			break;
		
			case 3:
				this.menuPrincipal();
			break;
		
			default:
			System.out.println("Opcion ingresada irreconocible");
			break;
			}
			System.out.println("---------------------");
			System.out.println("Desea realizar otra opcion en Usuarios?");
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
			System.out.println("------------------------------------------------");
			System.out.println("Ingrese el codigo del salon en donde impartira la materia");
			dato4=texto.ingresarNumero();
			cS.asignarSalon(dato4);
			System.out.println("---------------------");
			System.out.println("Mostrando reporte....");
			cI.asignacion(opcion);
			cM.asignacion(dato3);
			cS.asignacion(dato4);
			System.out.println("------");
			System.out.println("---------------------");
			System.out.println("Desea generar reporte en texto?");
				datos=texto.ingresarTexto();
				datos=datos.toLowerCase();
				if(datos.equals("si")){
					System.out.println("Ingrese la ruta en que sera almacenado");
					datos=texto.ingresarTexto();
					cI.generarReporte(datos);
					cM.generarReporte(datos);
					cS.generarReporte(datos);
				}System.out.println("---------------------");
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

