package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		
		// 2.  Ask the user a question 
	String answer = JOptionPane.showInputDialog(null,"true or false...is water a solid?" );
		
		// 3.  Use an if statement to check if their answer is correct
	if (answer.equals("false")) {
		JOptionPane.showMessageDialog(null, "correct!");
		score = score+ 1;
		
	}else {
		JOptionPane.showMessageDialog(null, "wrong buddy.");
		score = score +0 ; 
	}
		
		// 4.  if the user's answer was correct, add one to their score 
		
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
	String answer2 = JOptionPane.showInputDialog(null, "is Anika awesome?");
	 if (answer2.equals("yes")) {
		 JOptionPane.showMessageDialog(null, "yes! Good Job Buddy!!!");
		 score= score +1;
	 }else {
		 JOptionPane.showMessageDialog(null, "you're a failure buddy.");
		 score = score +0;
	 }
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
