package com.crow.world;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.crow.entity.Entity;
import com.crow.entity.SlimeEnemy;

public class World {
	private static ArrayList<Room> rooms;
	private static Room currentRoom;
	
	public static void init(){
		rooms = new ArrayList<Room>();
		int[][]k ={{1,1,1,0},{0,0,0,0},{0,1,1,1}};
		ArrayList<Entity> e = new ArrayList<Entity>();
		e.add(new SlimeEnemy(0,3));
		rooms.add(new Room(k,e));
		currentRoom = rooms.get(0);
	}
	
	public static void draw(SpriteBatch b, OrthographicCamera c){
		currentRoom.draw(b, c);
		for(Entity w : currentRoom.entities){
			w.draw(b, c);
		}
	}
	
}
