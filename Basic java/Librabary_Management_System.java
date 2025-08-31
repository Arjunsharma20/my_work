// 3. Library Management System (Intermediate)
// Concepts: Classes and Objects, Collections, File I/O, Database Simulation.
// Description: Build a library management system where users can check out books, return books, and search for books by title, author, or genre. You could implement a simple file-based database or use an actual database like SQLite.
// Skills: OOP concepts, file handling, managing data structures, and optionally working with databases.

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Librabary_Management_System {
    public static void main(String[] args) {
    
    Library library = new Library(13,1,9,3)

    
    }
}
class Student{
    String name;
    // String Caste;
    int roll_no;
    String phone_number;
    String email_id;
    int total_capacity;
    int remaning_capacity;
    int days_taken;

    Student(int roll_no,String phone_number,String email_id,int total_capacity,int remaning_capacity,int days_taken){

        this.roll_no = roll_no;
        this.phone_number = phone_number;
        this.email_id = email_id;
        this.total_capacity = total_capacity;
        this.remaning_capacity = remaning_capacity;
        this.days_taken = days_taken;

    }
    
}
class Library{
    int total_books;
    int no_of_each_book;
    int total_book_available;
    int days_of_return;
    int each_books_available;
    String title;
    String genre;

    Library(int total_books,int no_of_each_book,int total_book_available,int days_of_return,int each_books_available,String title,String genre ){
        this.total_books = total_books;
        this.no_of_each_book = no_of_each_book;
        this.total_book_available = total_book_available;
        this.days_of_return = days_of_return;
        this.each_books_available = each_books_available;
        this.title = title;
        this.genre = genre;

    }
    void name_write(){
        String filepath = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\text.txt";
        try(FileWriter writer = new FileWriter(filepath)){
            writer.write("C Programming");
            writer.write("DATABASE MANAGEMENT SYSTEM");
            writer.write("PYTHON LANGUAGE");
            writer.write("OPERATING SYSTEM");
            writer.write("Communication skills");
            writer.write("Mathematics");
            writer.write("Let Us C");
            writer.write("Elements of Mathematics For B.C.A");
            writer.write("Software Engineering");
            writer.write("Introduction to data science");
            writer.write("Communication skills");
            writer.write("Data structures and algorithms");
            writer.write("Computer Organisation");
            System.out.println("Sucessfully Write file");
        }
        catch(FileNotFoundException e){
            System.out.println("File location is not found");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }

}

