
import java.util.Scanner;

public class Dynamic_polymorphism {
    public static void main(String[] args) {
        // Runtime/Dynamic Polymorphism = When the method that gets executed
        // is defined at runtime based on the actual type of the object.
        Scanner scanner = new Scanner(System.in); 
        Animal animal;
        System.out.println("Would you like a dog or a cat? (1 = Dog , 2 = Cat)");
        int choice = scanner.nextInt();
        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice ==2){
            animal = new Cat();
            animal.speak();
        }
        else{
            System.out.println("Plese give valid choice");
        }
        // Dog dog = new Dog();
        // Cat cat = new Cat();
        scanner.close();
    }
}

abstract class Animal{
    abstract void speak();
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("The dog goes woof");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("The cat goes meow");
    }
}
