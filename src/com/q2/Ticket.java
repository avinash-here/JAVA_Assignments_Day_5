package com.q2;

public class Ticket {
	
	private int ticketID;
	private int price;
	private static int availableTickets;
	
	public int getTicketID() {
		return ticketID;
	}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if (availableTickets >= 0)
			Ticket.availableTickets = availableTickets;
		else
			System.out.println("Available Tickets can't be negative");			
	}
	
	public int calculateTicketCost(int noOfTickets) {
		if(availableTickets >= noOfTickets) {
			Ticket.availableTickets = Ticket.availableTickets-noOfTickets;
			return price*noOfTickets;
		}			
		else 
			return -1;
	}
	

}
