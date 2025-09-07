package models;
//Book class to represent a book in the library

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book (int id, String title , String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    //Getters and setters
    public int getID() {return id;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public boolean isAvailable() {return isAvailable;}

    public void setAvailable (boolean available) {
        this.isAvailable = available;
    }

    //Method to display book information
    public void displayInfo(){
        System.out.println ("Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);

    }

}
