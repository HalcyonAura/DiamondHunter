// The only subclass the fully utilizes the
// Entity superclass (no other class requires
// movement in a tile based map).
// Contains all the gameplay associated with
// the Player.

package com.neet.DiamondHunter.Entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.neet.DiamondHunter.Manager.Content;
import com.neet.DiamondHunter.Manager.JukeBox;
import com.neet.DiamondHunter.TileMap.TileMap;

public class Player extends Entity {
	
	// sprites
	private BufferedImage[] downSprites;
	private BufferedImage[] leftSprites;
	private BufferedImage[] rightSprites;
	private BufferedImage[] upSprites;
	private BufferedImage[] downBoatSprites;
	private BufferedImage[] leftBoatSprites;
	private BufferedImage[] rightBoatSprites;
	private BufferedImage[] upBoatSprites;
	
	// animation
	private final int DOWN = 0;
	private final int LEFT = 1;
	private final int RIGHT = 2;
	private final int UP = 3;
	private final int DOWNBOAT = 4;
	private final int LEFTBOAT = 5;
	private final int RIGHTBOAT = 6;
	private final int UPBOAT = 7;
	//private final int STOPPED = 8;
	private boolean stopped;
	// gameplay
	private int numDiamonds;
	private int totalDiamonds;
	private boolean hasBoat;
	private boolean hasAxe;
	private boolean hasSchlussel;
	private boolean hasChainsaw;
	private int gasoline;
	private boolean onWater;
	private long ticks;
	
	public Player(TileMap tm) {
		
		super(tm);
		
		stopped = false;
		
		width = 16;
		height = 16;
		cwidth = 12;
		cheight = 12;
		
		moveSpeed = 2;
		
		numDiamonds = 0;
		
		downSprites = Content.PLAYER[0];
		leftSprites = Content.PLAYER[1];
		rightSprites = Content.PLAYER[2];
		upSprites = Content.PLAYER[3];
		downBoatSprites = Content.PLAYER[4];
		leftBoatSprites = Content.PLAYER[5];
		rightBoatSprites = Content.PLAYER[6];
		upBoatSprites = Content.PLAYER[7];
		
		animation.setFrames(downSprites);
		animation.setDelay(10);
		
	}
	
	private void setAnimation(int i, BufferedImage[] bi, int d) {
		currentAnimation = i;
		animation.setFrames(bi);
		animation.setDelay(d);
	}
	
	public void collectedDiamond() { numDiamonds++; }
	public int numDiamonds() { return numDiamonds; }
	public int getTotalDiamonds() { return totalDiamonds; }
	public void setTotalDiamonds(int i) { totalDiamonds = i; }
	
	public void gotBoat() { hasBoat = true; tileMap.replace(22, 4); }
	public void gotAxe() { hasAxe = true; }
	public void gotSchlussel(){hasSchlussel = true;}
	public void gotChainsaw(){hasChainsaw = true;}
	public void gotGasoline(){gasoline += 3;}
	public boolean hasBoat() { return hasBoat; }
	public boolean hasAxe() { return hasAxe; }
	public boolean hasSchlussel(){return hasSchlussel;}
	public boolean hasChainsaw(){return hasChainsaw;}
	public boolean hasGasoline(){return gasoline >0;}
	// Used to update time.
	public long getTicks() { return ticks; }
	
	// Keyboard input. Moves the player.
	public void setDown() {
		super.setDown();
	}
	public void setLeft() {
		super.setLeft();
	}
	public void setRight() {
		super.setRight();
	}
	public void setUp() {
		super.setUp();
	}
	
