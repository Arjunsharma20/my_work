
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class In_Build_Stack_Queue{

    public static void main(String[] args) {

// In build stack and queue

        System.out.println("Stack");
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(17);
        stack.push(20);
        stack.push(12);
        stack.push(9);
        System.out.println(stack);
        // System.out.println();
        // stack.push(2017);
        System.out.println("Remove in LIFO ");
        System.out.print("[" + stack.pop() + ",");
        System.out.print(stack.pop() + ",");
        System.out.print(stack.pop() + ",");
        System.out.print(stack.pop() + "]");
        // System.out.println(stack.pop());
        System.out.println();

        System.out.println();


        System.out.println("Queue");
        Queue<Integer> queue = new LinkedList<>();
        // queue.add(3);
        queue.add(17);
        queue.add(20);
        queue.add(12);
        queue.add(9);
        System.out.println(queue);
        // System.out.println();

        // System.out.println(queue.remove());
        System.out.println("Remove in FIFO");
        System.out.print("[" + queue.remove() + ",");
        System.out.print(queue.remove() + ",");
        System.out.print(queue.remove() + ",");
        System.out.print(queue.remove() + "]");
        System.out.println();
        System.out.println();


        System.out.println("Deque");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(17);
        deque.add(20);
        deque.add(12);
        deque.add(9);
        System.out.println(deque);

        System.out.println("Remove in any order");
        System.out.print("[" + deque.remove() + ",");
        System.out.print(deque.removeFirst() + ",");
        System.out.print(deque.removeLast() + ",");
        System.out.print(deque.remove() + "]");

    }
}
