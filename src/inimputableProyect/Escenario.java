package inimputableProyect;
import java.util.Scanner;

public class Escenario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Persona yo = new Persona();
		Ladron chorro = new Ladron();
		int opcionDeseada;
		
		
		mostrarMenu1();
		seleccionarOpcion1();	
		
		mostrarMenu2();
		seleccionarOpcion2();
		
		mostrarMenu3();
		seleccionarOpcion3();
		
		mostrarMenu4();
		seleccionarOpcion4();
		
		mostrarMenu5();
		seleccionarOpcion5();
		
		mostrarMenu6();
		seleccionarOpcion6();
		
		
		

	}
	private static Persona yo = new Persona();
	private static Ladron chorro = new Ladron();
	public static Scanner teclado = new Scanner(System.in);
	public static int opcionDeseada;
	
	public static void mostrarMenu1() {
		System.out.println("*********UN CHORRO ENTRO A SU CASA!!*********");
		System.out.println("*********STAGE 1*********");
		System.out.println("Seleccione una opcion1");
		System.out.println("1. Amasijar en el patio\n2. Llevar al lugar mas recondito de su casa");
	}
	
	public static void mostrarMenu2() {
		System.out.println("*********STAGE 2*********");
		System.out.println("Seleccione una opcion");
		System.out.println("1. Tirarle tiros\n2. Mearlo\n3. Tomar Chivas Regal\n4. Ir al Juzgado");
	}
	
	
	
	public static void mostrarMenu3() {
		System.out.println("*********STAGE 3*********");
		System.out.println("Seleccione una opcion");
		System.out.println("1. Tirarle tiros\n2. Mearlo\n3. Ir Al Juzgado");
	}
		
	
	public static void mostrarMenu4() {
		System.out.println("*********STAGE 4*********");
		System.out.println("Seleccione una opcion");
		System.out.println("1. Tirarle tiros\n2. Papotearse\n3. Ir alJuzgado");
	}
	
	public static void mostrarMenu5() {
		System.out.println("*********STAGE 5*********");
		System.out.println("Seleccione una opcion6");
		System.out.println("1. Tirarle tiros\n2. Ir al Juzgado");
	}
	
	public static void mostrarMenu6() {
		System.out.println("*********STAGE 6*********");
		System.out.println("Seleccione una opcion");
		System.out.println("1. Ir al Juzgado");
	}
	
		
	public static void seleccionarOpcion1() {	
		int opcionDeseada = 0;
		
		do{
			opcionDeseada = teclado.nextInt();
		switch(opcionDeseada) {
		case 1: teComisteUnGarron();
				teclado.next();
			break;
		case 2: esconderChorro(chorro);;
				
			break;
		default: System.out.println("Ingrese una opcion valida");
			break;
			}
		}while(opcionDeseada != 1 && opcionDeseada != 2 );
		
	}
	
	public static void seleccionarOpcion2() {	
		int opcionDeseada = 0;
		int cantidadDeTiros = 0;
		do{
			opcionDeseada = teclado.nextInt();
		switch(opcionDeseada) {
		case 1: System.out.println("Cuantos tiros desea tirarle?\n(El cargador tiene 12)");
			cantidadDeTiros = teclado.nextInt();
			tirarle(cantidadDeTiros);
			if(yo.isHabilTirador()==true) {System.out.println("Sos habil tirador, te comiste un garron de la gran flauta");}
			else {
			System.out.println("No demostraste tu estado de inconciencia temporal, te comiste un garron de la gran flauta");
			teclado.next();	}		
			break;
		case 2:do { if(mearlo() == false) {
			System.out.println("No puede mear al chorro, no tomo Chivas");
			};
			mostrarMenu2();
			seleccionarOpcion2();
		}while(opcionDeseada != 2);
			break;
		case 3: tomar();
				
			break;	
		case 4: irAlJuzgado();
				teclado.next();
			break;
		default: System.out.println("Ingrese una opcion valida");
			break;
				}
			}while(opcionDeseada != 1 && opcionDeseada != 2 && opcionDeseada != 3 && opcionDeseada != 4 && opcionDeseada !=5 );
		
		}
	
	
	public static void seleccionarOpcion3 () {	
		int opcionDeseada = 0;
		int cantidadDeTiros;
		do{
			opcionDeseada = teclado.nextInt();
		switch(opcionDeseada) {
		case 1: System.out.println("Cuantos tiros desea tirarle?\n(El cargador tiene 12)");
		cantidadDeTiros = teclado.nextInt();
		tirarle(cantidadDeTiros);
		if(yo.isHabilTirador()==true) {System.out.println("Sos habil tirador, te comiste un garron de la gran flauta");}
		else {
		System.out.println("No demostraste tu estado de inconciencia temporal, te comiste un garron de la gran flauta");
		teclado.next();	}
			break;
		case 2:mearlo();			
			break;
		case 3: irAlJuzgado();
				teclado.next();
			break;
		default: System.out.println("Ingrese una opcion valida");
			break;
				}
			}while(opcionDeseada != 1 && opcionDeseada != 2 && opcionDeseada != 3 && opcionDeseada != 4 );
		
		}
	
	
	
	public static void seleccionarOpcion4() {	
		int opcionDeseada = 0;
		int cantidadDeTiros = 0;
		do{
			opcionDeseada = teclado.nextInt();
		switch(opcionDeseada) {
		case 1: System.out.println("Cuantos tiros desea tirarle?\n(El cargador tiene 12)");
		cantidadDeTiros = teclado.nextInt();
		tirarle(cantidadDeTiros);
		if(yo.isHabilTirador()==true) {System.out.println("Sos habil tirador, te comiste un garron de la gran flauta");}
		else {
		System.out.println("No demostraste tu estado de inconciencia temporal, te comiste un garron de la gran flauta");
		teclado.next();	}
			break;
		case 2: papotearse();				
			break;
		case 3: irAlJuzgado();
				teclado.next();	
			break;
		default: System.out.println("Ingrese una opcion valida");
			break;
				}
			}while(opcionDeseada != 1 && opcionDeseada != 2 && opcionDeseada != 3 );
		
		}
			
	public static void seleccionarOpcion5() {	
		int opcionDeseada = 0;
		int cantidadDeTiros = 0;
		do{
			opcionDeseada = teclado.nextInt();
		switch(opcionDeseada) {
		case 1: System.out.println("Cuantos tiros desea tirarle?\n(El cargador tiene 12)");
		cantidadDeTiros = teclado.nextInt();
		tirarle(cantidadDeTiros);
		if(yo.isHabilTirador()==true) {System.out.println("Sos habil tirador, te comiste un garron de la gran flauta");}
		else if(cantidadDeTiros<12) {
		System.out.println("No demostraste tu estado de inconciencia temporal, te comiste un garron de la gran flauta");
		teclado.next();	}
			break;
		case 3: irAlJuzgado();
					teclado.next();
			break;
		default: System.out.println("Ingrese una opcion valida");
			break;
				}
			}while(opcionDeseada != 1 && opcionDeseada != 2 && opcionDeseada != 3 );
		
		}
	
	public static void seleccionarOpcion6() {	
		int opcionDeseada = 0;
		do{
			opcionDeseada = teclado.nextInt();
		switch(opcionDeseada) {	
		case 1: irAlJuzgado();
				teclado.next();
			break;
		default: System.out.println("Ingrese una opcion valida");
			break;
				}
			}while(opcionDeseada != 1);
		
		}
	
	
			
		
		public static void teComisteUnGarron() {
			System.out.println("El chorro dijo que se cayo de la medianera, te comiste un garron de la gran flauta");
			}
		
		public static void esconderChorro(Ladron chorro) {
			yo.llevarAlLugarMasRecondito(chorro);
			}
		
		public static void tirarle(int cantidadDeTiros) {
			yo.tirarAlChorro(cantidadDeTiros);
			}
		
		public static void tomar() {
			yo.tomarChivas();
			}
		
		public static boolean mearlo() {
			return yo.mearAlChorro();
			}
		
		public static void papotearse() {
		 yo.papotearse();
			}
		
		public static void irAlJuzgado() {
			if(yo.irAlJuzgado()==true) {System.out.println("FELICITACIONES!!\nSOS INIMPUTABLE HERMANO, EN 10 DIAS SALIS!");}else{System.out.println("No demostraste tu estado de inconciencia temporal, te comiste un garron de la gran flauta");;
		}
			}
		
		public static boolean isInimputable() {
			return yo.isInimputable();
			}
		
		public static int opcion() {
			return opcionDeseada;
			}
		
}
