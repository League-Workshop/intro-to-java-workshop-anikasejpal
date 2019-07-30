package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot Eliot = new Robot();
		Eliot.penDown();
		Eliot.setSpeed(100);
		Eliot.move(50);
		Eliot.turn(90);
		Eliot.move(50);
		Eliot.turn(90);
		Eliot.move(50);
		Eliot.turn(90);
		Eliot.move(50);
	
		
		
	}
}
