package com.evergent.CoreJava.Collections.bhanu.CaseStudy2;

import java.util.Scanner;

public class CustomerTicketingSupportSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to Customer Ticketing Support System");
		TicketOperationsImpl to=new TicketOperationsImpl();
		while(true) {
			
			System.out.println("1-Add Ticket \n2-Process Next Ticket \n3- Delete Ticket \n4-Displayy All current Tickets");
			System.out.println("Enter your choice");
			try {
			int choice=scanner.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter Ticket");
				String ticket=scanner.next();
				String ard =to.addTicket(ticket);
				System.out.println(ard);
				break;
			}
			case 2:{
				to.processTicket();
				break;
			}
			case 3:{
				to.peekNextTicket();
				break;
			}
			case 4:{
				to.display();
				break;}
			default:
				System.out.println("Please enter Valid choice");
				break;
			}
		}
			catch (Exception e) {
				System.out.println("Please enter your choice in number format");
				break;
			}

	}

}}
