public class Getter_Setter {
    public static void main(String[] args) {
        // They help protect object data and add rules for accessing or 
        // modifying them.
        // GETTERS = Methods that make a field READABLE
        // SETTERS = Methods that make a field WRITEABLE

        Car car = new Car("Mahindra","Balck" ,10000000);
        // System.out.println(car.model);
        car.setColor("White");
        car.setPrice(50000);
        System.out.println(car.getModel() + " "+ car.getColor() + " "+ car.getPrice());
    }
}
class Car{
    private final String model; //final used for non changeable of the value
    private String color;
    private int price;

    Car(String model,String color,int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$"+ this.price;
    }
    void setColor(String color){
        this.color =color;
    }
    void setPrice(int price){
        if(price<0){
            System.out.println("Price can not be negative");
        }
        else{
        this.price = price;
        }
    }
}
