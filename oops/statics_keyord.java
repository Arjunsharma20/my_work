public class statics_keyord {
    // static = makes a varaible or method belong to the class
    // rather than to any specific object Commonly used for utility 
    // methods or shared resources .
    public static void main(String[] args) {
        
   
     Friends dost1 = new Friends("Ishitiv");
     Friends dost2 = new Friends("Biswa");
     System.out.println(Friends.numberofFriends);
     System.out.println(dost2.numberofFriends);
     Friends.showFriend();
    }
}
class Friends {
    static int numberofFriends;
    String name;
    Friends(String name){
        this.name = name;
        numberofFriends++;
    }
    static void showFriend(){
        System.out.println("You have " + numberofFriends +" total Friends");
    }
}
