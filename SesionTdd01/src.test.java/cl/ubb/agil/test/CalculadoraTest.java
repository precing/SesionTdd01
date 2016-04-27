package cl.ubb.agil.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cl.ubb.agil.Calculadora;

public class CalculadoraTest {
	private Calculadora cal;
	@Before
	public void setup(){
		cal=new Calculadora();
	}
	
	@Test
	public void dosMasTresEsCinco(){
		//Calculadora cal= new Calculadora();
		//int resultado= cal.sumar(2,3);
		assertEquals(5, cal.sumar(2,3));
	}
	@Test
	public void menosUnoMasSiesteEsSeis(){
		//Calculadora cal=new Calculadora();
		assertEquals(6, cal.sumar(-1,7));
	}
	@Test
	public void es200Menos73Es127(){
		assertEquals(127, cal.restar(200,73));	
	}
	@Test
	public void esMenosDiesMenosSincoEsMenosQuince(){
		assertEquals(-15,cal.restar(-10, 5));
	}

}
