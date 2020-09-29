# examenBack
Examen para posición de desarrollador backened

Para este examen se hizo lo siguiente:



1-.El primer problema se convirtió el array con una stream a lista, se detecta los consecutivos para ser eliminados, después se compara las lista de enteros con la otra lista para eliminar los valores repetidos, limpiarlos y tener el subconjunto de números consecutivos. 


2-.Se realiza una sumatoria con limites definidos desde n a m los cuales se suman con un acumulador y un ciclo for.

	El tipo de complejidad es de orden polinómico que caracteriza a los ciclos for.

3.-   El arreglo se pasa a una PriorityQueue o cola de prioridad  en le cual el número de mayor prioridad sera desencolado más rápido y en cada interacción añadiremos un elemntos al heap. Además, mantendremos el tamaño del aray para que sea menor o igual que k.

Debido al problema indicado, k siempre es menor que el tamaño del arreglo. Entonces, significa que O (n * log k) ≤ O (n * log n).


4.,La interfaz set no permite los valores repetidos por lo cual es natural poder convertir el arreglo de enteros a un Lista y utilizando el stream().boxed().collect(Collectors.toList());
pasarlo a un List<Integer> para castearlo a un set y volverlo a un arreglo.


5-.Para que la cadena con los corchetes primero se limpian de cualquier otro caracter , los pares de corchetes de apertura y cierre deben coincidir. 
Según el planteamiento del problema, el comportamiento equilibrado debe comprobarse entre paréntesis. Por lo tanto, cualquier cadena de entrada que contenga caracteres que no sean corchetes es una cadena no balanceada.
  Se itera la cadena y se compara el primer carácter a balancear con el de cierre el stack es vaciado y vuelve a repetir el proceso, si el stack queda vacío manda un true por lo cual la cadena está balanceada.

6-. Se hace la conversión de la cadena de tipo “HH:MM” para tener un tipo de long en cada array y poder hacer así la comparativa del tiempo de cada actividad se itera con un for y se compara la horas donde sea mayor la hora de entrada que la de salida al devolver el número de iteración , ese es el número de actividades.



