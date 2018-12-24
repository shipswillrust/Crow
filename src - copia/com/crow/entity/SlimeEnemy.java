package com.crow.entity;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.crow.util.ResourcesManager;
import com.crow.world.Room;

public class SlimeEnemy extends Character {

	public SlimeEnemy(int x, int y){
		this.x = x;
		this.y = y;
		this.health = 3;
		this.maxHealth = 3;
		this.isEnemy = true;
		this.texture = ResourcesManager.getSprite(4);
		
		
	}
	@Override
	public void draw(SpriteBatch b, OrthographicCamera c) {
		b.draw(texture, x*Room.TILE_SIZE, y*Room.TILE_SIZE, Room.TILE_SIZE, Room.TILE_SIZE);


	}

}
