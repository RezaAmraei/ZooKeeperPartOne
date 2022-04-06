package com.codingdojo.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GORILLA TEST
		Gorilla gorilla1 = new Gorilla();
		System.out.println(gorilla1.displayEnergy());
		gorilla1.climb();
		System.out.println(gorilla1.displayEnergy());
		gorilla1.eatBananas();
		System.out.println(gorilla1.displayEnergy());
		gorilla1.eatBananas();
		System.out.println(gorilla1.displayEnergy());
		gorilla1.throwSomething();
		System.out.println(gorilla1.displayEnergy());
		
		//BAT1 TEST
		Bat bat1 = new Bat();
		System.out.println(bat1.displayEnergy());
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		System.out.println(bat1.displayEnergy());
		bat1.eatHumans();
		bat1.eatHumans();
		System.out.println(bat1.displayEnergy());
		bat1.fly();
		bat1.fly();
		System.out.println(bat1.displayEnergy());
		
	}

}
