package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestRule;
import org.junit.runners.MethodSorters;

import support.cse131.UnitTestUtils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestNonrecursive {
	@Rule
	public TestRule timeout = UnitTestUtils.createTimeoutRule();

	@Test
	void testSingle() {
		assertEquals("hi", StringMultiplication.stringMultiplicationNonrecursive(1, "hi"));
	}

	@Test
	void testDouble() {
		assertEquals("hh", StringMultiplication.stringMultiplicationNonrecursive(2, "h"));
	}
	
	@Test
	void testZero() {
		assertEquals("",StringMultiplication.stringMultiplicationNonrecursive(0, "h"));
	}

	
	@Test
	void testTen() {
		assertEquals("ABABABABABABABABABAB", StringMultiplication.stringMultiplicationNonrecursive(10, "AB"));
	}

	@Test
	void testNegative() {
		assertEquals("", StringMultiplication.stringMultiplicationNonrecursive(-1, "AB"));
	}
}
