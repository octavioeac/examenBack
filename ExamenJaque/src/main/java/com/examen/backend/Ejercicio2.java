package com.examen.backend;

public class Ejercicio2 {

	public Ejercicio2() {
		
	}

	
	public int getSumatoriaLimites(int n, int m){
		
		int acum=0;
		
		for(int i=n; i<=m; i++){
			
			
			acum+=i;
			
		}
		return acum;
	
	}
	
	
	public static void main(String[] args) {
		
		Ejercicio2 eje2= new Ejercicio2();
		System.out.println( eje2.getSumatoriaLimites(3, 6));

	}

}
