package problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMethodSignatures {

	
	/** 
	 * These methods just test that the method signatures are likely to be correct
	 * ***THEY DO NOT IMPLY ANYTHING ABOUT CORRECTNESS***
	 */

	
	@Test
	void testCountInterestingElementsSignature() {
		int[] values = null;
		int val = Methods.countInterestingElements(values);
	}

	@Test
	void testCountInterestingElements2DSignature() {
		int[][] values = null;
		int val = Methods.countInterestingElements2D(values);
	}
	
	
	@Test
	void testInterestingElementsOnlySignature() {
		int[] values = null;
		int[] interestings = Methods.interestingElementsOnly(values);
	}
}
