package JUnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.neet.DiamondHunter.Entity.Player;
import com.neet.DiamondHunter.TileMap.TileMap;

public class PlayerTest {
	private Player play;
	private TileMap tm;

	@Before
	public void setUp() throws Exception {
		tm = new TileMap(200);
		play = new Player(tm);
	}

	@After
	public void tearDown() throws Exception {
		play = null;
	}

	@Test
	public void testNumDiamonds() {
		assertEquals(play.numDiamonds(), 0);
	}
	
	@Test
	public void testGetTotalDiamonds() {
		assertEquals(play.getTotalDiamonds(), 0);
	}
	
	@Test
	public void testHasBoat() {
		assertFalse(play.hasBoat());
	}

	@Test
	public void testHasAxe() {
		assertFalse(play.hasAxe());
	}
}
