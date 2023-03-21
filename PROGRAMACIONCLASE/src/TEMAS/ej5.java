package segundaevaluacionjava;

import java.util.LinkedList;
import java.util.Stack;

public class ej5 {
	 public static void reorderStack(Stack<Integer> stack) {
	        LinkedList<Integer> queue = new LinkedList<>();
	        while (!stack.isEmpty()) {
	            int num = stack.pop();
	            if (num >= 0) {
	                queue.addLast(num);
	            } else {
	                queue.addFirst(num);
	            }
	        }
	        while (!queue.isEmpty()) {
	            stack.push(queue.removeFirst());
	        }
	    }

	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();
	        stack.push(1);
	        stack.push(2);
	        stack.push(-1);
	        stack.push(-2);
	        stack.push(3);

	        reorderStack(stack);

	        System.out.println(stack);
	    }
}
