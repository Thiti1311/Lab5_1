package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.TrianguloIsoceles;

class TrianguloIsocelesTest {
	
	TrianguloIsoceles triangulo;
	double area; double perimetro;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		triangulo = new TrianguloIsoceles(2, 4);
		area = triangulo.getArea();
		perimetro = triangulo.getPerimetro();
	}

	@Test
	void test1() {
		assertEquals(0, area);
	}
	
	@Test
	void test2() {
		assertEquals(8, perimetro);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
