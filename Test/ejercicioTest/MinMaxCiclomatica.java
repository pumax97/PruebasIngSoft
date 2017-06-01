package ejercicioTest;

import org.junit.Before;
import org.junit.Test;

import ejercicio.MinMax;

public class MinMaxCiclomatica {
	int [] xs, xt;
	
	@Before
	
	public void inicializar(){
		xs = null;
		xt = new int[] {2};
	}
	
	@Test
	
	public void caminoUno(){ //1-2-3-12
		MinMax.minMax(xs);
	}
	
	@Test
	
	public void caminoDos(){ //1-2-3-4-5-12
		MinMax.minMax(xt);
	}
}
