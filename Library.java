package Codes;
import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String title;
    String author;
    String isbn;
    

    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+isbn);
    }
}

class LibrarySystem{
    ArrayList<Book> books = new ArrayList<>();

    LibrarySystem() {
        books.add(new Book("Java", "James Gosling", "1234"));
        books.add(new Book("Python", "Guido van Rossum", "5678"));
        books.add(new Book("C++", "Bjarne Stroustrup", "91011"));
    }

    void search(ArrayList<Book> books, String title){
        for (Book book: books){
            if (book.title.equals(title)){
                System.out.println("Title: " + book.title + "| Author: " + book.author + "| ISBN: " + book.isbn);
                return;
            }
        }
        System.out.println("Book not found!");
    }
}

public class Library {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibrarySystem sys = new LibrarySystem();
    
        for(Book book: sys.books){
            book.display();
        }
        System.out.println("Title:");
        String title = scanner.nextLine();
        sys.search(sys.books, title);
        scanner.close();


    }
}
