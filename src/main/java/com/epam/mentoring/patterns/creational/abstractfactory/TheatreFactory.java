package com.epam.mentoring.patterns.creational.abstractfactory;

public class TheatreFactory implements EventFactory  {

	public Ticket createTicket() {
		return new TheatreTicket();	
	}

	public Venue createVenue() {
		return new Theatre();
	}

}
