package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void VerificaPrecoComJuros() {
		Produto bala = new Produto("freegels melão", 0.10);
		assertEquals(0.11, bala.getPrecoComImposto(), 0.00001);
	}
}