package com.crow.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class State {
	
	public abstract void init();
	public abstract void update(OrthographicCamera c);
	public abstract void render(SpriteBatch b, OrthographicCamera c);
	
	
}
