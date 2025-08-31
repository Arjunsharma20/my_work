public class main {
    public static void main(String[] args) {
        // Super = Refers to the parent class: (subclass <- superclass)
        // used in constructor and method overloading calls the parents 
        // constructor to initialize attribute
        Person person1 = new Person("Tom", "Riddle");
        person1.showname();
        Student student1 = new Student("Arjun", "Sharma", 7.9);
        student1.showname();
        student1.showgpa(); // Uncommented to show GPA
        System.out.println(student1.gpa);
        Employee employee1 = new Employee("Arjun", "Sharma", 100);
        System.out.println(employee1.salary);
    }
}

class Person {
    String first;
    String last;

    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void showname() {
        System.out.println(this.first + " " + this.last);
    }
}

class Student extends Person {
    double gpa;

    public Student(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    void showgpa() { // Uncommented to show GPA
        System.out.println(this.first + "'s GPA: " + this.gpa);
    }
} // Closing bracket for Student class

class Employee extends Person {
    int salary;

    public Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }
}