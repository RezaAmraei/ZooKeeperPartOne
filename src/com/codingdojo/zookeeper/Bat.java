package com.codingdojo.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		// TODO Auto-generated constructor stub
		super();
		this.energyLevel = 300;
	}
	public void fly() {
		System.out.println("Swooooosh");
		this.energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Oh no, bat ate a human");
		this.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("*Fire noises and people screaming*");
		this.energyLevel -= 100;
}
}
