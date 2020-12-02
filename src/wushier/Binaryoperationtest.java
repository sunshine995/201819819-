package wushier;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Binaryoperationtest {
	exercise bi;
	Binaryoperation bo;
	@BeforeEach
	void setUp() throws Exception {
		bo = new Binaryoperation();
	}

	@Test
	void testconstract1() {
		
		bo.random();
	}
	@Test
	void testconstract2() {
		bo.random();
	}
	@Test
	void testconstract3() {
		
		bo.addition();
	}
	@Test
	void testconstract4() {
		bo.generate();
	}
	@Test
	void testconstract5() {
		bo.subtraction();
	}
	@Test
	void testconstract6() {
		bi.generate();;
	}
	@Test
	void testconstract7() {
		Binaryoperation angerenate = new Binaryoperation();
		angerenate=bo.generate();
		bi.contains(angerenate, 50);
	}
}
