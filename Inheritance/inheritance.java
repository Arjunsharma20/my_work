public class inheritance {
    // inheritance = one class inherits the attributes and elements from
    // another class .
    // Child <- Parent <- Grandparent
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.human();
        cat.eat();
    }
}
class Organism{
    void human(){
    System.out.println("This is organism class");
    }
}
class Animal extends Organism{
    boolean isAlive;
    Animal(){
        isAlive = true;
    }
    void eat(){
        System.out.println("The animal is eating");
    }
}
class Dog extends Animal{

}
class Cat extends Animal{

}