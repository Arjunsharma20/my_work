
public class Insertion {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {

        Node head = null;
        Node tail = null;

        void insertatend(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                // tail = temp;
            }
            tail = temp;
        }
        void insertathead(int value){
            Node temp = new Node(value);
            if()

        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                // System.out.print(temp.data + " ");
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertatend(1);
        ll.insertatend(2);
        ll.insertatend(3);
        // System.out.println();
        ll.display();
        System.out.println();
        System.out.println(ll.size());

    }
}
