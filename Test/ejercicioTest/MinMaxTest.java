package ejercicioTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ejercicio.MinMax;


public class MinMaxTest {
	public int [] xs;
	public MinMax buscador;
	
	@Before
	
	public void inicializar(){
		xs = null;
	}
	
	@Test
	
	public void arrayNulo(){
		assertEquals("Fallo en la funcion", null, MinMax.minMax(xs));
	}
}
