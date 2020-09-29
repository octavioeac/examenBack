import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.examen.backend.Ejercicio1;

class Ejercicio1Test {

	@Test
	void testGetSubarreglo() {
		int[] arr = { 3, 2, 5, 9, 1, 3 };
		Ejercicio1 ejercicio1 = new Ejercicio1();
		ejercicio1.getSubarreglo(arr);
		
	
		
		 assertEquals("[2, 5, 9]",ejercicio1.getSubarreglo(arr).toString());
	}

}
