package services;

import models.Book;
import models.Student;
import java.util.ArrayList;

public class LibraryManagement{
    private ArrayList<Book> books;
    private ArrayList<Student> students;

    //constructor
    public LibraryService (){
        books = new ArrayList<>();
        students = new ArrayList<>();
    }

    //Add book to the library
    public void addBook (Book book){
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    //add student to the library system
    public void addStudent (Student student ){
        students.add(student);
        System.out.println("Student added: " + student.getName());

    }
     
    //Borrow a book
    public vodi borrowBook (int book id, int studentId){
        Book book = findBook(bookId);
        if (book != null && book.isAvailable ()){
            book.setAvailable(false):;
            System.out.println("Book borrowed: " + book.getTitle());
        }else{
            System.out.println("Book not available ");
        }

    }

    //Find book by ID
    private Book findBook (int bookID){
        for (Book book : books){
            if (book.getId() == bookID){
                return book;
            }
        }
        return null;
    }
    public void displayBooks(){
        for (Book book :book){
            System.out.println(book);
        } 
        
    }





}

// LibraryManagement class to manage books and 