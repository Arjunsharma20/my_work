public class overload_method {
    public static void main(String[] args) {
        // Overload method = method that share the same name,
        //                   but different parameters.
        //                   signature = name + parameters
        System.out.println(add(1,2 ));
        System.out.println(add(1, 2,3));  //this is method overload
    }
    static double add(double a , double b){
        return a+b;
    }
    static double add(double a , double b ,double c){
        return a+b+c;
    }
    // Method can same name but they have different parameters
    // if the name and parameter are same then it give error
}
