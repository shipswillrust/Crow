package com.crow.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;

public class FontManager {

	private static BitmapFont font1,font2,font3;
	public static void init(){
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("ariali.ttf"));
		FreeTypeFontParameter parameter = new FreeTypeFontParameter();
		parameter.size = 24;
		font2 = generator.generateFont(parameter); // font size 12 pixels
		parameter.size = 48;
		font3 = generator.generateFont(parameter); // font size 12 pixels
		parameter.size = 16;
		font1 = generator.generateFont(parameter); // font size 12 pixels
		generator.dispose();
	}
	public static void drawTextWorld(int x, int y, String text, int size, SpriteBatch b){
		switch(size){
		case 1:font1.draw(b, text, x, y);break;
		case 2:font2.draw(b, text, x, y);break;
		case 3: font3.draw(b, text, x, y);break;
		}
		
	}
	public static void drawTextScreen(int x, int y, String text, int size, SpriteBatch b, OrthographicCamera c){
		switch(size){
		case 1:font1.draw(b, text, x+c.position.x-c.viewportWidth/2, y+c.position.y-c.viewportHeight/2+20);break;
		case 2:font2.draw(b, text, x+c.position.x-c.viewportWidth/2, y+c.position.y-c.viewportHeight/2+30);break;
		case 3: font3.draw(b, text, x+c.position.x-c.viewportWidth/2, y+c.position.y-c.viewportHeight/2+40);break;
		}
	}
}
