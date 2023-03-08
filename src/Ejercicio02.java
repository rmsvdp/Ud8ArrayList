	import java.util.ArrayList;
import java.util.Scanner;

import libs.LiberiaArrayList;
	
	
public class Ejercicio02 {


	
	public Ejercicio02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	boolean cont = true;
	Integer altura;
	ArrayList<Integer> lista = new ArrayList<Integer>();
	LiberiaArrayList libA = new LiberiaArrayList();
	Scanner sc = new Scanner(System.in);
	
	while(cont) {
		
		System.out.print("Introduce Altura (cm) : ");
		
		altura = sc.nextInt();
		if (altura>0) {
						
			lista.add(altura);
		}
		else {cont = false;}
	} // while cont
	
	// Llamo a los métodos que se solicitan
	

    System.out.println("-------Listado de Alturas registradas ------------");
    libA.muestraArrayInt(lista);
    System.out.println("-------Estadísticas ------------");
	System.out.println("Altura Máxima: " + libA.maximoArrayListInt(lista));
    System.out.println("Altura Mínima: " + libA.minimoArrayListInt(lista));
    System.out.println("Altura Media: " + libA.mediaArrayListInt(lista));
	
	
	}

}
