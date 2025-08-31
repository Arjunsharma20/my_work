import java.lang.classfile.instruction.ArrayStoreInstruction;
import java.util.Arrays;
public class Arrray {
    // array = a collection of value of the same data type 
    //         think of its as a variable that can store more than 1 value 
    public static void main(String[] args) {
        String[] fruits = {"apple","bannana","orange","coconut"};
        System.out.println(fruits[0]);
        // Arrays.sort(fruits);
        Arrays.fill(fruits ,"pineapple");
        // for(int i = 0;i<=fruits.length;i++){
        //     System.out.println(fruits[i]);
        // }

        for(String fruit : fruits){
            System.out.println(fruit);  //Advance loop
        }
    }
}
