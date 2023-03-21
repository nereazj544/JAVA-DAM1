package segundaevaluacionjava;

import java.util.*;

public class ej7 {
	/*Deque<Integer> colPos = new LinkedList<>();
	Deque<Integer> colNeg = new LinkedList<>();*/
	Deque<Integer> cola = new LinkedList<>();
	while (!pila.isEmpty()){
		cola.offer(pila.pop());
		int n = cola.size();
		if (n > 0)
			colNeg.push(n);
		else
			colPos.push(n);
	}
	
	while(!colPos.isEmpty())
		cola.size(colPos.pop());
	while (!colNeg.isEmpty())
		cola.size(colPos.pop());
	
}
}
