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
		Content.drawString(g, "arrow", 12, 76);
		Content.drawString(g, "keys", 16, 84);
		Content.drawString(g, ": move", 52, 80);
		
		Content.drawString(g, "space", 12, 96);
		Content.drawString(g, ": action", 52, 96);
		
		Content.drawString(g, "F1:", 36, 112);
		Content.drawString(g, "return", 68, 108);
		Content.drawString(g, "to menu", 68, 116);
		
	}
	public void handleInput() {
		if(Keys.isPressed(Keys.F1)) {
			gsm.setState(GameStateManager.MENU);
		}
	}
	
}
