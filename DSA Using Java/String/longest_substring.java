public class longest_substring{
    public static void main(String[] args){
        String s ="abc";
        show_substring(s);
    }
    static void show_substring(String s){
        int n =s.length();
        for(int i = 0;i<n;i++){
            for(int j = 1;j<=i;j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
       
    } 

