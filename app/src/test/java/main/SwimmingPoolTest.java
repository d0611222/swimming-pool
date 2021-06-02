import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwimmingPoolTest {
	SwimmingPool test = new SwimmingPool();
	@Test
	void testGetPrice01() {
		assertEquals(200, test.getPrice(false, 21, 8, false, false));
	}
	@Test
	void testGetPrice02() {
		assertEquals(250, test.getPrice(true, 21, 8, false, false));
	}
	@Test
	void testGetPrice03() {
		assertEquals(250*0.5, test.getPrice(true, 21, 8, false, true));
	}
	@Test
	void testGetPrice04() {
		assertEquals(200*0.5, test.getPrice(false, 21, 8, false, true));
	}

}
