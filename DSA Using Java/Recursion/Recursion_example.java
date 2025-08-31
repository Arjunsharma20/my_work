public class Recursion_example {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        // Base cndition
        if(n==5){
            System.out.println(5);
            return;
        }
        // body
        System.out.println(n);
        
        // Recursive calls
        // if you are calling a function again and again, you can trear it as a seperate call in the stack
        // this is called tail recursion
        // this is last function call
        print(n+1);
        
    }
}
