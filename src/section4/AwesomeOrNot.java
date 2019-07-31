package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		int random = new Random().nextInt(4);
		String random2 = JOptionPane.showInputDialog(null,"what do you think is awesome?");
		if (random==(0)) {
			JOptionPane.showMessageDialog(null, "that's an awesome number buddy!");
		}
		if (random==(1)) {
			JOptionPane.showMessageDialog(null, "oh, well that number is ok.");
		}	
		if (random==(2)) {
		
			JOptionPane.showMessageDialog(null, "lol thats a boring number.");
		}
		if (random==(3)) {
			
		}
			JOptionPane.showMessageDialog(null, "go get a life dude.");
			
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	 
	 


	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}
}

