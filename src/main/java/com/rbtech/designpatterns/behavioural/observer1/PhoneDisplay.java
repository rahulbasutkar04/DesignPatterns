package com.rbtech.designpatterns.behavioural.observer1;

public class PhoneDisplay implements Observer {
	private String weather;

	@Override
	public void update(String weather) {
		this.weather = weather;
		display();
	}

	private void display() {
		System.out.println("Phone Display: Weather updated - " + weather);
	}
}
