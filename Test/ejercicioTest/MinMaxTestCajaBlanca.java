package ejercicioTest;

import org.junit.Before;
import org.junit.Test;

import ejercicio.MinMax;

public class MinMaxTestCajaBlanca {
	int [] xs, xt;
	
	@Before
	
	public void inicializar(){
		xs = new int[] {1, -8, 10, 5, -1, 0};// array para statementCoverage
		xt = null;
	}
	
	@Test
	
	public void statementCoverage(){
		MinMax.minMax(xs);//pasa por todas las sentencias
	}
	
	@Test
	
	public void decisionCoverage(){
		MinMax.minMax(xs);//decision verdadera
		MinMax.minMax(xt);//decision falsa
	}
}
