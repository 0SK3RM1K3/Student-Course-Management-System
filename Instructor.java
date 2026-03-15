public class Instructor extends Person {

    //private field
    private String department;

    //constructor
    public Instructor(String name, String id, String email, String department) {
        super(name, id, email);
        this.department = department;
    }

    @Override
    public String getDetails() {
        return "Instructor: " + getName() +
               "\nID: " + getId() +
               "\nEmail: " + getEmail() +
               "\nDepartment: " + department;
    }
}