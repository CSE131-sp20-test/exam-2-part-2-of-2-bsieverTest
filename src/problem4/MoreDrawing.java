package problem4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;



/**
 * TODO: 
 * 		This package contains 5 PNG images, drawIt_0.png ->  drawIt_4.png 
 * 		Double click on each to show each respective image. 
 * 		
 * 		Complete the drawIt() method below such that it draws the pattern (including being able
 * 		to follow the pattern to depict the drawing for larger values of i)
 * 
 * 		drawIt(0) should generate a picture as shown in "drawIt_0.png" 
 * 		drawIt(1) should generate a picture as shown in "drawIt_1.png" 
 *      etc.
 *      
 *      Note that the main() call a method that will help you test your work. 
 *      You're welcome to change main() for other types of testing as needed. 
 *      The "drawIt(int)" method should be used to trigger the drawing. 
 *        
 *      This file is 15 points out of 100!
 *        
 */
public class MoreDrawing {

	
	/**
	 * Recursively draw the first i levels of the drawing
	 *  
	 * @param i The number of levels to draw
	 */
	public static void drawIt(int i) {
		// TODO: Complete this!
		// Do NOT modify the Canvas Size or Scale!
		// Do NOT modify the method signature, BUT you MAY add helper methods if needed
	}
	
	public static void main(String[] args) {
		// Do NOT modify the Canvas or Scale!

		// You may modify below this line if it helps you test your work.

		// Currently it calls a method that shows the first "n" (5) examples
		// and pauses for the mouse between each (space bar causes it to exit)
		testFirstN(5);
	}
	
	
	
	/**
	 * Show the first "n" patterns, pausing for a mouse click between each (space bar exist)
	 * @param n The maximum number to show
	 */
	public static void testFirstN(int n) {
		// DONE: This method will help you test your work.  
		// It will draw "n" images (0 up to n-1). 
		// Pressing the mouse button will advance to the next one
		// Pressing the space bar will cause the program to stop
		StdDraw.enableDoubleBuffering();
		StdDraw.setPenRadius(.004);
		boolean continueShowing = true;
		int i=0;
		while(continueShowing && i<n) {
			StdDraw.clear();
			drawIt(i);
			StdDraw.show();
			StdDraw.save("src/problem4/yours_"+i+".png");
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(.5, 1-.1, "Showing " + i + ": Click mouse to continue or hit space to stop");
			StdDraw.show();
			
			boolean waitForNext = true;
			while(waitForNext) {
				if(StdDraw.isMousePressed()) {
					while(StdDraw.isMousePressed()) {
						// Wait until mouse is released
					}
					waitForNext = false;
				} else if(StdDraw.hasNextKeyTyped() && StdDraw.nextKeyTyped() == ' ')  {
					waitForNext = false;
					continueShowing = false;
				}
				StdDraw.pause(100);
			}
			i++;
		}		
		System.exit(0);
	}

}
