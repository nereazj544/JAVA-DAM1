package segundaevaluacionjava;

import java.util.ArrayDeque;
import java.util.Deque;

public class ej72 {
	public static void main(Deque<Integer> stack) {
		Deque<Integer> Stack = new ArrayDeque<>();
		int max = Integer.MIN_VALUE;

        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num >= max) {
                Stack.push(num);
                max = num;
            }
        }

        int size = Stack.size();
        for (int i = 0; i < size; i++) {
            stack.push(Stack.pop());
        }
    }

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(2);
        stack.push(7);
        stack.push(12);
        stack.push(5);
        stack.push(14);
        stack.push(9);
        stack.push(7);
        stack.push(10);
        stack.push(17);
        stack.push(17);
        stack.push(22);
        stack.push(6);

        System.out.println("Stack antes de la eliminación: " + stack);
        main(stack);
        System.out.println("Stack después de la eliminación: " + stack);
    }
	}

