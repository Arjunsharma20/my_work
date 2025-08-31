public class poly_interface {
    public static void main(String[] args) {
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

interface Vehicle{
    void go();
}
class Car implements Vehicle {
    @Override
    public void go(){
        System.out.println("You drive the car");
    }
}
class Bike implements Vehicle{
    @Override
    public void go(){
        System.out.println("You drive the Bike");
    }
}
class Boat implements Vehicle{
    @Override
    public void go(){
        System.out.println("You drive the Boat");
    }
}

