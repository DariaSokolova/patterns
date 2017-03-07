package com.epam.mentoring.patterns.creational.abstractfactory;

public class MovieFactory implements EventFactory {

	public Ticket createTicket() {
		return new MovieTicket();
	}

	public Venue createVenue() {
		return new Cinema();
	}

}
