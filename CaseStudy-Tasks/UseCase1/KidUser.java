package UseCase1;

public class KidUser implements LibraryUser {
    private int age;
    private String bookType;
    
    @Override
    public void registerAccount(int age) {
        try {
            if (age < 12) {
                this.age = age;
                System.out.println("You have successfully registered under a Kids Account");
            } else {
                throw new InvalidAgeException("Sorry, Age must be less than 12 to register as a kid");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public void requestBook(String bookType) {
        this.bookType = bookType;
        if ("Kids".equalsIgnoreCase(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}


