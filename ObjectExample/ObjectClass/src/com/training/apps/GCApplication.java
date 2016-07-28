package com.training.apps;

import com.training.domains.Book;

public class GCApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Book bk = new Book(101,"A","B",20.00);
			

			 System.out.println(bk.hashCode());
			
			  bk = new Book(102,"P","Q",450.00);
			  
			 
			 System.gc();
			 
			 
			 System.out.println(bk);
			 System.out.println(bk.hashCode());
			 
			 
			 System.out.println("Look At the Console For a Special Message");
			 
			 
			 System.out.println("Bye....");
			 

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		 

	}

}
