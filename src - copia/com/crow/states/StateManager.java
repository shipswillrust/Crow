package com.crow.states;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class StateManager {

	private static ArrayList<State>states;
	private static int currentState;
	
	public static void init(){
		states = new ArrayList<State>();
		states.add(new GameState());
		states.get(0).init();
	}
	public static void update(OrthographicCamera c){
		states.get(currentState).update(c);
	}
	
	public static void render(SpriteBatch b, OrthographicCamera c){
		
		states.get(currentState).render(b, c);
	}
	
	public static void setState(int s){
		currentState = s;
		states.get(currentState).init();
	}
	
}
