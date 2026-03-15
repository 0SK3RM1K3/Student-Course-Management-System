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


            }
