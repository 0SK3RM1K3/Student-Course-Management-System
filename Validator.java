import java.util.regex.Pattern;

public class Validator{

    //Validate student ID (Must be exactly 9 digits)
    public static boolean isValidStudentId(String id){
        return Pattern.matches("\\d{9}", id);
    }
    // Validate Email format 
    public static boolean isValidEmail(String email){
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }
    //Validate name(Letters and spaces only, at least two characters
    public static boolean isValidName(String name){
        return Pattern.matches("[A-za-z ]{2,}", name.trim());
    }
}