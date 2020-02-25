import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class CalculadoraTestParam3 {
	private int num1;
	private int num2;
	private int resultado;
	
	public CalculadoraTestParam3(int num1, int num2, int resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}

	@Parameters
	public static Collection<Object[]> datos(){
		return Arrays.asList(new Object[][] {
			{10,5,50},
			{45,8,360},
			{8,2,16},
			{20,4,80}
		});
	}
	
	@Test
	public void testMultiplica() {
		Calculadora c= new Calculadora(num1,num2);
		int resul=c.multiplica();
		assertEquals("Fallo de Prueba",resultado,resul);
	}

}