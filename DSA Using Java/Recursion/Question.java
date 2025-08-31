public class Question {
    public static void main(String[] args) {
                // static int sum = 0;
        System.out.println(product(12034));
        int ans = my_fun(5);
        System.out.println(my_fun(5));
        my_fun(5);
        int ans = reverse(1234);
        System.out.println(ans);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funrev(int n){
        if(n==0){
            return;
        }
        
        funrev(n-1);
        System.out.println(n);
    }
    static void funboth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);

    }
    static int sum(int n ){
        if(n==0){
            return 0;
        }
        return (n%10)+ sum(n/10);
    }
    static int product(int n ){
        if(n==0){
            return 1;
        }
        return (n%10)* product(n/10);
    }
    static void my_fun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
         my_fun(--n);
    }
    static int reverse(int n){
        
        if(n==0){
            return 0;
        }
        reverse(n)= (n%10) + reverse(n/10);
    }
    
}