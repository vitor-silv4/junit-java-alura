package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
//	Por padrao do Junit a classe de teste tem que ter o mesmo nome da classe que sera testada + sufixo Test
	
	@Test
	public void deveriaSomarDoisNumerosPOsitivos() {
		int soma = new Calculadora().somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}

}
