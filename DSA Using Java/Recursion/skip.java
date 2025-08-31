public class skip {
    public static void main(String[] args) {
        String str = "bcaddac";
        // StringBuilder ans =new StringBuilder();
        // skip_char(str, 0, ans);
        // String ans ='';
        skip(" ", str);
        String newstr = "appleabduew";
        skip_string(" ", str);
    }
    static void skip(String ans,String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            skip( ans ,str.substring(1));

        }
        else{
            skip( ans+ch,str.substring(1));
        }

    }
    static void skip_string(String ans1,String str){
        if(str.isEmpty()){
            System.out.println(ans1);
            return;
        }
        // char ch = str.charAt(0);
        if(str.startsWith("aplle")){
            skip_string( ans1 ,str.substring(5));

        }
        else{
            skip_string( ans1 ,str.substring(5));
        }

    }
}        
       
