package edu.monmouth.Animals;

import java.util.Arrays;

public class AnimalMain {

	public static void main(String[] args) {
		final int SIZE = 5;
		Animal[] animals = new Animal[SIZE];
		
		Dog dog = new Dog();
		dog.setFurcolor("Golden");
		animals[0] = dog;
		
		Fish fish = new Fish();
		fish.setColor("Red");
		animals[1] = fish;
		
		GuardDog guarddog = new GuardDog();
		guarddog.setFurcolor("Black");
		guarddog.setMeanness((short) 3);
		animals[2] = guarddog;
		
		ShowDog showdog = new ShowDog();
		showdog.setFurcolor("Grey");
		showdog.setBreed("Golden Retriever");
		animals[3] = showdog;
		
		Dog dog2 = new Dog();
		dog2.setFurcolor("White");
		animals[4] = dog2;
		
		// For Loop
		System.out.println("For Loop: ");
		for(int i=0; i<SIZE; i++) {
			System.out.println(animals[i].toString());
			animals[i].move();
			animals[i].makesound();
			System.out.println("");
		}
		System.out.println("------------------");
		
		// Foreach Loop
		System.out.println("Foreach Loop: ");
		for(Animal animal : animals) {
			System.out.println(animal.toString());
			animal.move();
			animal.makesound();
			System.out.println("");
		}
		System.out.println("------------------");
		
		// While Loop
		System.out.println("While Loop: ");
		int index = 0;
		while (index < SIZE) {
			System.out.println(animals[index].toString());
			animals[index].move();
			animals[index].makesound();
			index++;
			System.out.println("");
		}
		System.out.println("------------------");
		
		// Arrays.toString()
		System.out.println("Every Animal in animals array: ");
		System.out.println(Arrays.toString(animals));
		System.out.println("------------------");
		
		
		// Copy first three elements to new array
		Animal[] copyArray = Arrays.copyOf(animals, 3);
		
		// Animals in copied array
		System.out.println("Animals in copied array");
		for (Animal animal : copyArray) {
			System.out.println(animal.toString());
		}
		
		
		

	}

}
