package com.crow.world;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.crow.entity.Entity;
import com.crow.util.ResourcesManager;

public class Room {

	public int[][] layout;
	public ArrayList<Entity>entities;
	public static int TILE_SIZE = 32;
	public Room (int[][]layout, ArrayList<Entity>entities){
		this.layout = layout;
		this.entities = entities;
	}
	
	public void draw(SpriteBatch b, OrthographicCamera c){
		for(int x = 0; x<layout.length;x++){
			for(int y = 0; y< layout[0].length;y++){
				b.draw(ResourcesManager.getSprite(layout[x][y]), x*TILE_SIZE, y*TILE_SIZE,TILE_SIZE,TILE_SIZE);
			}
		}
	}
}
