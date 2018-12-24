package com.crow.entity;

public abstract class Character extends Entity {

	public int health, maxHealth, energy, maxEnergy;
	public boolean isEnemy;
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "character";
		
	}

	

}
