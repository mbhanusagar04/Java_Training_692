package UseCase1;

//Custom exception for invalid registration
public class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

