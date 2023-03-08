


import java.util.ArrayList;
import java.util.Scanner;

import libs.LiberiaArrayList;
import libs.Menu;

public class Ejercicio03 {

	public Ejercicio03() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciar objetos
		ArrayList<Integer> lista = new ArrayList<Integer>();
		LiberiaArrayList libA = new LiberiaArrayList();
		String[] opc = {"a) Mostrar valores",
				        "b) Introducir valor final",
				        "c) Introducir valor en posición"};
		Menu ppal = new Menu(opc);
		ppal.setTitulo("\nEJERCICIO 3: MENU");		
		boolean finSesion = false;
		int result=0;
		Integer V;
		int pos;
		Scanner sc = new Scanner(System.in);
		lista = libA.generaArrayListInt(10, 10, 1);
		
		while (!finSesion) {
			ppal.mostrarMenu();
			result = ppal.eligeOpcion();
			switch(result) {
				// -----
				case 1:	// a
					//System.out.println("Muestra Valores");
					libA.muestraArrayInt(lista);
					break;
				case 2: // b
					//System.out.println("b) Introducir valor final");
					System.out.print("Introduce Valor : ");
					V = sc.nextInt();
					lista.add(V);
					break;
				case 3:	// c
					//System.out.println("c) Introducir valor en posición");
					System.out.print("Introduce Valor : ");
					V = sc.nextInt();
					System.out.print("Introduce posicion : ");
					pos = sc.nextInt();
					if (pos>0 && pos<lista.size())
					{
						lista.set(pos, V);
					} else {
						System.out.println("Posción fuera de límites: (0-"+lista.size()
						                 +")\nOperación cancelada");
					}
					break;

				case 0: // salir aplicación
					finSesion= true;
				
			} // switch
		} // while !finSesion
	}

}
