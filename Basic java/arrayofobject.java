public class arrayofobject {
    public static void main(String[] args) {
        Car car1 = new Car("Mahindra","Fortuner",2025,5000000);
        Car car2 = new Car("Tata","Nano",2020,200000);
        Car car3 = new Car("Tata","tiago",2020,200000);
        Car car4 = new Car("Tata","swif",2020,200000);
        Car[] cars = {car1,car2,car3,car4};
        for(int i = 0 ;i< cars.length;i++){
            cars[i].drive();
        }
    }
}
class Car {
    String make;
    String model;
    int year;
    double price;
    boolean isRunning = false;
    Car(String make,String model,int year,double price){
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
    }
    void drive(){
        System.out.println("You can drive" +this.model);
    }
}
