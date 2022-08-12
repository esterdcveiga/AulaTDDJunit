package com.aula;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	//preparação
	Calculadora calc;
	double n2;
	double n1;
	
	@BeforeEach
	void setUp() {
		calc = new Calculadora();
		n2 = 10.0;
		n1 = 20.0;
	}
	
	@Test
	public void testSomaHappyPath() {
		double resultadoEsperado = 30;
		double resultadoExecucao = calc.somar(n1, n2);
		assertEquals(resultadoExecucao,resultadoEsperado);
	}
	
	@Test
	public void testSomaBadPath() {
		double resultadoEsperado =40;
		assertNotEquals(resultadoEsperado, calc.somar(10.0, 20.0));
	}
	
	@Test
	public void testSubtrairHappyPath() {
		double resultadoExecucao = calc.subtrair(n1,n2);
		double resultadoEsperado = 10.0;
		assertEquals(resultadoEsperado,resultadoExecucao);
	}
	
	@Test
	public void testSubtrairBadPath() {
		double resultadoEsperado =-10;
		assertNotEquals(resultadoEsperado, calc.subtrair(20.0, 10.0));
	}
	
	@Test
	public void testMultiplicarHappyPath() {
		double resultadoExecucao = calc.multiplicar(n1, n2);
		double resultadoEsperado = 200.0;
		assertEquals(resultadoExecucao,resultadoEsperado);
	}
	
	@Test
	public void testMultiplicarBadPath() {
		double resultadoEsperado =40;
		assertNotEquals(resultadoEsperado, calc.multiplicar(5.0,10.0));
	}
	
	@Test
	public void testDividirHappyPath() {
		double resultadoExecucao = calc.dividir(n1, n2);
		double resultadoEsperado = 2.0;
		assertEquals(resultadoExecucao,resultadoEsperado);
	}
	
	@Test
	public void testDividirBadPath() {
		double resultadoEsperado =40;
		assertNotEquals(resultadoEsperado, calc.dividir(5.0,10.0));
	}
	
	@Test
	public void testDividirException() {
		Exception exception = assertThrows(ArithmeticException.class, () -> calc.dividir(5.0,0));
		assertEquals("Divisão por zero", exception.getMessage());
	}

}
