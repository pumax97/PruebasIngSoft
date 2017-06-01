package ejercicioTest;

import org.junit.Before;
import org.junit.Test;

import ejercicio.MinMax;

public class MinMaxTestCajaBlanca {
	int [] xs;
	
	@Before
	
	public void inicializar(){
		xs = new int[] {1, -8, 10, 5, -1, 0};// array para statementCoverage
	}
	
	@Test
	
	public void statementCoverage(){
		MinMax.minMax(xs);//pasa por todas las sentencias
	}
}
