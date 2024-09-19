package com.evergent.CoreJava.ExceptionHandling;

import javax.management.remote.SubjectDelegationPermission;

class InvalidAgeException extends Exception {
	 public InvalidAgeException(String message) {
		 super(message);
	 }
}
public class UserDefineExceptiondemo10{
	public static void CheckAge(int age) throws InvalidAgeException {
		if (age<18)
			throw new InvalidAgeException("Age must be 18 or Older");
		else {
			System.out.println("Acess granted-You are old enough");
		}
	}
	public static void main(String [] args) {
		try {
			CheckAge(16);
		} catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println("Caught the Exception :"+e);
			System.out.println(e);
		}
		System.out.println("Program continuos after handling the exception");
	}
	
} 