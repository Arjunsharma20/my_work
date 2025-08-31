public class Method_overriding {
    public static void main(String[] args) {
        // Method Overriding = When a subclass provide its own implementation 
        // of a method that is already define. Allows for code reusability and 
        // give specifies and give specific implementation.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        dog.move();
        cat.move();
        fish.move();

    }
}
class Animal{
    void move(){
        System.out.println("This animal is running");
    }

}
class Dog extends Animal{

}
class Cat extends Animal{

}
class Fish extends Animal{
    @Override
    void move(){
        System.out.println("This animal is swimming");
    }
}

