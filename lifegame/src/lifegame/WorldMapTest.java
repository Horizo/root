package lifegame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WorldMapTest {
private static WorldMap worldmap=new WorldMap();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWorldMap() {
		boolean target=true;
		target=worldmap.setTestcase0();
		assertEquals(true,target);
	}
	@Test
	public void test1WorldMap() {
		boolean target=false;
		target=worldmap.setTestcase1();
		assertEquals(true,target);
	}

}
