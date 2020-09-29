package com.examen.backend;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class Ejercicio1 {

	public Ejercicio1() {
	
	}
	
	
	public int[] getSubarreglo(int[] arreglo){
		
		
		
		List<Integer> lista= Arrays.stream(arreglo)
	    		.boxed()
	    		.collect(Collectors.toList());
		
		
	    int max=Collections.max(lista);
	    int min=Collections.min(lista);
	    
		
		
	  
	    List <Integer> k = IntStream.range(0, lista.size() - 1)
	    	.filter((i) ->lista.get(i+1) - lista.get(i)>1 
	    			 
	    			)
	        .mapToObj(lista::get)
	        .collect(Collectors.toList());
	   
	    	System.out.println(k.toString());
		return null;
		
	
	
	}
	
	public static int[] consecutiveNumbers(int a[], int n) {
		
		List<int[]> arreglos= new ArrayList<>();
		
		String str="";
		
		for(int i=0; i<a.length ; i++){
			System.out.println(a[i]);
			
			if(a[i]<a[i+1]){
				str+=a[i];
				System.out.println(str);
			}
			
			
		}
		
		
		
		return null;

		
		
		
		}
	
	
	public static void main(String args[]){
		
		int[] arr= {
		  		3,2,5,9,1,4,
		};
		Ejercicio1 ejercicio1 =new Ejercicio1();
		//ejercicio1.getSubarreglo(arr);
		ejercicio1.consecutiveNumbers(arr, 0);
	

		
		}
		
	
	

}
