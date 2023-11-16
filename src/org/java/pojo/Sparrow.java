package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.inter.Flying;

public class Sparrow extends Animal implements Flying {

	private static final String SPECIE = "Sparrow";
	
	public Sparrow(String name) {
		super(name);
	}
		
	@Override
	public String printSpecie() {
		return "I am a " + SPECIE;
	}

	@Override
	public void eat() {
		System.out.println("I eat worms");
	}

	@Override
	public void sound() {
		System.out.println("I chirp");
	}
	
	@Override
	public void performFlight() {
		System.out.println("I am flying!!!");
	}
	
	@Override
	public String toString() {
		return super.toString() + printSpecie();
	}
}
