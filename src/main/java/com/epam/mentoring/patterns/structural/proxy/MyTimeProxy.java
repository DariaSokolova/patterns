package com.epam.mentoring.patterns.structural.proxy;

public class MyTimeProxy implements MyTime {

	private MyTimeImpl mti;
	
	public boolean fillMyTime(boolean lazyFactor) {
		if (mti == null) {
			mti = new MyTimeImpl();
		}
		if (lazyFactor) {
			return false;
		}
		return mti.fillMyTime(lazyFactor);
	}
}
