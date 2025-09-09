package models;

//Student class to represent a student in the library system
public class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Getters
    public int getID() {return id;}
    public String getName() {return name;}
  }
