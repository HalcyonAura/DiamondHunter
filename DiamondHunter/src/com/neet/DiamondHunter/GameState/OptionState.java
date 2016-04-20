package com.neet.DiamondHunter.GameState;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.image.BufferedImage;
import com.neet.DiamondHunter.Manager.Content;
import com.neet.DiamondHunter.Manager.GameStateManager;
import com.neet.DiamondHunter.Manager.JukeBox;
import com.neet.DiamondHunter.Manager.Keys;

public class OptionState extends GameState {
	private BufferedImage bg;
	public OptionState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {
		bg = Content.MENUBG[0][0];
	}
	
	public void update() {
		handleInput();
	}
	
	public void draw(Graphics2D g) {
		g.drawImage(bg, 0, 0, null);
		g.setColor(new Color(164,198,222));
		g.fillRect(0, 0, 130, 145);
		Content.drawString(g, "help", 45, 0);
		//'use axe to chop dead trees'
		//'use boat to cross water'
		//'use key to open door'
		//'use chainsaw with gasoline to chop trees'
		Content.drawString(g, "arrow keys:move", 2, 10);
		Content.drawString(g, "WASD:move", 2, 20);
		/*
		Content.drawString(g, "space:axe", 2, 30);
		Content.drawString(g, "key", 50, 40);
		Content.drawString(g, "chainsaw", 50, 50);
		
		Content.drawString(g, "F1:return to", 2, 60);
		Content.drawString(g, "menu", 26, 70);
		Content.drawString(g, "esc:pause game", 2, 80);
		Content.drawString(g, ":find all 15", 2, 90);
		Content.drawString(g, " diamonds", 2, 100);
		Content.drawString(g, ":find the boat", 2, 110);
		Content.drawString(g, " to cross water", 2, 120);
		*/
		Content.drawString(g, "space:use tool", 2, 30);
		Content.drawString(g, ":axe cuts stump", 2, 40);
		Content.drawString(g, ":key opens door", 2, 50);
		Content.drawString(g, "esc:pause game", 2, 60);
		Content.drawString(g, ":find all 15", 2, 70);
		Content.drawString(g, " diamonds", 2, 80);
		Content.drawString(g, ":find the boat", 2, 90);
		Content.drawString(g, " to cross water", 2, 100);
		Content.drawString(g, ":chainsaw uses", 2, 110);
		Content.drawString(g, " gasoline", 2, 120);
		Content.drawString(g, "f1: main menu", 2, 130);
	}
	public void handleInput() {
		if(Keys.isPressed(Keys.F1)) {
			gsm.setState(GameStateManager.MENU);
		}
	}
	
}
