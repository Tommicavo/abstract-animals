package org.java.pojo.abs;

public abstract class Animal {
	
	private String name;
	
	public Animal(String name) {
		setName(name);
	}
	
	public abstract String printSpecie();
	public abstract void eat();
	public abstract void sound();
			
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sleep() {
		System.out.println("I sleep: Zzz...");
	}
	
	@Override
	public String toString() {
		return "My name is " + getName() + " and ";
	}
}
