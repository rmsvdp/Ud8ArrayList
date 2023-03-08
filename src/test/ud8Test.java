package test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import libs.LiberiaArrayList;


class ud8Test {

	// Variable 'global' a la clase test
	static ArrayList<Integer> lista = new ArrayList<Integer>(); 
	
	@BeforeEach
	public  void initArray() {
		Integer[] l = {10,2,0,8};
		lista = new ArrayList<Integer>(Arrays.asList(l));
	}

	@Test
	void testMinimoArrayListInt() {
		LiberiaArrayList libA = new LiberiaArrayList();
		ArrayList<Integer> tmp = (ArrayList<Integer>) lista.clone();
		Collections.sort(tmp);
		assertEquals(tmp.get(0),libA.minimoArrayListInt(lista));
	}

	@Test
	void testMaximoArrayListInt() {
		LiberiaArrayList libA = new LiberiaArrayList();
		ArrayList<Integer> tmp = (ArrayList<Integer>) lista.clone();
		Collections.sort(tmp,Collections.reverseOrder());
		assertEquals(tmp.get(0),libA.maximoArrayListInt(lista));
	}

	@Test
	void testMediaArrayListInt() {
		LiberiaArrayList libA = new LiberiaArrayList();
		assertEquals(5,libA.mediaArrayListInt(lista));
	}

	@Test
	void testEstaEnArrayListInt() {
		LiberiaArrayList libA = new LiberiaArrayList();
		assertEquals(true,libA.estaEnArrayListInt(lista,2));
		assertEquals(false,libA.estaEnArrayListInt(lista,4));
	}

	@Test
	void testPosicionEnArrayListInt() {
		LiberiaArrayList libA = new LiberiaArrayList();
		assertEquals(1,libA.posicionEnArrayListInt(lista,2));
	}

	@Test
	void testVolteaArrayListInt() {

		LiberiaArrayList libA = new LiberiaArrayList();
		ArrayList<Integer> listaIn = lista; 
		ArrayList<Integer> listaOut = lista; 
		Collections.reverse(listaOut);
		assertIterableEquals(libA.volteaArrayListInt(listaIn),listaOut);
	}



}
