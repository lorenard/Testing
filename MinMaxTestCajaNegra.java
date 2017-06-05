import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinMaxTestCajaNegra {
	
	public int xs1 [];
	public int xs2 []; 
	public int xs3 [];
	public int xs4 [];
	public int xs5 [];
	
	public int array1[];
	public int array2[];
	public int array3[];
	public int array4[];
	public int array5[];
	
		
	@Before
	public void Inicializar(){
		xs1= null;
		xs2 = new int [] {0,-1,2,3,4,5, 2099999999, 2139999999, 2146999999, -2147483648, 2147483647 };
		xs3= new int[]{};
		xs4 = new int []{3};
		xs5 = new int []{0,0,0,0,0,0};
		
		array1= MinMax.minMax(xs1);
		array2= MinMax.minMax(xs2);
		array3= MinMax.minMax(xs3);
		array4= MinMax.minMax(xs4);
		array5= MinMax.minMax(xs5);
	}
		
	@Test
	public void testNulo(){
		assertEquals("Array nulo" ,null, array1);
	}
	
	@Test
	public void testVacio(){
		assertEquals("Array vacio" ,null, array3);
	}
	
	@Test
	public void testArrayDeUnValor(){
		int [] xs4_s= new int []{3,3};
		assertArrayEquals("Array de una dimensión" ,xs4_s, array4);
	}
	
	@Test
	public void testArrayDeCeros(){
		int [] xs5_s= new int []{0,0};
		assertArrayEquals("Array de ceros" ,xs5_s, array5);
	}
	
	@Test
	public void testArrayValido(){
		int [] xs2_s= new int []{-2147483648,2147483647};
		assertArrayEquals("Array válido" ,xs2_s, array2);
	}
	/*
	@Test
	public void testValorMinimo(){
		assertTrue(array2[0]>=(-2147483648));
	}
	
	@Test
	public void testValorMaximo(){
		assertTrue(array2[1]<=2147483647);
	}
	
	@Test
	public void testFueraDeRango(){
		assertTrue((array2[1]<=2147483647)&& (array2[0]>=-2147483648));
	}*/
	
	}
