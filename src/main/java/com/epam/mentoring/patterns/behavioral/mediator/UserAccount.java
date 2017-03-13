package com.epam.mentoring.patterns.behavioral.mediator;

public class UserAccount {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserAccount(String name) {
		this.name = name;
	}

	public String sendMessage(String message) {
		return ChatRoom.showMessage(this, message);
	}
}
