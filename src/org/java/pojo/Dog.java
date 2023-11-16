package org.java.pojo;

import org.java.pojo.abs.Animal;

public class Dog extends Animal {

	private static final String SPECIE = "Dog";
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public String printSpecie() {
		return "I am a " + SPECIE;
	}

	@Override
	public void eat() {
		System.out.println("I eat cruncy food");
	}

	@Override
	public void sound() {
		System.out.println("I bark");
	}
	
	@Override
	public String toString() {
		return super.toString() + printSpecie();
	}
}
