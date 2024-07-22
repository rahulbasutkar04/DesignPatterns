package com.rbtech.designpatterns.behavioural.observer1;

public class WeatherApp {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();

		Observer phoneDisplay = new PhoneDisplay();
		Observer tvDisplay = new TvDisplay();

		weatherStation.addObserver(phoneDisplay);
		weatherStation.addObserver(tvDisplay);

		// Simulating weather change
		weatherStation.setWeather("Sunny");
		weatherStation.setWeather("Rainy");

		// Output:
		// Phone Display: Weather updated - Sunny
		// TV Display: Weather updated - Sunny
	}
}
