public class polymorphism {
    public static void main(String[] args) {
        // Polymorphism = POLY = "Many"
        //                MORPH = "Shape"
        //                Objects can identify as other objects.
        //                Objects can be treated as object of common superlass

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();
        // car.go();
        // bike.go();
        // boat.go();
        Vehicle[] vehicles = {car, bike,boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
abstract class Vehicle{
    abstract void go();
}
class Car extends Vehicle {
    @Override
    void go(){
        System.out.println("You drive the car");
    }
}
class Bike extends Vehicle{
    @Override
    void go(){
        System.out.println("You drive the Bike");
    }
}
class Boat extends Vehicle{
    @Override
    void go(){
        System.out.println("You drive the Boat");
    }
}

