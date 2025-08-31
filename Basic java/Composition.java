// Java program to illustrate
// the concept of Composition

//importing classes
import java.util.*;
//Class 1
class Book {
    public String title;
    public String author;

    // Constructor to initialize a book with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

// Class 2
// Library class demonstrating composition
class Library {
    private final List<Book> books;

    // Library constructor initializes books internally
    Library() {
        // Creating a new list to hold the books
        this.books = new ArrayList<>();
        // Internal creation of Book objects
        // Adding books to the library
        this.books.add(new Book("Effective Java", "Joshua Bloch"));
        this.books.add(new Book("Thinking in Java", "Bruce Eckel"));
        this.books.add(new Book("Java: The Complete Reference", "Herbert Schildt"));
    }

    // Method to return the list of books in the library
    public List<Book> getTotalBooksInLibrary() {
        return books;
    }
}

// Main class
public class Composition {
    public static void main(String[] args) {
        // Creating an instance of Library
        Library library = new Library();

        // Getting the list of books from the library
        List<Book> bks = library.getTotalBooksInLibrary();

        // Iterating over the books and printing their details
        for (Book bk : bks) {
            System.out.println("Title: " + bk.title + " and Author: " + bk.author);
        }
    }
}
