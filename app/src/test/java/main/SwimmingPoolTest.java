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
	@Test
	void testGetPrice05() {
		assertEquals(200*0.8, test.getPrice(false, 12, 8, false, false));
	}
	@Test
	void testGetPrice06() {
		assertEquals(200*0.8, test.getPrice(false, 60, 8, false, false));
	}
	@Test
	void testGetPrice07() {
		assertEquals(200*0.8, test.getPrice(false, 21, 6, false, false));
	}
	@Test
	void testGetPrice08() {
		assertEquals(-1, test.getPrice(false, 1, 8, false, false));
	}
	@Test
	void testGetPrice09() {
		assertEquals(-1, test.getPrice(false, 80, 8, false, false));
	}
	@Test
	void testGetPrice10() {
		assertEquals(-1, test.getPrice(false, 21, 3, false, false));
	}
	@Test
	void testGetPrice11() {
		assertEquals(-1, test.getPrice(false, 21, 24, false, false));
	}
	@Test
	void testGetPrice12() {
		assertEquals(200*0.7, test.getPrice(false, 21, 8, true, false));
	}
}
