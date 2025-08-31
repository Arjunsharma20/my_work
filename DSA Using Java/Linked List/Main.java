public class Main{
    public static class Node{    //User define data type
        int data;   //value
        Node next;    //address
        Node(int data){
            this.data =data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(20);
        Node n = new Node(17);
        Node na = new Node(1220);
        Node ga = new Node(1709);
        Node gn = new Node(2012);
        Node g = new Node(12);
        a.next = n;
        n.next = na;
        na.next =ga;
        ga.next = gn;
        gn.next = g;
        Node temp = a;
        // g.next = null;
        // System.out.println(a.data);
        // System.out.println(n.data);
        // System.out.println(na.data);
        // System.out.println(ga.data);
        // System.out.println(gn.data);
        // System.out.println(n.data);



        // while(temp !=null){
        //     System.out.print(temp.data +" ");
        //     temp = temp.next;
        // }

       display(a);
       shwo(a);
    }


    public static void display(Node head){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        
    }

    public static void shwo(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data +" ");
        shwo(head.next);
    }

}
