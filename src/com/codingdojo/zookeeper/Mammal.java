package com.codingdojo.zookeeper;

public class Mammal {
	protected int energyLevel;

	public Mammal() {
		this.energyLevel = 100;
	}
	public int displayEnergy() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
