
public class Dynamic_Stack {

    public static void main(String[] args) throws Exception {
        DynaStack stack = new DynaStack(4);
        stack.push(17);
        stack.push(20);
        stack.push(12);
        stack.push(9);
        stack.push(9); // here the dynamic stack use
        stack.push(9); // here the dynamic stack use
        // stack.push(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
class DynaStack {
    protected int[] data;
    private static final int DEFAULT_SIZZE = 10;
    int ptr = -1;

    public DynaStack() {
        this.data = new int[DEFAULT_SIZZE];
    }

    public DynaStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        // boolean isFull = false;
        if (isFull()) {
            resize(data.length * 2);
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    private void resize(int size) {
        int[] temp = new int[size];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data=temp;
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

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot find top item from empty stack");
        }
        return data[ptr];
    }
}
