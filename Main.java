import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        

        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("Enter name:");
            String name = scanner.nextLine();

            System.out.println("Enter Student ID(9 digits):");
            String id= scanner.nextLine();

            // Validate ID using Validator class 
            if(!Validator.isValidStudentId(id)){
                throw new IllegalArgumentException("Student ID must be exactly 9 digits.");
            }
            System.out.println("Enter Email:");
            String email = scanner.nextLine();

            //Validate email using the Validator class
            if (!Validator.isValidEmail(email)){
                throw new IllegalArgumentException("Invalid email format.");
            }

            //Create new student 

            Student student = new Student(name, id, email);

            System.out.println("Enter a course:");
            student.addCourse(scanner.nextLine());

            System.out.println("Please enter another course:");
            student.addCourse(scanner.nextLine());

            //Print out the student details
            System.out.println("\nStudent Details:");
            System.out.println(student.getDetails());

        }   //Catches any validaton errors
            catch(IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
            //Catches any unexpected errors
            catch(Exception e){
                System.out.println("Unexpected error:" + e.getMessage());
        }
            finally{
                System.out.println("Thank you for using our program!");
            }
        
    }
    
}