	// Keyboard input.
	// If Player has axe, dead trees in front
	// of the Player will be chopped down.
	// If Player has key, doors in front 
	// of the player will be opened
	public void setAction() {
		if(hasAxe) {
			if(currentAnimation == UP && tileMap.getIndex(rowTile - 1, colTile) == 21) {
				tileMap.setTile(rowTile - 1, colTile, 1);
				JukeBox.play("tilechange");
			}
			if(currentAnimation == DOWN && tileMap.getIndex(rowTile + 1, colTile) == 21) {
				tileMap.setTile(rowTile + 1, colTile, 1);
				JukeBox.play("tilechange");
			}
			if(currentAnimation == LEFT && tileMap.getIndex(rowTile, colTile - 1) == 21) {
				tileMap.setTile(rowTile, colTile - 1, 1);
				JukeBox.play("tilechange");
			}
			if(currentAnimation == RIGHT && tileMap.getIndex(rowTile, colTile + 1) == 21) {
				tileMap.setTile(rowTile, colTile + 1, 1);
				JukeBox.play("tilechange");
			}
		}
		if(hasSchlussel) {
			if(currentAnimation == UP && tileMap.getIndex(rowTile - 1, colTile) == 23) {
				tileMap.setTile(rowTile - 1, colTile, 1);
				JukeBox.play("tilechange");
			}
			if(currentAnimation == DOWN && tileMap.getIndex(rowTile + 1, colTile) == 23) {
				tileMap.setTile(rowTile + 1, colTile, 1);
				JukeBox.play("tilechange");
			}
			if(currentAnimation == LEFT && tileMap.getIndex(rowTile, colTile - 1) == 23) {
				tileMap.setTile(rowTile, colTile - 1, 1);
				JukeBox.play("tilechange");
			}
			if(currentAnimation == RIGHT && tileMap.getIndex(rowTile, colTile + 1) == 23) {
				tileMap.setTile(rowTile, colTile + 1, 1);
				JukeBox.play("tilechange");
			}
		}
		if(hasChainsaw && gasoline >0) {
			if(currentAnimation == UP && (tileMap.getIndex(rowTile - 1, colTile) == 20 || 
					tileMap.getIndex(rowTile - 1, colTile) == 21 || 
					tileMap.getIndex(rowTile - 1, colTile) == 23)) {
				tileMap.setTile(rowTile - 1, colTile, 1);
				JukeBox.play("tilechange");
				gasoline--;
			}
			if(currentAnimation == DOWN && (tileMap.getIndex(rowTile + 1, colTile) == 20 || 
					tileMap.getIndex(rowTile + 1, colTile) == 21 ||
					tileMap.getIndex(rowTile + 1, colTile) == 23)) {
				tileMap.setTile(rowTile + 1, colTile, 1);
				JukeBox.play("tilechange");
				gasoline--;
			}
			if(currentAnimation == LEFT && (tileMap.getIndex(rowTile, colTile - 1) == 20 ||
					tileMap.getIndex(rowTile, colTile - 1) == 21 ||
					tileMap.getIndex(rowTile, colTile - 1) == 23)) {
				tileMap.setTile(rowTile, colTile - 1, 1);
				JukeBox.play("tilechange");
				gasoline--;
			}
			if(currentAnimation == RIGHT && (tileMap.getIndex(rowTile, colTile + 1) == 20 ||
					tileMap.getIndex(rowTile, colTile + 1) == 21 ||
					tileMap.getIndex(rowTile, colTile + 1) == 23)) {
				tileMap.setTile(rowTile, colTile + 1, 1);
				JukeBox.play("tilechange");
				gasoline--;
			}
		}
	}
	
	public void update() {
		
		ticks++;
		
		// check if on water
		boolean current = onWater;
		if(tileMap.getIndex(ydest / tileSize, xdest / tileSize) == 4) {
			onWater = true;
		}
		else {
			onWater = false;
		}
		// if going from land to water
		if(!current && onWater) {
			JukeBox.play("splash");
		}
		
		// set animation
		if(down) {
			if(onWater && currentAnimation != DOWNBOAT) {
				setAnimation(DOWNBOAT, downBoatSprites, 10);
			}
			else if(!onWater && currentAnimation != DOWN) {
				setAnimation(DOWN, downSprites, 10);
			}
			stopped = false;
			
		}
		if(left) {
			if(onWater && currentAnimation != LEFTBOAT) {
				setAnimation(LEFTBOAT, leftBoatSprites, 10);
			}
			else if(!onWater && currentAnimation != LEFT) {
				setAnimation(LEFT, leftSprites, 10);
			}
			stopped = false;
		}
		if(right) {
			if(onWater && currentAnimation != RIGHTBOAT) {
				setAnimation(RIGHTBOAT, rightBoatSprites, 10);
			}
			else if(!onWater && currentAnimation != RIGHT) {
				setAnimation(RIGHT, rightSprites, 10);
			}
			stopped = false;
		}
		if(up) {
			if(onWater && currentAnimation != UPBOAT) {
				setAnimation(UPBOAT, upBoatSprites, 10);
			}
			else if(!onWater && currentAnimation != UP) {
				setAnimation(UP, upSprites, 10);
			}
			stopped = false;
		}
		//stop animation if you're stopped and not on water after one full animation
		if(!onWater && !moving && !stopped && animation.hasPlayedOnce()){
			setAnimation(currentAnimation, new BufferedImage[]{this.animation.getImage()},1000000);
			stopped = true;
		}
		// update position
		super.update();
		
	}
	
	// Draw Player.
	public void draw(Graphics2D g) {
		super.draw(g);
	}
	
}