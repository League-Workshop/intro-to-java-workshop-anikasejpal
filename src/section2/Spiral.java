package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Mews = new Robot (); 
		
		// 5. Set your robot's pen down 
		Mews.penDown();
		// 3. Set the robot to go at max speed (100)
		Mews.setSpeed(100);
		
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 75; i++) {
			Mews.move(5*i);
			
		
		
			// 7. Change the pen color to random
		Mews.setRandomPenColor();
		
			// 6. Move the robot 5 times the loop counter (5*i)

			// 2. Turn the robot 360/7 degrees to the right
		Mews.turn(360/7);
		
			// 8. Set the pen width to i
		Mews.setPenWidth(i);
		
	}
}
}
