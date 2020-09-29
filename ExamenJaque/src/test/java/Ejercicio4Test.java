import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.examen.backend.Ejercicio4;

class Ejercicio4Test {

	@Test
	void testGetRemueveDuplicados() {
		
		Ejercicio4 ejee=new Ejercicio4();
		int[] obj = ejee.getRemueveDuplicados(new int[]{
				2,3,4,5,6,7,2,2,4,5,6,4,9
	
	});
		
		int[] resultado= {2, 3, 4, 5, 6, 7, 9};
		 System.out.println(Arrays.toString(obj));
		
		assertEquals(resultado.length, obj.length);
		
		
		
		
	}

}
