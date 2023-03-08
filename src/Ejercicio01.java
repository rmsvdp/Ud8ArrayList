import libs.LiberiaArrayList;

import java.util.ArrayList;

public class Ejercicio01
{

    public static void main(String[] args)
    {

    	LiberiaArrayList libA = new LiberiaArrayList();
    	
        ArrayList<Integer>  lista = libA.generaArrayListInt(10, 1, 10);
        
        System.out.println("Array Generado :");
        libA.muestraArrayInt(lista);
        
        System.out.println("Máximo: " + libA.maximoArrayListInt(lista));
        System.out.println("Mínimo: " + libA.minimoArrayListInt(lista));
        System.out.println("Media: " + libA.mediaArrayListInt(lista));
        System.out.println("¿Está el 10?: " + (libA.estaEnArrayListInt(lista,10)));
        System.out.println("Posición 5: " + libA.posicionEnArrayListInt(lista, 10));
        
        lista =libA.volteaArrayListInt(lista);
        System.out.println("Array Invertido :");
        libA.muestraArrayInt(lista);
    }
    
    
}
