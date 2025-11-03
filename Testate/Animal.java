package streams.Testate;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Animal {
	private int legs;

	public Animal(int legs) {
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}
	public void walk() {
		System.out.println(
			String.format("Animal with %d legs is walking now...",legs)
		);
	}
	
	
	
	@Override
	public String toString() {
		return "Animal [legs=" + legs + "]";
	}

	public abstract void eat(); // abstract method
	
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		// Katzen hinzufügen
        animals.add(new Cat("Tom"));
        animals.add(new Cat("Tom"));
        animals.add(new Cat("Whiskers"));
        animals.add(new Cat("Mittens"));
        animals.add(new Cat("Felix"));

        // Fische hinzufügen
        animals.add(new Fish("Nemo"));
        animals.add(new Fish("Dory"));
        animals.add(new Fish("Bubbles"));
        animals.add(new Fish("Goldie"));
        animals.add(new Fish("Splash"));
        
        // Spinnen hinzufügen
        animals.add(new Spider());
        animals.add(new Spider());
        
   
	}
}

abstract interface Pet {
	abstract void setName(String name);

	public String getName();

	abstract public void play();

	static void playIfPet(Animal animal) {
		if (animal instanceof Pet)
			((Pet) animal).play();
	}
}


class Cat extends Animal implements Pet {
	private String name;

	public Cat() {
		this("Garfield");
	}

	public Cat(String name) {
		super(4);
		this.name = name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void play() {
		System.out.println(String.format("%s is playing now...", name));
	}

	@Override
	public void eat() {
		System.out.println(String.format("%s is eating now...", name));
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
	

}


class Fish extends Animal implements Pet {
	private String name;
	
	public Fish(String name) {
		super(0);
		this.name = name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void play() {
		System.out.println(String.format("%s is playing now...", name));
	}

	@Override
	public void eat() {
		System.out.println(String.format("%s is eating now...", name));
	}

	@Override
	public void walk() {
		System.out.println(String.format("%s is swimming now...", name));
	}

	@Override
	public String toString() {
		return "Fish [name=" + name + "]";
	}
	
}

class Spider extends Animal {

	public Spider() {
		super(8);
	}

	@Override
	public void eat() {
		System.out.println("Spider is eating now...");
	}

	@Override
	public String toString() {
		return "Spider [=" + getLegs() + ", toString()=" + super.toString()+ "]";
	}
	
}
