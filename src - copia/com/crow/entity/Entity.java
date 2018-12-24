package com.crow.entity;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public abstract class Entity {
	public int x, y;
	protected TextureRegion texture;
	public abstract String getType();
	public abstract void draw(SpriteBatch b, OrthographicCamera c);
	
}
