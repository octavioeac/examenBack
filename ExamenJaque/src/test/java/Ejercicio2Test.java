import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.examen.backend.Ejercicio2;

class Ejercicio2Test {

	@Test
	void testGetSumatoriaLimites() {
		
		
		Ejercicio2 eje2= new Ejercicio2();
		System.out.println( eje2.getSumatoriaLimites(3, 7));
		int x= eje2.getSumatoriaLimites(3, 6);
		 assertEquals(18,x);
	}

	
	@Test
	void testGetSumatoriaLimites2() {
		
		Ejercicio2 eje2= new Ejercicio2();
		System.out.println( eje2.getSumatoriaLimites(3, 7));
		int x= eje2.getSumatoriaLimites(3, 7);
		 assertEquals(25,x);
	}
	
	
	
}
