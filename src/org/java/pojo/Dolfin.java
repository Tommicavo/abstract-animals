package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.inter.Swimming;

public class Dolfin extends Animal implements Swimming {
	
	private static final String SPECIE = "Dolfin";

	public Dolfin(String name) {
		super(name);
	}
		
	@Override
	public String printSpecie() {
		return "I am a " + SPECIE;
	}

	@Override
	public void eat() {
		System.out.println("I eat fishes");
	}

	@Override
	public void sound() {
		System.out.println("I click");
	}
	
	@Override
	public void performSwim() {
		System.out.println("I am swimming!!!");
	}
	
	@Override
	public String toString() {
		return super.toString() + printSpecie();
	}
}
