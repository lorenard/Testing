import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinMaxTestCajaBlanca {
	
	public int xs1 [] =null;
	public int xs2 [] ={0,-1,2,3,4,5, 2099999999, 2139999999, 2146999999, -2147483648, 2147483647 };
	public int xs3 []= {};
	public int xs4 [] ={3};
	
	
	@Test
	public void statementCoverage(){
		///recorre todas las sentencias
		MinMax.minMax(xs2);
	}

	@Test
	public void decisionCoverage(){
		//decisiones verdadero y falso
		MinMax.minMax(xs1);
		MinMax.minMax(xs2);
	}
	
	@Test
	public void conditionCoverage(){
		//condiciones
		MinMax.minMax(xs4); //no entra en el for
		MinMax.minMax(xs1); //
		MinMax.minMax(xs2); //entra en el for
	}
	
	@Test
	public void decisionConditionCoverage(){
		MinMax.minMax(xs1); //
		MinMax.minMax(xs2); //entra en el for
		MinMax.minMax(xs3); //
		MinMax.minMax(xs4);	//no entra en el for	
	}
}
