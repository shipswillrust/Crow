package com.crow.skills;

public class Skills {

	public static final int FIREBALL_SKILL_ID = 0;
	public static final int SOLOHEAL_SKILL_ID = 1;
	
	public static String getName(int id){
		switch(id){
		case FIREBALL_SKILL_ID: return "Fireball";
		case SOLOHEAL_SKILL_ID: return "Fireball";
		}
		return "ERROR";
	}
	public static String getDescription(int id){
		switch(id){
		case FIREBALL_SKILL_ID: return "Fireball at the target location dealing damage to enemies";
		case SOLOHEAL_SKILL_ID: return "Heals the caster";
		}
		return "ERROR";
	}
}
