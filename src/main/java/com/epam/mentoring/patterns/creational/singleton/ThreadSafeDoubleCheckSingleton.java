package com.epam.mentoring.patterns.creational.singleton;

public class ThreadSafeDoubleCheckSingleton implements Singleton {

	private static volatile ThreadSafeDoubleCheckSingleton instance;

	private ThreadSafeDoubleCheckSingleton() {
	}

	public static synchronized ThreadSafeDoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeDoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
