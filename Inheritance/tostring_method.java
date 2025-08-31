public class tostring_method {
    public static void main(String[] args) {

        // tostring() = Method inherited from the object class.
        // Used to return a string representation of an object .
        // By default, it returns a hash code as a unique indentifier 
        // It can be overridden to provide meaningful details.

        cars car1 = new cars("Mahindra","Scorpio", 2025,"Black");
        System.out.println(car1);
    }
}
class cars{
    String make;
    String model;
    int year;
    String color;
    cars(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    // @Override
    public String tostring(){
        return this.color+ " "+ this.year + " "+ this.make + " " + this.model;
    
    }
}
