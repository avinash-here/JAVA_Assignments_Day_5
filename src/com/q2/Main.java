package com.q2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of Bookings");
		int nob = sc.nextInt();
		System.out.println("Enter the Available Tickets");
		int avltckts = sc.nextInt();		
		
		Ticket t1 = new Ticket();
		t1.setAvailableTickets(avltckts);
		
		for (int i = 0; i < nob; i++) {
			System.out.println("Enter the TicketID");
			int tktid = sc.nextInt();
			t1.setTicketID(tktid);
			
			System.out.println("Enter the price");
			int prc = sc.nextInt();
			t1.setPrice(prc);
			
			System.out.println("Enter the no of Tickets");
			int not = sc.nextInt();
			
			
			System.out.println("Available Tickets : "+ t1.getAvailableTickets());		
			int total = t1.calculateTicketCost(not);
			System.out.println("Total amount : "+ total);
			System.out.println("Available Tickets after Booking : "+ t1.getAvailableTickets());
		}
		
		
		
	
	
	}

}
