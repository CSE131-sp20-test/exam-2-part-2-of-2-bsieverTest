package support.cse131;

public class Predicate {
	public static boolean isElementInteresting(int element) {
		// Currently checks if the element is evenly divisible by 3
		return element%3==0;
	}
}
