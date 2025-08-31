// import java.util.
public class Abtraction {
    public static void main(String[] args) {
        // abstract = used to define abstract classes and methods 
        // Abstraction is the process of hiding implementation details,
        // and showing only the essential features:
        // Abstract classes CAN'T be instantiated directly
        // Can be contain 'abstract' method (which must be implementea)
        // Can contain 'concrete' methods (whcih are inherited)

        // shape shape1 = new shape();
        circle circle1 = new circle(20);
        triangle triangle1 = new triangle(12,20);
        rectangle rectangle1= new rectangle(33,20);
        circle1.display();
        triangle1.display();
        rectangle1.display();
        System.out.println(circle1.area());
        System.out.println(triangle1.area());
        System.out.println(rectangle1.area());

    }
}
abstract class shape{

    abstract double area();  //this is a abstract method

    void display(){ //Concrete
        System.out.println("tis is a shape");
    }
    

}
class circle extends shape {
    double radious;
    circle(double radious){
        this.radious = radious;
    }
    @Override
    double area(){
        return Math.PI * radious * radious;
    }
}
class triangle extends shape{
    double heigth;
    double base;
    triangle(double heigth,double base){
        this.heigth = heigth;
        this.base = base;
    }
    @Override
    double area(){
        return (base*heigth)/2;
    }
}
class rectangle extends shape{
    double lenght;
    double width;
    rectangle(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }
    @Override
    double area(){
        return lenght*width;
    }
}
