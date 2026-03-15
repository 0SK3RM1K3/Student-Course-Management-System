import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)){

            boolean running = true;

            while(running){

                //Student Menu System
                System.out.println("\nStudent Menu");
                System.out.println("\n1. Add Student");
                System.out.println("\n2. Delete Student");
                System.out.println("\n3. View Students");
                System.out.println("\n4. Exit");
                System.out.println("\nPlease choose an option");

                int choice = Integer.parseInt(scanner.nextLine());

                switch(choice){

                    //Add student 
                    case 1:

                        System.out.println("Enter name:");
                        String name = scanner.nextLine();

                        System.out.println("Enter Student ID (9 digits):");
                        String id = scanner.nextLine();

                        if(!Validator.isValidStudentId(id)){
                            throw new IllegalArgumentException("Student ID must be exactly 9 digits");
                        }
                        System.out.println("Enter Email:");
                        String email = scanner.nextLine();

                        if(!Validator.isValidEmail(email)){
                            throw new IllegalArgumentException("Invalid email format.");
                        }

                        Student student = new Student(name, id, email);
                        
                        System.out.println("Enter a course:");
                        student.addCourse(scanner.nextLine());

                        System.out.println("Please enter another course:");
                        student.addCourse(scanner.nextLine());

                        students.add(student);

                        System.out.println("Student added successfully!");
                        break;
                        //Delete Student 
                        case 2:

                            System.out.println("Enter Student ID to delete:");
                            String removeStudentById = scanner.nextLine();

                            boolean found = false;

                            for(int i = 0; i  < students.size(); i++){
                                if(students.get(i).getId().equals(removeStudentById));
                                found = true;
                                break;
                            }
                        
                        if(!found){
                            System.out.println("Student not found.");
                        }
                        break;

                        //View Students
                         case 3:
                            if(students.isEmpty()){
                                System.out.println("No students are in the system");
                            } else{
                                for(Student s : students){
                                    System.out.println(s.getDetails());
                                }
                            }
                            break;

                            //Exit the program
                        case 4: 
                            running = false;
                            break;
                        default: 
                        System.out.print("Invalid menu option");
                    }
                }
            }
        catch(IllegalArgumentException e){
            System.out.println("Validation Error:" + e.getMessage());
         }
        catch(Exception e){
        System.out.println("Unexpected error: " + e.getMessage());
        }
        finally{
        System.out.println("Thank you for using our program!");
        }
    

        
    }

}

