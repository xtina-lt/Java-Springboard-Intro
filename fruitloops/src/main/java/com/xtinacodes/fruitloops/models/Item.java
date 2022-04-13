package com.xtinacodes.fruitloops.models;

public class Item {
	private String name;
	private double price;
	
	public Item(String n, double p) {
		this.name = n;
		this.price = p;
	}
	
	// accessors
	public String getName() { return name; }
	public double getPrice() {return price;}
	
	// mutators
	public void setName(String e) {
		this.name = e;
	}
	
	public void setPrice(double e) {
		this.price = e;
	}
}
