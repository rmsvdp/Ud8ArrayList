package libs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LiberiaArrayList {

	public LiberiaArrayList() {
		// TODO Auto-generated constructor stub
	}

	
	public ArrayList<Integer> generaArrayListInt(int num,int max,int min){
		
		ArrayList<Integer> miAl = new ArrayList<Integer>();
		
		for (int i=0;i<num;i++) {
			Integer j = (int) (Math.random()*(max - min)) + min;
			miAl.add(j);
		}
		return miAl;
	}
	
	public Integer minimoArrayListInt(ArrayList<Integer> miAl){
		
		Integer min=0;
		  
		   min = miAl.get(0);
		   for (int j=1;j<miAl.size();j++){
		     Integer n = miAl.get(j);
		     if (n < min) min = n; 
		   }		   
		   return min;
	}
	
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
	
	public double mediaArrayListInt(ArrayList<Integer> miAl){
		
		double med=0.0;		
		for(Integer k:miAl) {
			med+=k;
		}
		
		return (med/miAl.size());
		
}

public boolean estaEnArrayListInt(ArrayList<Integer> miAl,int num){
	
	return miAl.contains(num);
	
}

public Integer posicionEnArrayListInt(ArrayList<Integer> miAl,Integer num){
	
	Integer pos=0;		
	if (miAl.contains(num)) { pos = miAl.lastIndexOf(num);}
	else { pos = -1;}
	return pos;
}

public ArrayList<Integer> volteaArrayListInt(ArrayList<Integer> miAl){
	
	ArrayList<Integer> tmpList = new ArrayList<Integer>();
	for(int i= miAl.size()-1;i>=0;i--) {
		tmpList.add(miAl.get(i));
	}
	return tmpList;
}

public void muestraArrayInt(ArrayList<Integer> aL) {
	
	int i=0;
	for (Integer num: aL) {
		
		System.out.println("Pos: "+i+ " " +num);
		i++;
	}
}

} // Class
