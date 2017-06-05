
import org.junit.Before;
import org.junit.Test;

public class MinMaxCiclomatica {
	public int c0 [];
	public int c1 [];
	public int c2 []; 
	public int c3 [];
	public int c4 [];
	public int c5 [];
	
	
	@Before
	public void Inicializar(){
		c0 = new int[]{};
		c1 = null;
		c2 = new int []{7};
		c3 = new int []{5,3};
		c4 = new int []{3,5};
		c5 = new int []{2,2};
	}
	
	@Test
	public void Camino0(){
		//C1: 1, 2, 11 
		MinMax.minMax(c0);
	}

	@Test
	public void Camino1(){
		//C1: 1, 2, 11 
		MinMax.minMax(c1);
	}
	
	@Test
	public void Camino2(){
		//C2: 1, 2, 3, 4, 10, 11
		MinMax.minMax(c2);
	}
	
	@Test
	public void Camino3(){
		//C3: 1, 2, 3, 4, 5, 6, 7, 10, 11
		MinMax.minMax(c3);
	}
	
	@Test
	public void Camino4(){
		//C4: 1, 2, 3, 4, 5, 6, 8, 9, 10, 11
		MinMax.minMax(c4);
	}
	
	@Test
	public void Camino5(){
		//C5: 1, 2, 3, 4, 5, 6, 8, 10, 11
		MinMax.minMax(c5);
	}	

}
