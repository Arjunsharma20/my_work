
class BST {

    public class Node {

        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getvalue() {
            return value;
        }
    }

    private Node root;

    public BST() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Node");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }

        System.out.println(details + node.getvalue());
        display(node.left, "Left child of " + node.getvalue() + ": ");
        display(node.right, "Right child of " + node.getvalue() + ": ");
    }

    public void insert(int value){
        
    }

}
