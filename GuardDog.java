package edu.monmouth.Animals;

public class GuardDog extends Dog{
	
	private short meanness;

	public short getMeanness() {
		return meanness;
	}

	public void setMeanness(short meanness) {
		this.meanness = meanness;
	}

	@Override
	public String toString() {
		return "GuardDog [meanness=" + meanness + "]";
	}
	
	

}
