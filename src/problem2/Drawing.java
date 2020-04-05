package problem2;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;


/**
 * TODO:  Double click on "original.png" in this package (problem2) to see the image.
 * 		  Complete the drawIt() method below to recreate the image as accurately as possible from 
 *        individual shapes.
 *		  (For those with difficulty identifying colors, the image uses Red in the top left and Green
 *        on the right)
 *        
 *        This file is 10 points out of 100!
 *        
 */
public class Drawing {

	/**
	 * Draw the image depicted in problem2/original.jpg
	 */
	public static void drawIt() {
		// DONE: Do not change the scale or canvas size!
		StdDraw.setScale();
		
		// TODO: Recreate the image shown in original.png using StdDraw to draw individual shapes 
		// TODO: This method is 10 points (out of 100 total)		

	}
	
	public static void main(String[] args) {		
		// DONE: DO not modify main()!
		drawIt();

		StdDraw.setPenColor(new Color(0,0,0,0));
		StdDraw.point(0.5, 0.5);
		StdDraw.show();
		
		StdDraw.save("src/problem2/yours.png");
	}
}
