public class Subsequence{
    public static void main(String[] args) {
        String up = "abc";
        String p="";
        System.out.println(sub_seq(p,up));

    }
    static String sub_seq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return p;
        }
        char ch = up.charAt(0);
        String first= sub_seq(p+ch, up.substring(1));
        String second = sub_seq(p, up.substring(1));
        first.concat(second);
        return first;
    }
}