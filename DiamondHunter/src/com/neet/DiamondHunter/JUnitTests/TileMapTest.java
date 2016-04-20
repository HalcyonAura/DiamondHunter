package JUnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.neet.DiamondHunter.TileMap.TileMap;

public class TileMapTest {
	private TileMap testMap;
	
	@Before
	public void setUp() throws Exception {
		testMap = new TileMap(200);
	}

	@After
	public void tearDown() throws Exception {
		testMap = null;
	}

	@Test
	public void testGetTileSize() {
		assertEquals(testMap.getTileSize(), 200);
	}

	@Test
	public void testGetx() {
		testMap.setPosition(0,5);
		assertEquals(testMap.getx(), 0);
		testMap.setPositionImmediately(2,7);
		assertEquals(testMap.getx(), 2);
	}

	@Test
	public void testGety() {
		testMap.setPositionImmediately(2,7);
		assertEquals(testMap.gety(), 7);
	}

	@Test
	public void testGetWidth() {
		assertEquals(testMap.getWidth(), 0);
	}

	@Test
	public void testGetHeight() {
		assertEquals(testMap.getHeight(), 0);
	}

	@Test
	public void testGetNumRows() {
		assertEquals(testMap.getNumRows(), 0);
	}

	@Test
	public void testGetNumCols() {
		assertEquals(testMap.getNumCols(), 0);
	}

	@Test
	public void testIsMoving() {
	//	assertEquals(testMap.isMoving(), );
	}

}
