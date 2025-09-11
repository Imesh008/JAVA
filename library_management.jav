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





}

// LibraryManagement class to manage books and 