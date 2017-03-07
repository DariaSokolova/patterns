package com.epam.mentoring.patterns.creational.singleton;

public class LazySingleton implements Singleton {
	
	private static LazySingleton instance;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
