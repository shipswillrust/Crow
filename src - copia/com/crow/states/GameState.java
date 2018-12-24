package com.crow.states;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.crow.entity.PlayerCharacter;
import com.crow.util.FontManager;
import com.crow.world.World;

public class GameState extends State {

	private static final float CAMERA_SPEED = 2f;
	public ArrayList<PlayerCharacter> wizards;
	@Override
	public void init() {
		World.init();
		wizards = new ArrayList<PlayerCharacter>();
		PlayerCharacter c = new PlayerCharacter(1,1);
		wizards.add(c);
		
	}
	
	@Override
	public void update(OrthographicCamera c) {
		if(Gdx.input.isKeyPressed(Input.Keys.A)){
			c.translate(new Vector2(-CAMERA_SPEED,0));
		}
		if(Gdx.input.isKeyPressed(Input.Keys.D)){
			c.translate(new Vector2(CAMERA_SPEED,0));
		}
		if(Gdx.input.isKeyPressed(Input.Keys.W)){
			c.translate(new Vector2(0,CAMERA_SPEED));
		}
		if(Gdx.input.isKeyPressed(Input.Keys.S)){
			c.translate(new Vector2(0,-CAMERA_SPEED));
		}
	}

	@Override
	public void render(SpriteBatch b, OrthographicCamera c) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		b.setProjectionMatrix(c.combined);
		b.begin();
		World.draw(b, c);
		for(PlayerCharacter w :wizards){
			w.draw(b, c);
			FontManager.drawTextScreen(200,200, "dick", 1, b,c);
		}
		
		b.end();
		
	}

	

}
