import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        StudentManager manager = new StudentManager();

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

                        String name = "";
                        while(true){
                            System.out.println("Enter name");
                            name = scanner.nextLine();
                            if(Validator.isValidName(name)){
                                break; //Valid name
                            } else{
                                System.out.println("Invalid name. Only letters and spaces are allowed. Please try again");
                            }
                        }

                       String id = "";
                       while(true){
                        System.out.println("Enter Student ID(9 digits):");
                        id = scanner.nextLine();
                        if(Validator.isValidStudentId(id)){
                            break; //Valid ID, exit loop
                        }
                        else{
                            System.out.println("Invalid Student ID. It must be 9 digits.");
                        }
                    }

                       
                        String email = "";
                        while(true){
                            System.out.println("Enter Email:");
                            email = scanner.nextLine();
                            if(Validator.isValidEmail(email)){
                                break; //Valid email exit loop
                            }
                            else{
                                System.out.println("Invalid Email format. Try again.");
                            }
                        }

                        Student student = new Student(name, id, email);
                        
                        System.out.println("Enter a course:");
                        student.addCourse(scanner.nextLine());

                        System.out.println("Please enter another course:");
                        student.addCourse(scanner.nextLine());

                        manager.addStudent(student);


                        break;

                    //Delete Student 
                    case 2:
                        System.out.println("Enter Student ID to delete:");
                        String deleteId = scanner.nextLine();

                        if(manager.removeStudentById(deleteId)){
                            System.out.println("Student removed.");
                        }
                        else{
                            System.out.println("Student not found");
                        }

                    
                        break;

                    //View Students
                    case 3:
                        manager.displayAllStudents();
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

