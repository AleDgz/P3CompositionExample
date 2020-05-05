package org.P3CompositionExample;

public class Lamp {

	private String style;
	private boolean battery;
	private int globRating;
	
	
	public Lamp(String style, boolean battery, int globRating) {
		super();
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}


	public void turnOn() {
		System.out.println("Lamp -> turn On");
	}
	public String getStyle() {
		return style;
	}


	public boolean isBattery() {
		return battery;
	}


	public int getGlobRating() {
		return globRating;
	}
	
	
}