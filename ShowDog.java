package edu.monmouth.Animals;

public class ShowDog extends Dog{
	
	private String breed;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "ShowDog [breed=" + breed + "]";
	}
	
	

}
