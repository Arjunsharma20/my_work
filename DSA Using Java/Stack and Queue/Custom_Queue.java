public class Custom_Queue {
    public static void main(String[] args) throws Exception {
        Queues queue = new Queues(4);
        queue.insert(17);
        queue.insert(20);
        queue.insert(12);
        queue.insert(9);
        queue.insert(10);
        queue.insert(27);
        System.out.println(queue.delete());
        System.out.println(queue.delete());
        System.out.println(queue.delete());
        System.out.println(queue.delete());
        System.out.println(queue.tail());
    }
}

class Queues{
    private int[] data;
    private static final int DEFAULT_SIZZE = 10;
    int end = -1;

    public Queues() {
        this.data = new int[DEFAULT_SIZZE];
    }

    public Queues(int size) {
        this.data = new int[size];
    }
    
    private boolean isFull() {
        return end == data.length-1 ;
    }
    private boolean isEmpty() {
        return end == -1;
    }
    public boolean insert(int item){
        if(isFull()){
            resize(data.length*2);
        }
        data[++end] = item;
        return true;
    }
    public int delete() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot delete the item because the queue is empty");
        }
        int removed = data[end];
        end--;
        return removed;
    }

    private void resize(int size) {
        int[] temp = new int[size];
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data= temp;
    }
    public int tail(){
        return data[end];
    }
}
