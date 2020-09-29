package com.examen.backend;

import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Ejercicio5 {

	public Ejercicio5() {

	}

	  public static String getRemoveAlfaNumerico(String str) 
    { 
       str = str.replaceAll( 
          "[a-zA-Z0-9]", ""); 
       return str; 
    } 
	
	
	public static boolean getBalanceo2(String str) {
		
		String s=getRemoveAlfaNumerico(str);
		boolean bandera=false;
		
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); ++i) {
			if ((s.charAt(i) == '(') || (s.charAt(i) == '{') || (s.charAt(i) == '[')) {
				st.push(s.charAt(i));
			} else if (st.isEmpty() == false) {
				switch (s.charAt(i)) {
				case ']':
					if (st.pop() != '[') {}
					break;
				case '}':
					if (st.pop() != '{') {}
					break;
				case ')':
					if (st.pop() != '(') {}
					break;
				}
			}
		}
		if (st.isEmpty()) {
			bandera=true;
		} else
			bandera=false;

		return bandera;

	}


	public static void main(String[] args) {
		String s = "([)]";
		System.out.println(getBalanceo2(s));
		
	
	}

	
}
