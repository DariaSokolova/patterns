package com.epam.mentoring.patterns.creational.singleton;

public class EagerSingleton implements Singleton {
	
	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}
