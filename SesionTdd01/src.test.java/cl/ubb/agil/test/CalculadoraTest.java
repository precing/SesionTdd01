package cl.ubb.agil.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cl.ubb.agil.Calculadora;

public class CalculadoraTest {
	@Test
	public void dosMasTresEsCinco(){
		Calculadora cal= new Calculadora();
		//int resultado= cal.sumar(2,3);
		assertEquals(5, cal.sumar(2,3));
	}

}
