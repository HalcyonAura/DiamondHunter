/**
 * 
 */
package com.neet.DiamondHunter.JUnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.neet.DiamondHunter.Manager.JukeBox;
/**
 * @author Kirevikyn
 *
 */
public class JukeBoxTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		JukeBox.init();
		JukeBox.load("/Music/bgmusic.wav", "music1");
		JukeBox.setVolume("music1", -10);
		JukeBox.loop("music1", 1000, 1000, JukeBox.getFrames("music1") - 1000);
		JukeBox.play("music1");
		assertTrue(JukeBox.isPlaying("music1"));
		JukeBox.stop("music1");
		assertFalse(JukeBox.isPlaying("music1"));
		JukeBox.resumeLoop("music1");
		assertTrue(JukeBox.isPlaying("music1"));
	}

}
