package libs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Librería que implementa varios métodos útiles para trabajar con
 * datos de tipo Integer.
 * Se incorpora una clase sencilla que implementa un conjunto de
 * pruebas unitarias en Junit5
 * @author rmsvdp
 *
 */
public class LiberiaArrayList {

	/**
	 * Constructor para instanciar un objeto y poder acceder a los métodos.
	 * Esta clase no dispone de atributos
	 */
	public LiberiaArrayList() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Generación de un conjunto aleatorio de valores de tipo Integer
	 * @param num Número de elmentos que se generarán
	 * @param max Máximo valor entero que se podrá generar
	 * @param min Mínimo valor entero que se podrá generar
	 * @return ArrayList de enteros
	 */
	public ArrayList<Integer> generaArrayListInt(int num,int max,int min){
		
		ArrayList<Integer> miAl = new ArrayList<Integer>();
		
		for (int i=0;i<num;i++) {
			Integer j = (int) (Math.random()*(max - min)) + min;
			miAl.add(j);
		}
		return miAl;
	}
	
	/**
	 * Devuelve el mínimo entero existente en el array que se le pasa por parámetro
	 * @param miAl ArrayList a analizar
	 * @return valor mínimo
	 */
	public Integer minimoArrayListInt(ArrayList<Integer> miAl){
		
		Integer min=0;
		  
		   min = miAl.get(0);
		   for (int j=1;j<miAl.size();j++){
		     Integer n = miAl.get(j);
		     if (n < min) min = n; 
		   }		   
		   return min;
	}
	
	/**
	 * Devuelve el máximo entero existente en el array que se le pasa por parámetro
	 * @param miAl ArrayList a analizar
	 * @return valor máximo
	 */
	public 	Integer maximoArrayListInt(ArrayList<Integer> miAl){
		
		Integer max=0;		
		
		 max = miAl.get(0);
		 for (int j=1;j<miAl.size();j++){
		   Integer n = miAl.get(j);
		    if (n > max)
		    {max = n; }
		 }
		 
		 return max;
	}
	
	/**
	 * Devuelve la media calculada sobreel array que se le pasa por parámetro
	 * @param miAl ArrayList a analizar
	 * @return Media numérica (doble) calculada
	 */
	
	public double mediaArrayListInt(ArrayList<Integer> miAl){
		
		double med=0.0;		
		for(Integer k:miAl) {
			med+=k;
		}
		
		return (med/miAl.size());
		
}

	/**
	 * Comprueba si el número facilitado se encuentra en el array
	 * @param miAl ArrayList a analizar
	 * @param num Número a buscar
	 * @return True: El número existe 1 o más veces
	 * 		   False: número no encontrado
	 */
	
public boolean estaEnArrayListInt(ArrayList<Integer> miAl,int num){
	
	return miAl.contains(num);
	
}

/**
 * Devuelve la posición en la que se encuentra el número facilitado dentro del array
 * @param miAl ArrayList a analizar
 * @param num Número a buscar
 * @return posición si encontrado:  0 <-> miAl.size()-1 
 * 		      -1 si no encontrado
 */
public Integer posicionEnArrayListInt(ArrayList<Integer> miAl,Integer num){
	
	Integer pos=0;		
	if (miAl.contains(num)) { pos = miAl.lastIndexOf(num);}
	else { pos = -1;}
	return pos;
}
/**
 * Devuelve una copia espejo del array facilitado (que no se ve alterado)
 * @param miAl ArrayList a espejar
 * @return arrayListEspejo
 */
public ArrayList<Integer> volteaArrayListInt(ArrayList<Integer> miAl){
	
	ArrayList<Integer> tmpList = new ArrayList<Integer>();
	for(int i= miAl.size()-1;i>=0;i--) {
		tmpList.add(miAl.get(i));
	}
	return tmpList;
}

/**
 * Muestra tabularmente los contenidos del array en el formato:
 *  posición <n> : < Valor posición>
 * @param aL Array a mostrar
 */
public void muestraArrayInt(ArrayList<Integer> aL) {
	
	int i=0;
	for (Integer num: aL) {
		
		System.out.println("Pos: "+i+ " " +num);
		i++;
	}
}

} // Class
