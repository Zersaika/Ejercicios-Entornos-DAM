import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

  
	@Test
	public void testSuma() {
		Calculadora c= new Calculadora(10,5);
		int resultado=c.suma();
		assertEquals("Fallo de Prueba",15,resultado);
	}

	@Test
	public void testResta() {
		Calculadora c= new Calculadora(10,5);
		int resultado=c.resta();
		assertEquals("Fallo de Prueba",5,resultado);
	}

	@Test
	public void testMultiplica() {
		Calculadora c= new Calculadora(10,5);
		int resultado=c.multiplica();
		assertEquals("Fallo de Prueba",50,resultado);
	}

	@Test
	public void testDivide() {
		Calculadora c= new Calculadora(10,5);
		int resultado=c.divide();
		assertEquals("Fallo de Prueba",2,resultado);
	}

	@Test
	public void testResta2() {
		Calculadora c= new Calculadora(10,5);
		boolean resultado=c.resta2();
		assertTrue("Fallo de Prueba",resultado);
	}
	
	@Test
	public void testResta2_1() {
		Calculadora c= new Calculadora(5,10);
		boolean resultado=c.resta2();
		assertFalse("Fallo de Prueba",resultado);
	}

	@Test
	public void testDivide2() {
		Calculadora c= new Calculadora(10,0);
		Integer resultado=c.divide2();
		assertNull("Fallo de Prueba",resultado);
	}
	
	@Test
	public void testDivide2_1() {
		Calculadora c= new Calculadora(10,5);
		Integer resultado=c.divide2();
		assertNotNull("Fallo de Prueba",resultado);
		
	}
}
