package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below)

	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

	
	// 2. Create a variable called "playerHealth" to store your health (set it equal
	// to 100)

	int playerhealth = 100;

	// 3. Create a variable called "dragonHealth" to store the dragon's health (set
	// it equal to 100)

	int dragonhealth = 100;

	// 4. Create a variable to hold the damage the player's attack does each round

	int playerdamage = 10;

	// 5. Create a variable to hold the damage the dragon's attack does each round

	int dragondamage = 10;

	// 6. Delete the slashes at the beginning of the next line.
	while(playerhealth>0&&dragonhealth>0)
	{ // this line of code keeps the battle going until someone's health reaches 0

		// 7. Add a closing mustache at the very bottom of this program (since we just
		// added an opening mustache on the previous step).

		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
		// or a kick
		String attack = JOptionPane.showInputDialog(null, "Do you want to attack the dragon with a yell or a kick?");

		// 9. If they typed in "yell":

		if (attack.equals("yell")) {

			dragondamage = new Random().nextInt(10);
			dragonhealth = dragonhealth - dragondamage;
		}
		// -- Find a random number between 0 and 10 and store it in dragonDamage

		// -- Subtract that number from the dragon's health variable

		// 10. If they typed in "kick":

		if (attack.equals("kick")) {

			dragondamage = new Random().nextInt(25);
			dragonhealth = dragonhealth - dragondamage;
		}
		// -- Find a random number between 0 and 25 and store it in dragonDamage

		// -- Subtract that number from the dragon's health variable

		// 11. Find a random number between 0 and 35 and store it in playerDamage
		playerdamage = new Random().nextInt(35);
		playerhealth = playerhealth - playerdamage;

		// 12. Subtract this number from the player's health

		// 13. If the user's health is less than or equal to 0

		// -- Tell the user that they lost
		if (playerhealth <= (0)) {
			JOptionPane.showMessageDialog(null, "You lost.");
		} else if (dragonhealth <= (0)) {

			JOptionPane.showMessageDialog(null, "Good job, the dragon is dead and you took a ton of gold!");

		} else {

			JOptionPane.showMessageDialog(null, "your health = 1, dragon helath = 100");
		}

	}
}}


// 14. Else if the dragon's health is less than or equal to 0

// -- Tell the user that the dragon is dead and they took a ton of gold!

// 15. Else

// -- Pop up a message that tells the their current health and the dragon's
// currently health (Bonus: Also display the amount of health that was lost for
// each player this round)
