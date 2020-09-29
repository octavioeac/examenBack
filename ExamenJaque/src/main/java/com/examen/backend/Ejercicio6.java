package com.examen.backend;

import java.text.ParseException;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio6 {

	public Ejercicio6() {
		
		
	}
	
	public static long getHora(String hora) {
		  LocalTime t = LocalTime.parse( hora);
		  long milliSeconds = t.getLong(ChronoField.SECOND_OF_DAY);
		return milliSeconds;

	}
	
	public static long[] getLongHoras(String[] horas){
		List<String> horaStr=Arrays.asList(horas);
		List<Long> h=horaStr.stream().map(i->Ejercicio6.getHora(i)).collect(Collectors.toList());
		return h.stream().mapToLong(l -> l).toArray();
	}
	



	public static int getNumeroSalones(String inicio[], String fin[], int n) 
		    {
		
		long[] s=getLongHoras(inicio);
		long[] f=getLongHoras(fin);
		
	    int i, j; 
	    i = 0; 
	    for (j = 1; j < n; j++) 
	    {
	         if (s[j] >= f[i]) 
	         { 
	              i = j; 
	          } 
	     } 
	    
	    return i;
	    } 
	       
	

	
	
}
