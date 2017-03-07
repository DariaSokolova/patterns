package com.epam.mentoring.patterns.creational.singleton;

public class StaticBlockSingleton implements Singleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
	}

	static {
		instance = new StaticBlockSingleton();
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
