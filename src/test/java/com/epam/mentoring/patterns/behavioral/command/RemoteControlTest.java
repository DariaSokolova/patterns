package com.epam.mentoring.patterns.behavioral.command;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RemoteControlTest {
	private RemoteControl control = new RemoteControl();
	private Light light = new Light();
	
	@Test
	public void testPressButton_LightOn() {
	    Command lightsOn = new LightOnCommand(light);
	    control.setCommand(lightsOn);
	    
	    control.pressButton();
	    
	    assertTrue(light.isOn());
	}
	
	@Test
	public void testPressButton_LightOff() {
	    Command lightsOff = new LightOffCommand(light);
	    control.setCommand(lightsOff);
	    
	    control.pressButton();
	    
	    assertFalse(light.isOn());
	}
}
