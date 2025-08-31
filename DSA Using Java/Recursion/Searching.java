
import java.util.ArrayList;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5,6,7,5,9,5};
        System.out.println(search(arr,0,5));
        searchall(arr, 0, 5);
        System.out.println(list);
    }
    static int search(int[] arr,int index,int target){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return search(arr, index+1, target);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchall(int[] arr,int index,int target){
        if(index == arr.length-1){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        searchall(arr, index+1, target);
        

    }
}
