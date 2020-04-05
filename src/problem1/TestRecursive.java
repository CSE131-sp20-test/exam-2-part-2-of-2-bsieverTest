package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestRule;
import org.junit.runners.MethodSorters;

import support.cse131.UnitTestUtils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRecursive {
	@Rule
	public TestRule timeout = UnitTestUtils.createTimeoutRule();

	@Test
	void testSingle() {
		assertEquals("hi", StringMultiplication.stringMultiplicationRecursive(1, "hi"));
	}

	@Test
	void testDouble() {
		assertEquals("hh", StringMultiplication.stringMultiplicationRecursive(2, "h"));
	}
	
	@Test
	void testZero() {
		assertEquals("",StringMultiplication.stringMultiplicationRecursive(0, "h"));
	}

	
	@Test
	void testTen() {
		assertEquals("ABABABABABABABABABAB", StringMultiplication.stringMultiplicationRecursive(10, "AB"));
	}

	@Test
	void testNegative() {
		assertEquals("", StringMultiplication.stringMultiplicationRecursive(-1, "AB"));
	}

}
