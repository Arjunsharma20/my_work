
import java.util.ArrayList;

public class permutaion{
    public static void main(String[] args) {
        // String up = "abc";
        // String p = "";
        permu("","ag");
        // ArrayList<String> ans = new ArrayList<>();

        // permutation_list("p", "abc");
        // System.out.println(ans);
        // System.out.println();
    }
     static void permu(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permu(f+ch+s, up.substring(1));
        }
     }
     static ArrayList<String> permutation_list(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            // return null;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutation_list(f+ch+s, up.substring(1)));
            // return ans;
        }
        return ans;
     }
}