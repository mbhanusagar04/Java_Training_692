package com.evergent.CoreJava.ExceptionHandling;


public class ExceptionDemo2 {

	 
		
		String name=null;
		public void myData() {
			
			try {
				
				System.out.println("ONE");
				System.out.println(name.length());
				System.out.println("END");
			}
			catch(NullPointerException a) {
				System.out.println("I can Handle :"+a);
		}
			}
			public static void main(String[] args) {
				ExceptionDemo2 ed= new ExceptionDemo2(); 
				ed.myData();
			}
		}
		
	