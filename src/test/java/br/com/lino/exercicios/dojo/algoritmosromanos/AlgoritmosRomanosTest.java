package br.com.lino.exercicios.dojo.algoritmosromanos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AlgoritmosRomanosTest {

	private AlgoritmosRomanos algoritmosRomanos;

	@Test
	public void deveRetornarI() {
		assertEquals("I", algoritmosRomanos.converte(1));
	}

	@Test
	public void deveRetornarII() {
		assertEquals("II", algoritmosRomanos.converte(2));
	}

	@Test
	public void deveRetornarV() {
		assertEquals("V", algoritmosRomanos.converte(5));
	}

	@Test
	public void deveRetornarIV() {
		assertEquals("IV", algoritmosRomanos.converte(4));
	}

	@Test
	public void deveRetornarXL() {
		assertEquals("XL", algoritmosRomanos.converte(40));
	}

	@Test
	public void deveRetornarLXXX() {
		assertEquals("LXXX", algoritmosRomanos.converte(80));
	}

	@Test
	public void deveRetornarCDXCIV() {
		assertEquals("CDXCIV", algoritmosRomanos.converte(494));
	}

	@Before
	public void setUp() {
		algoritmosRomanos = new AlgoritmosRomanos();
	}
}
