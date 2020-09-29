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
		boolean bandera=true;
		
		
		 Stack<Character> stack  = new Stack<Character>();
	        for(int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if(c == '[' || c == '(' || c == '{' ) {     
	                stack.push(c);
	            } else if(c == ']') {
	                if(stack.isEmpty() || stack.pop() != '[') {
	                    return false;
	                }
	            } else if(c == ')') {
	                if(stack.isEmpty() || stack.pop() != '(') {
	                    return false;
	                }           
	            } else if(c == '}') {
	                if(stack.isEmpty() || stack.pop() != '{') {
	                    return false;
	                }
	            }

	        }
	        return stack.isEmpty();

	}


	public static void main(String[] args) {
		String s = "([)]";
		System.out.println(getBalanceo2(s));
		
	
	}

	
}
