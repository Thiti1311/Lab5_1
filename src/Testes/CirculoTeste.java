package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.Circulo;

class CirculoTeste {
	
	Circulo circulo;
	double area; double perimetro;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		Circulo circulo = new Circulo(8);
		area = circulo.getArea();
		perimetro = circulo.getPerimetro();
	}

	@Test
	void test1() {
		assertEquals(200,96, area);
	}
	
	@Test
	void test2() {
		assertEquals(50,24, perimetro);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
