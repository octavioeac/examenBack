import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.examen.backend.Ejercicio6;

class Ejercicio6Test {

	@Test
	void testGetNumeroSalones() {
		
		 String[] horaInicial={"11:00","12:00", "14:30"};	
		    String[] horafinal={"14:00","15:00", "16:30"};	


		    int n = horaInicial.length; 
		    System.out.println("El número de salones para las "+n+" de actividades son : "+Ejercicio6.getNumeroSalones(horaInicial, horafinal, n)); 
		    
		    assertEquals(2,Ejercicio6.getNumeroSalones(horaInicial, horafinal, n));
		    
	}

}
