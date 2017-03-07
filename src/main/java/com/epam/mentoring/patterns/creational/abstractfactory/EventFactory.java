package com.epam.mentoring.patterns.creational.abstractfactory;

public interface EventFactory {
	public Ticket createTicket();
	public Venue createVenue();
}
