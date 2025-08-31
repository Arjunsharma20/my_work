public class overloaded_constructor {
    public static void main(String[] args) {
        // overloadded constructor = Allows a class to have a multiple 
        //constructors with different parameter lists Enable object to 
        //be initiated in various ways
    user user1 = new user("Arjun","arjunsharma@gmail.com",19);
    user user2 = new user("Golu");
    System.out.println(user1.username);
    System.out.println(user1.email);
    System.out.println(user1.age);
    System.out.println(user2.username);
    System.out.println(user2.email);
    System.out.println(user2.age);
    }
}
class user{
    String username;
    String email;
    int age;
    user(String username,String email,int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
    user(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
}
