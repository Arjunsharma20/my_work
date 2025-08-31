
public class Custom_Stack {

    public static void main(String[] args) throws Exception {
        Stacks stack = new Stacks(4);

        stack.push(17);
        stack.push(20);
        stack.push(12);
        stack.push(9);
        stack.push(10);
        stack.push(27);
        // stack.push(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.peek());
    }
}

class Stacks {

    protected int[] data;
    private static final int DEFAULT_SIZZE = 10;
    int ptr = -1;

    public Stacks() {
        this.data = new int[DEFAULT_SIZZE];
    }

    public Stacks(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        // boolean isFull = false;
        if (isFull()) {
            System.out.println("Stack is OverFLow");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    private boolean isFull() {
        return ptr == data.length - 1;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot removed an item from empty stack");
        }

        int removed = data[ptr];
        ptr--;
        
        return removed;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
    public int peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("Cannot find top item from empty stack");
        }
        return data[ptr];
    }


}
