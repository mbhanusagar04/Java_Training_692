package com.evergent.CoreJava.Collections.bhanu.task1;

import java.util.*;
public class EmployeeData1{
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee details");
		for(int i=0;i<3;i++){
			Employee obj=new Employee();
			System.out.println("Enter the id");
			 obj.setId(sc.nextInt());
			System.out.println("Enter the name");
			obj.setName(sc.next());
			System.out.println("Enter the salary");
			obj.setSalary(sc.nextFloat());
			list.add(obj); 		}		 
	
		Iterator<Employee> obj=list.iterator();
		while(obj.hasNext()){
			System.out.println("Iterator order");
			Employee ob=obj.next();
			System.out.println(ob.getId()+ " "+ ob.getName()+ " "+ob.getSalary());
		} 	
		
	}

}                                  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        