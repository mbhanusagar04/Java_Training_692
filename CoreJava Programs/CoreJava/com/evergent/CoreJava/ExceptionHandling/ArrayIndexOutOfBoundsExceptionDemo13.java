package com.evergent.CoreJava.ExceptionHandling;

public class ArrayIndexOutOfBoundsExceptionDemo13 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		try {
			System.out.println(arr[10]);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Cought an Exception "+e);
		}
	}

}