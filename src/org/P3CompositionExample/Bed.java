package org.P3CompositionExample;

public class Bed {
	
	//field
	private String style;
	private int pillows;
	private int heigh;
	private int sheets;
	private int quilts;
	
	
	
	public void make() {
		System.out.println("Bed -> Making");
	}
	public Bed(String style, int pillows, int heigh, int sheets, int quilts) {
		super();
		this.style = style;
		this.pillows = pillows;
		this.heigh = heigh;
		this.sheets = sheets;
		this.quilts = quilts;
	}


	public String getStyle() {
		return style;
	}


	public int getHeigh() {
		return heigh;
	}


	public int getSheets() {
		return sheets;
	}


	public int getQuilts() {
		return quilts;
	}
	
	

}
