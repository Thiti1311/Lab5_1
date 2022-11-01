package Testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.Quadrado;

class QuadradoTest {

	Quadrado quadrado;
	double area; double perimetro;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		quadrado = new Quadrado(7);
		area = quadrado.getArea();
		perimetro = quadrado.getPerimetro();
	}
	
	@Test
	void test1() {
		assertEquals(49, area);
		//assertEquals(49, area);
	}
	
	@Test
	void test2() {
		assertEquals(28, perimetro);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
}
