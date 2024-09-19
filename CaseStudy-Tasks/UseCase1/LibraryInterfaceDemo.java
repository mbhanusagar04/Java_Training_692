package UseCase1;

import java.util.Scanner;
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter age");
    	
    	int input1=scanner.nextInt();
    	System.out.println("Enter Book");
    	String input21=scanner.next();
    	LibraryUser kidUser = new KidUser();
    	LibraryUser adultUser = new AdultUser();
    	
    	while(true) {
    	if(input1<12) {
    		kidUser.registerAccount(input1);
    		kidUser.requestBook(input21);
    		break;
    	}
    	else {
    		adultUser.registerAccount(input1);
    		adultUser.requestBook(input21);
    		break;
		}
    	
        // Test case #1: KidUser
       // LibraryUser kidUser = new KidUser();
        
        // Test with age 10
        /*System.out.println("Test Case-1");
        kidUser.registerAccount(10);
        kidUser.requestBook("Kids");
        System.out.println();
        
        // Test with age 18
        System.out.println("Test Case-2");
        kidUser.registerAccount(18);
        kidUser.requestBook("Fiction");
        System.out.println();
        
        // Test case #2: AdultUser
        //LibraryUser adultUser = new AdultUser();
        
        // Test with age 5
        System.out.println("Test Case-3");
        adultUser.registerAccount(5);
        adultUser.requestBook("Kids");
        System.out.println();
        
        // Test with age 23
        System.out.println("Test Case-4");
        adultUser.registerAccount(23);
        adultUser.requestBook("Fiction");
        System.out.println();*/
    }}
}

