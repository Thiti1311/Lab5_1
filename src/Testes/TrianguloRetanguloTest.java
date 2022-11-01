package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.TrianguloRetangulo;

class TrianguloRetanguloTest {

	TrianguloRetangulo triangulo;
	double area; double perimetro;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		triangulo = new TrianguloRetangulo(4, 2);
		area = triangulo.getArea();
		perimetro = triangulo.getPerimetro();
	}

	@Test
	void test1() {
		assertEquals(4, area);
	}
	
	@Test
	void test2() {
		assertEquals(10.47213595499958 , perimetro);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
