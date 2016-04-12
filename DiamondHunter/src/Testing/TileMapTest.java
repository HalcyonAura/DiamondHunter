package Testing;

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
	public void testTileMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoadTiles() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoadMap() {
		fail("Not yet implemented");
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
		testMap.setPosition(0,5);
		assertEquals(testMap.gety(), 5);
		testMap.setPositionImmediately(2,7);
		assertEquals(testMap.gety(), 7);
	}

	@Test
	public void testGetWidth() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHeight() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNumRows() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNumCols() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetType() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIndex() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsMoving() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTile() {
		fail("Not yet implemented");
	}

	@Test
	public void testReplace() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
