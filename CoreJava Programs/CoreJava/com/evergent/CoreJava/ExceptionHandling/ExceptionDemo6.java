package com.evergent.CoreJava.ExceptionHandling;
//Finally is block if exception hierarchical
class ExceptionDemo6 {

	 
		
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
			catch(Exception a) {
				System.out.println("I can Handle :"+a);
		}
			finally {
				System.out.println("Finally block close connection");
			}
			}
			public static void main(String[] args) {
				ExceptionDemo6 ed= new ExceptionDemo6(); 
				ed.myData();
			}
		}
			
