import java.util.Scanner;
public class Array_list {
    public static void main(String[] args) {
        // Array_lists = A resizeeable array taht stores stores objects 
        // (autoboxing) Array are fixed in size, but arraylists can change

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(3);
        // list.add(1);
        // list.add(2);
        // list.add(7);
        // list.add(5);
        // list.remove(1);
        // list.set(1 ,6);

        // // System.out.println(list);
        // // System.out.println(list.get(2));
        // Collections.sort(list);
        // System.out.println(list);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbe of food items");
        int no_of_food = scanner.nextInt();
        for(int i=0;i<=no_of_food;i++){
            String name = scanner.nextLine();
            System.out.println("Your food item is: "+name);
        }
        scanner.close();
    }
}
