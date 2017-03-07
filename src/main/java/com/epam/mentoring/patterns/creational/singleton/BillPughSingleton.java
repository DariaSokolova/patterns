package com.epam.mentoring.patterns.creational.singleton;

public class BillPughSingleton implements Singleton {
	
	private BillPughSingleton() {
	}

	private static class SingletonCreator {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonCreator.INSTANCE;
	}
}
