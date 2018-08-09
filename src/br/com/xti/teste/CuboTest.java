package br.com.xti.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.xti.heranca.Cubo;

public class CuboTest {

	Cubo cubo;
	@Before
	public void setUp() throws Exception {
		
		cubo = new Cubo(10);
	}

	@Test
	public void testCalcularVolume() {
		assertEquals(600, cubo.calcularVolume(), 0);
	}

	@Test
	public void testCalcularArea() {
		assertEquals(1000, cubo.calcularArea(), 0);
	}

}
