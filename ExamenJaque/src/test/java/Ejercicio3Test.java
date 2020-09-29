import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.examen.backend.Ejercicio3;

class Ejercicio3Test {

	@Test
	void testGetKGrande() {
		
		List<Integer> ints = Arrays.asList(7,2,5,9,8,3);
		int k = 2;

		System.out.println(Ejercicio3.getKGrande(ints, k));

		assertEquals(8,Ejercicio3.getKGrande(ints, k));
	}

}
