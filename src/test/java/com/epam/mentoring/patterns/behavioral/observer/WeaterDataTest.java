package com.epam.mentoring.patterns.behavioral.observer;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WeaterDataTest {
	WeatherData weatherData = new WeatherData();

	@Test
	public void testGetData() {
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        float temperature = 4f;
        float humidity = 70f;
        int pressure = 512;
        
        weatherData.setMeasurements(temperature, humidity, pressure);
        
        String data = currentDisplay.getData();
        
        assertTrue(data.contains(temperature + ""));
        assertTrue(data.contains(humidity + ""));
        assertTrue(data.contains(pressure + ""));
        
        temperature = 5f;
        humidity = 74f;
        pressure = 522;
        
        weatherData.setMeasurements(temperature, humidity, pressure);
        
        data = currentDisplay.getData();
        
        assertTrue(data.contains(temperature + ""));
        assertTrue(data.contains(humidity + ""));
        assertTrue(data.contains(pressure + ""));
	}
}
