import java.util.ArrayList;

//Student class that extends Person
public class Student extends Person {

    //List to store courses
    private ArrayList<String> courses;

    //constructor
    public Student(String name, String id, String email) {
        super(name, id, email);
        courses = new ArrayList<>();
    }
}