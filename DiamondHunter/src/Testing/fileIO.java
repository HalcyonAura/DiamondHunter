package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.neet.DiamondHunter.Manager.Content;

public class fileIO {
	//need to test input of audio files still
	
	@Test
	public void testMENU() {
		assertNotNull(Content.MENUBG);
	}

	@Test
	public void testBAR(){
		assertNotNull(Content.BAR);
	}
	
	@Test
	public void testPLAYER(){
		assertNotNull(Content.PLAYER);
	}
	
	@Test
	public void testDIAMOND(){
		assertNotNull(Content.DIAMOND);
	}
	
	@Test
	public void testSPARKLE(){
		assertNotNull(Content.SPARKLE);
	}
	
	@Test
	public void testITEMS(){
		assertNotNull(Content.ITEMS);
	}
	
	@Test
	public void testFONT(){
		assertNotNull(Content.font);
	}
}
