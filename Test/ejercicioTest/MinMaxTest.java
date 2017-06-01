package ejercicioTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ejercicio.MinMax;


public class MinMaxTest {
	public int [] xs, xt, xp;
	
	@Before
	
	public void inicializar(){
		xs = null; //array nulo
		xt = new int[] {1}; //array con un único valor
		xp = new int[] {1, 1};
	}
	
	@Test
	
	public void arrayNulo(){
		assertEquals("Fallo en la funcion con null", null, MinMax.minMax(xs));
	}
	
	@Test
	
	public void arrayUnValor(){
		assertArrayEquals("Fallo en la funcion con un unico valor", xp, MinMax.minMax(xt));
	}
}
