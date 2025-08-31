public class OOPS {
    // object = An entity that holds data (attributes)
    // and can perform actions (methods)
    // It is a referencr data type
    // calss = It is a blueprint of the object
    public static void main(String[] args){
        Car car = new Car();
        System.out.println(car.model);
        System.out.println(car.price);
        car.start();
        car.stop();
    }
}

