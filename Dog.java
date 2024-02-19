package edu.monmouth.Animals;

public class Dog implements Animal{
	private String furcolor;

	public String getFurcolor() {
		return furcolor;
	}

	public void setFurcolor(String furcolor) {
		this.furcolor = furcolor;
	}
	
	@Override
	public void move() {
		System.out.println("The dog moves its legs to walk");
	}
	
	@Override
	public void makesound() {
		System.out.println("The dog barks");
	}

	@Override
	public String toString() {
		return "Dog [furcolor=" + furcolor + "]";
	}
	
	
	

}
