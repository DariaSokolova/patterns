package com.epam.mentoring.patterns.creational.abstractfactory;

public class Event {
	private EventFactory factory;
	
	public Event(EventFactory factory) {
		this.factory = factory;
	}
	
	public Ticket createTicket() {
		Ticket ticket =  factory.createTicket();
		return ticket;
	}
	
	public Venue createVenue() {
		Venue venue =  factory.createVenue();
		return venue;
	}
}
