package com.crow.util;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ResourcesManager {

	private static ArrayList<TextureRegion> sprites;
	
	public static void init(){
		sprites = new ArrayList<TextureRegion>();
		Texture atlas = new Texture("tiles.png");
		sprites.add(new TextureRegion(atlas,0,0,8,8));
		sprites.add(new TextureRegion(atlas,8,0,8,8));
		sprites.add(new TextureRegion(atlas,16,0,8,8));
		sprites.add(new TextureRegion(atlas,24,0,8,8));
		sprites.add(new TextureRegion(atlas,32,0,8,8));
	}
	
	public static TextureRegion getSprite(int id){
		return sprites.get(id);
	}
}
