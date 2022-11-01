package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.Retangulo;

class RetanguloTest {
	
	Retangulo retangulo;
	double area, perimetro;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		retangulo = new Retangulo(2, 4);
		area = retangulo.getArea();
		perimetro = retangulo.getPerimetro();
	}

	@Test
	void test1() {
		assertEquals(8 , area);
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
