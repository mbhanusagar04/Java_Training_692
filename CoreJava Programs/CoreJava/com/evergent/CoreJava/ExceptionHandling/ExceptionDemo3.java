package com.evergent.CoreJava.ExceptionHandling;


public class ExceptionDemo3 {

	 
		
		String name=null;
		public void myData() {
			
			try {
				
				System.out.println("ONE");
				System.out.println(name.length());
				int k=10/0;
				System.out.println("END");
			}
			catch(NullPointerException a) {
				System.out.println("I can Handle :"+a);
		}
			catch(ArithmeticException a) {
				System.out.println("I can Handle :"+a);
		}
			}
			public static void main(String[] args) {
				ExceptionDemo3 ed= new ExceptionDemo3(); 
				ed.myData();
			}
		}
		
	