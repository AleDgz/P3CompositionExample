package org.P3CompositionExample;

public class Bedroom {
	
	private String name;
	
	//objects
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	private Celling celling;
	private Bed bed;
	private Lamp lamp;
	
	//constructor
	public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Celling celling, Bed bed, Lamp lamp) {
		super();
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.celling = celling;
		this.bed = bed;
		this.lamp = lamp;
	}

	public Lamp getLamp () {
		return  this.lamp;
	}
	
	public void makeBed() {
		System.out.println("Bedroom -> making bed");
		bed.make();
	}
}
