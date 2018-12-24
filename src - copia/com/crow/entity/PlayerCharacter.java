package com.crow.entity;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.crow.util.ResourcesManager;
import com.crow.world.Room;

public class PlayerCharacter extends Character {

	public int level;
	public ArrayList<Integer>skills;
	public PlayerCharacter(int x, int y){
		this.x = x;
		this.y = y;
		this.health = 10;
		this.maxHealth = 10;
		this.isEnemy = false;
		this.texture = ResourcesManager.getSprite(3);
		
		
	}

	@Override
	public void draw(SpriteBatch b, OrthographicCamera c) {
		b.draw(texture, x*Room.TILE_SIZE, y*Room.TILE_SIZE, Room.TILE_SIZE, Room.TILE_SIZE);
		
	}
	

}
