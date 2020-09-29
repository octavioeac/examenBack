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

	public List<Integer> getSubarreglo(int[] enteros) {

		ArrayList<Integer> enteroList = new ArrayList<Integer>();
		Arrays.stream(enteros).forEach(i -> enteroList.add(i));

		int counter = 0;
		for (int x = 0; x < enteroList.size() - 2; ++x) {

			if (enteroList.get(x) < enteroList.get(x + 1) && enteroList.get(x) < enteroList.get(x + 2)) {
				enteroList.remove(x);
				enteroList.remove(x);
				enteroList.remove(x);
				counter++;
				x = -1;
			} else {

			}

			if (enteroList.isEmpty())
				break;
		}

		List<Integer> list = Arrays.stream(enteros).boxed().collect(Collectors.toList());

		list.removeAll(enteroList);
		System.out.println(list.toString());

		return list;
	}



}
