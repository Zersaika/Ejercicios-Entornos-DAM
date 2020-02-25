import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class CalculadoraTestParam2 {
	private int num1;
	private int num2;
	private int resultado;
	
	public CalculadoraTestParam2(int num1, int num2, int resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}

	@Parameters
	public static Collection<Object[]> datos(){
		return Arrays.asList(new Object[][] {
			{10,5,5},
			{45,8,37},
			{8,2,6},
			{20,4,16}
		});
	}
	
	@Test
	public void testResta() {
		Calculadora c= new Calculadora(num1,num2);
		int resul=c.resta();
		assertEquals("Fallo de Prueba",resultado,resul);
	}

}