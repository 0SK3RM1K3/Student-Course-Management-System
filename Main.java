import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        try {

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
        }
    }
    
}
