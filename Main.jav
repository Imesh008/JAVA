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
        System.out.println("All Books:");
        library.displayBooks();

        //Borrow a book
        System.out.println("\nBorrowing Book :");
        library.borrowBook(1, 1); // Alice borrows "1984"
        library.borrowBook(1, 2); // Bob tries to borrow "1984" again

        //Display all books again
        System.out.println("\nAll Books After Borrowing:");
        library.displayBooks();

    }


}
