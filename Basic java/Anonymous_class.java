public class Anonymous_class {
    public static void main(String[] args) {
        // Anonymous class = A class that doesn't have a name. Cannot a reused.
        // Add custom behaviour without having to create a new class a new class.
        // Often used for one time uses (Timertask, Runnable, callback)
        Dog dog = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo say Ruh Ruh");
            }
        }
        dog.speak();

    }
}
class Dog{
    void speak(){
        System.out.println("Dog will bark");
    }
}
