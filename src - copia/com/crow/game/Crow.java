package com.crow.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.crow.states.StateManager;
import com.crow.util.FontManager;
import com.crow.util.ResourcesManager;

public class Crow extends ApplicationAdapter {
	SpriteBatch batch;
	OrthographicCamera camera;
	
	
	@Override
	public void create () {
		ResourcesManager.init();
		StateManager.init();
		FontManager.init();
		batch = new SpriteBatch();
		camera = new OrthographicCamera(800,800);
		
	}

	@Override
	public void render () {
		StateManager.update(camera);
		camera.update();
		StateManager.render(batch, camera);
		
		
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
