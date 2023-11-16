package org.java;

import org.java.pojo.Dog;
import org.java.pojo.Dolfin;
import org.java.pojo.Eagle;
import org.java.pojo.Sparrow;
import org.java.pojo.abs.Animal;
import org.java.pojo.inter.Flying;
import org.java.pojo.inter.Swimming;

public class Main {
	
	public static void takeSwim(Swimming swimmingAnimal) {
		swimmingAnimal.performSwim();
	}
	
	public static void takeFlight(Flying flyingAnimal) {
		flyingAnimal.performFlight();
	}
	
	public static void main(String[] args) {
		
		Dog fuffy = new Dog("Fuffy");
		Eagle jhon = new Eagle("Jhon");
		Sparrow finn = new Sparrow("Finn");
		Dolfin klaus = new Dolfin("Klaus");
		
		Animal[] animals = new Animal[4];
		animals[0] = fuffy;
		animals[1] = jhon;
		animals[2] = finn;
		animals[3] = klaus;
		int animalLen = animals.length;
		
		for (int i = 0; i < animalLen; i++) {
			Animal animal = animals[i];
			System.out.println(animal);
			animal.sleep();
			animal.eat();
			animal.sound();
			System.out.println('\n');
		}
		
		// Perform actions
		takeFlight(jhon);
		takeFlight(finn);
		takeSwim(klaus);
	}
}
