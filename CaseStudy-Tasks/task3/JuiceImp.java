package com.evrgent.CoreJava.Collections.bhanu.task3;
import java.util.HashSet;
import java.util.Set;

public  class JuiceImp implements JuiceInterface{
		Set<Juice> JuiceSet=null;
		public JuiceImp() {
			JuiceSet=new HashSet<Juice>();
		}                              

		public void searchByJuiceName(String JuiceName) {
			boolean b=false;
			if(JuiceSet.size()>0 && JuiceSet!=null){
				for(Juice juice:JuiceSet){
					if(juice.getJn().equals(JuiceName)){
						System.out.println(juice.getJn()+" "+juice.getJuiceName()+" "+juice.getJuiceprice());	
						b=true;
						break;	
					}
				}
			}
			if(!b)
				System.out.println("The book is not found");
				
		}

		@Override
		public void  getAllJuices() {
				if(JuiceSet.size()>0){
					for(Juice juice:JuiceSet){
						System.out.println(juice.getJn()+" "+juice.getJuiceName()+" "+juice.getJuiceName());
					}
						
				}else{
					System.out.println("No books are available");
				}
}

		public String addJuice(Juice b) {
			JuiceSet.add(b);
			return b.getJn();
			
		}

		
		}