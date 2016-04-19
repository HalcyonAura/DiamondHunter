package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.neet.DiamondHunter.Main.GamePanel;

public class window {
	//the variables initialize properly, but need to test actual window object size
	//haven't figured that part out yet
	
	@Test
	public void testHeight() {
		assertEquals(128, GamePanel.HEIGHT);
	}
	
	@Test
	public void testWidth(){
		assertEquals(128, GamePanel.WIDTH);
	}
}
