
import java.util.Scanner;

public class Tree_Ds {

    private static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.print("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.print("Do you want to insert left of " + node.value + "? (true/false): ");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.print("Enter value for left of " + node.value + ": ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.print("Do you want to insert right of " + node.value + "? (true/false): ");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.print("Enter value for right of " + node.value + ": ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void pretydisp() {
        pretydisp(root, 0);
    }

    private void pretydisp(Node node, int level) {
        if (node == null) {
            return;
        }
        pretydisp(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        pretydisp(node.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree_Ds tree = new Tree_Ds();
        tree.populate(scanner);
        tree.pretydisp();
        scanner.close();
    }
}
