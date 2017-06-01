package ejercicioTest;

import org.junit.Before;
import org.junit.Test;

import ejercicio.MinMax;

public class MinMaxCiclomatica {
	int [] xs, xt, xz;
	
	@Before
	
	public void inicializar(){
		xs = null;
		xt = new int[] {2};
		xz = new int[] {1,2};
		
	}
	
	@Test
	
	public void caminoUno(){ //1-2-3-12
		MinMax.minMax(xs);
	}
	
	@Test
	
	public void caminoDos(){ //1-2-3-4-5-11-12
		MinMax.minMax(xt);
	}
	
	@Test
	
	public void caminoTres(){ //1-2-3-4-5-6-7-8-5-11-12
		MinMax.minMax(xz);
	}
}
