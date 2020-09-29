package com.examen.backend;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Ejercicio4 {

	

	
	
	

	public Ejercicio4() {
	
	}
	
	
	
	public int[] getRemueveDuplicados(int[] arreglo){
		
		List<Integer> list = Arrays.stream(arreglo).boxed().collect(Collectors.toList());
		Set<Integer> limpio = new TreeSet<Integer>(list);
		int[] resultado=limpio.stream() 
	            .mapToInt(Integer::intValue) 
	            .toArray(); ;
		
			return resultado;
		
	}
	
	public static void main(String args[]){
		
		Ejercicio4 ejee=new Ejercicio4();
		int[] obj = ejee.getRemueveDuplicados(new int[]{
				2,3,4,5,6,7,2,2,4,5,6,4,9
	
	});
		
		 System.out.println(Arrays.toString(obj));

		
		}

}
