package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.TrianguloEquilatero;

class TrianguloEquilateroTest {
	
	TrianguloEquilatero triangulo1;
	double area; double perimetro;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		triangulo1 = new TrianguloEquilatero(4);
		area = triangulo1.getArea();
		perimetro = triangulo1.getPerimetro();
	}
	
	@Test
	void test1() {
		assertEquals(6.928203230275509, area);
	}
	
	@Test
	void test2() {
		assertEquals(12, perimetro);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
