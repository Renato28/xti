package br.com.xti.teste;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import br.com.xti.poo.Matematica;


public class MatematicaTest {

	Matematica m;
	@Before
	public void setUp() throws Exception {
		
		m = new Matematica();
	}

	
	@Test
	public void testRaiz() {
		assertEquals(4, m.raiz(16));
	}

	@Test
	public void testSoma() {
		
	//assertEquals(4, m.soma(2, 2));
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testMaior() {
		assertEquals(4, m.maior(2, 4));
	}

}
