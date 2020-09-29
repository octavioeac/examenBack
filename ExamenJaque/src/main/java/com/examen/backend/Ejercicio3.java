package com.examen.backend;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Ejercicio3 {

	public Ejercicio3() {
		
	}
	
	public static int getKGrande(List<Integer> ints, int k)
	{
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		pq.addAll(ints);
		while (--k > 0) {
			pq.poll();
		}
		return pq.peek();
	}

	

	

}
