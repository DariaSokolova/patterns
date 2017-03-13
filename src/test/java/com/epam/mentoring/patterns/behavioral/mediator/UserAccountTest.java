package com.epam.mentoring.patterns.behavioral.mediator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserAccountTest {

	@Test
	public void testSendMessage() {
		String name = "Kevin";
		String message = "Hello!";
		UserAccount user = new UserAccount(name);

		String sentMessage = user.sendMessage(message);
		
		assertEquals(user.getName() + ": " + message, sentMessage);
	}
}
