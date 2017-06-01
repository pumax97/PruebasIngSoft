package ejercicioTest;

import org.junit.Before;
import org.junit.Test;

import ejercicio.MinMax;

public class MinMaxCiclomatica {
	int [] xs;
	
	@Before
	
	public void inicializar(){
		xs = null;
	}
	
	@Test
	
	public void caminoUno(){ //1-2-3-12
		MinMax.minMax(xs);
	}
	
}
