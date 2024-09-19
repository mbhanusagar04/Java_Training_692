package com.evergent.CoreJava.Collections.bhanu.CaseStudy2;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TicketOperationsImpl implements TicketOperations {
	ArrayDeque<String> aDeque=new ArrayDeque<>();
	public String addTicket(String ticket) {
		aDeque.add(ticket);
		return aDeque.toString();
	}
	
	public void display() {
		Iterator iterator=aDeque.iterator(); 
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	@Override
	public void processTicket() {
		// TODO Auto-generated method stub
		if(aDeque.isEmpty()) {
			System.out.println("NULL");
		}
		else {
			System.out.println(aDeque.poll());
		}
		
	}
	@Override
	public void peekNextTicket() {
		// TODO Auto-generated method stub
		if(aDeque.isEmpty()) {
			System.out.println("NULL");
		}
		else {
			System.out.println(aDeque.peek());
		}
		
	}

}
