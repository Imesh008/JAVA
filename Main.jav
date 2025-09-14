import models.Book;
import models.Student;
import services.LibraryManagement;

public class Main {
    public static void main (Strring [] args){
        LibraryManagement library = new LibraryManagement();

        //Adding books
        library.addBook(new Book(1, "1984", "George Orwell"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));

        //Adding students
        library.addStudent(new Student(1, "Alice"));
        library.addStudent(new Student(2, "Bob"));

        //Display all books
    }

}
