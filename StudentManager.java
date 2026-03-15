import java.util.ArrayList;

public class StudentManager {
    // arraylist to store students
    private ArrayList<Student> students;

    // constructor
    public StudentManager() {
        students = new ArrayList<>();
    }


    // add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // display all students
    public void displayAllStudents() {
        if (students.size() == 0) {
            System.out.println("No students in the system.");
            return;
        }

        System.out.println("\n---Student List---");

        for (Student student : students) {
            System.out.println(student.getDetails());
        }
    }

    // search student by ID
    public Student findStudentById(String id) {
        for (Student student : students) {

            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }

    // remove student by ID
    public boolean removeStudentById(String id) {
        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId().equalsIgnoreCase(id)) {

                students.remove(i);
                return true;
            }
        }
        return false;
    }
}