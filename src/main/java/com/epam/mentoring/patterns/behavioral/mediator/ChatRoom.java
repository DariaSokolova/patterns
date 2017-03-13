package com.epam.mentoring.patterns.behavioral.mediator;

public class ChatRoom {
	public static String showMessage(UserAccount account, String message) {
		return account.getName() + ": " + message;
	}
}
