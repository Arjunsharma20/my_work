public class interface_method {
    public static void main(String[] args) {
        // Interface = A blueprint for a class that specifies a set of 
        // abstract methods that implement classes MUST define
        // Support multiple inheritance-like behavior.
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

    }
}
 interface Prey{
    void flee();
 }
 interface Prediator{
    void hunt();
 }
 class Rabbit implements Prey{

    @Override
    public void flee(){
        System.out.println("The rabit is running away");
    }
 }
 class Fish implements Prey,Prediator{
    @Override
    public void flee(){
        System.out.println("The Fish is running away");
    }
    @Override
    public void hunt(){
        System.out.println("The Fish is hunting");
    }
 }
 class Hawk implements Prediator{
    @Override
    public void hunt(){
        System.out.println("The hawk is hunting");
    }
 }