package GradleProj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumberTest {
private final SumOfNumber obj = new SumOfNumber();
	@Test
	void testSum() {
		assertEquals(5, obj.sum(2,3));
	}
	void testSumNegative() {
		assertNotEquals(7, obj.sum(2,3));
	}
}
