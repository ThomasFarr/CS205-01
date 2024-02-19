package edu.monmouth.Animals;

public class Fish implements Animal{
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void move() {
		System.out.println("The fish flaps its fins to move");
	}
	
	@Override
	public void makesound() {
		System.out.println("The fish makes a blubb noise");
	}

	@Override
	public String toString() {
		return "Fish [color=" + color + "]";
	}
	
	
	
	
	
	

}
