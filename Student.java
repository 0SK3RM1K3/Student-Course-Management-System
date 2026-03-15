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

    //add course function
    public void addCourse(String course) {
        courses.add(course);
    }

    //get course function
    public ArrayList<String> getCourses() {
        return courses;
    }

    //class specific behaviour for getDetails
    @Override
    public String getDetails() {
        return "Student: " + getName() +
               "\nID: " + getId() +
               "\nEmail: " + getEmail() +
               "\nCourses: " + courses;
    }
}