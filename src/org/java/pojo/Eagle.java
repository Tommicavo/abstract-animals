package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.inter.Flying;

public class Eagle extends Animal implements Flying {

	private static final String SPECIE = "Eagle";
	
	public Eagle(String name) {
		super(name);
	}
		
	@Override
	public String printSpecie() {
		return "I am an " + SPECIE ;
	}

	@Override
	public void eat() {
		System.out.println("I eat other birds");
	}

	@Override
	public void sound() {
		System.out.println("I screech");
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
