import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.examen.backend.Ejercicio5;

class Ejercicio5Test {

	@Test
	void testGetBalanceoCase1() {
		
		String s = "[()1223()]";
		System.out.println(Ejercicio5.getBalanceo2(s));
		assertEquals(true, Ejercicio5.getBalanceo2(s));
		
	}
	
	
	@Test
	void testGetBalanceoCase2() {
		String s = "[(1223()]";
		System.out.println(Ejercicio5.getBalanceo2(s));
		assertEquals(false, Ejercicio5.getBalanceo2(s));
		
	}
	
	@Test
	void testGetBalanceoCase3() {
		String s = "[()[]]";
		System.out.println(Ejercicio5.getBalanceo2(s));
		assertEquals(true, Ejercicio5.getBalanceo2(s));
		
	}
	
	
	@Test
	void testGetBalanceoCase4() {
		String s = "([])";
		System.out.println(Ejercicio5.getBalanceo2(s));
		assertEquals(true, Ejercicio5.getBalanceo2(s));
		
	}
	
	@Test
	void testGetBalanceoCase5() {
		String s = "([)]";
		System.out.println(Ejercicio5.getBalanceo2(s));
		assertEquals(false, Ejercicio5.getBalanceo2(s));
		
	}

}
