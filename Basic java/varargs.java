public class varargs {
    // Varargs = allow a method to accept a varaying # argument
    //  makes method more flexible , no meed for overload method java 
    // will pack two arguments into an array 
    // ... (ellipisis)
    public static void main(String[] args){
        System.out.println(add(1,2,3,4,5));
    }
    static int add(int... numbers){
       int sum =0;
       for(int number:numbers){
        sum+=number;
       }
       return sum;

    }
}
