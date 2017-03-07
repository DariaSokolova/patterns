package com.epam.mentoring.patterns.creational.abstractfactory;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EventTest {

	@Test
	public void testCreateTicket_MovieFactory() {
		EventFactory factory = new MovieFactory();
		
		Event event = new Event(factory);
		
		Ticket ticket = event.createTicket();
		
		assertThat(ticket, instanceOf(MovieTicket.class));
	}
	
	@Test
	public void testCreateVenue_MovieFactory() {
		EventFactory factory = new MovieFactory();
		
		Event event = new Event(factory);
		
		Venue venue = event.createVenue();

		assertThat(venue, instanceOf(Cinema.class));
	}
	
	@Test
	public void testCreateTicket_TheatreFactory() {
		EventFactory factory = new TheatreFactory();
		
		Event event = new Event(factory);
		
		Ticket ticket = event.createTicket();
		
		assertThat(ticket, instanceOf(TheatreTicket.class));
	}
	
	@Test
	public void testCreateVenue_TheatreFactory() {
		EventFactory factory = new TheatreFactory();
		
		Event event = new Event(factory);
		
		Venue venue = event.createVenue();
		
		assertThat(venue, instanceOf(Theatre.class));
	}
}
