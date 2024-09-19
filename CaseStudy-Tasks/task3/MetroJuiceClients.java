package com.evrgent.CoreJava.Collections.bhanu.task3;

import java.util.Scanner;

import com.evrgent.CoreJava.Collections.bhanu.task2.Book;
import com.evrgent.CoreJava.Collections.bhanu.task2.BookImp;
import com.evrgent.CoreJava.Collections.bhanu.task2.BookInterface;

public class MetroJuiceClients {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MetroJuiceClients mjc=new MetroJuiceClients();
			System.out.println("1. Add Juice \n2.Search by Juice name \n3.displayAll \n4. exit");
			int no=sc.nextInt();
			JuiceImp jImp=new JuiceImp();
			switch(no){
			case 1:System.out.println("Enter the isbn");
				   String Jn=sc.next();
				   System.out.println("Enter the book name");
				   String name=sc.next();
				   System.out.println("Enter the price");
				   int price=sc.nextInt();
				   Juice b=new Juice();
				   b.setJn(Jn);
				   b.setJuiceName(name);
				   b.setJuiceprice(price);
				   
				   String message=jImp.addJuice(b);
				   System.out.println(message);
				   break;
			case 2:System.out.println("Enter the isbn");
			   	   String isb=sc.next();
			   	   jImp.searchByJuiceName(isb);
			   	   break;
			  			
			case 3:jImp.getAllJuices();
				break;
			case 4:System.exit(0);
			}
			
		}
}
