package javaGamev1;
/* javaGamev1.java
 * 9/9/2019
 * Team: Epic dream
 * Description: This version of the program will utilize dialog boxes to interact with the user.
 * This program demonstrates the use of dialog boxes as an alternative for
 * console input and output. 
 */

import javax.swing.JOptionPane; //needed to use the dialog box
public class javaGamev1 {

	public static void main(String[] args) {
		//Declare and initialize variables and constants
		//variables:
		String stringInput; //needed to store input from a dialog box
			
		//Display intro using a dialog box
		JOptionPane.showMessageDialog(null, "WELCOME TO OUR JAVA TRIVIA GAME!\n\n");
				
		//Prompt the user for his/ her name:
		stringInput = JOptionPane.showInputDialog("Please enter your name:          ");
		
		//Display main menu and prompt user for the main menu choice
		stringInput = JOptionPane.showInputDialog("Please select an option:\n"+"\n1) See Rules\n"
		+"\n2) Play Game\n"+"\n3) Exit\n\n");
				
		//Display the rules of the game regardless of user input
		JOptionPane.showMessageDialog(null, "Rules of our Game:\n"+"\n1) Read chapters 1-2\n"
		+"\n2) No smartphones or any electronic devices allowed\n"+"\n3) Play fair and have fun!\n\n");
		
		//Display question 1 and prompt user for input
		stringInput = JOptionPane.showInputDialog("Question 1:\n"+"A byte is made up of eight\n"
		+"\na) CPUs\n"+"\nb) addresses\n"+"\nc) variables\n"+"\nd) bits\n\n"+"Please select your answer:");
				
		//Display question 2 and prompt user for input
		stringInput = JOptionPane.showInputDialog("Question 2:\n"+"This key word is used to declare a named constant\n"
		+"\na) constant\n"+"\nb) namedConstant\n"+"\nc) final\n"+"\nd) concrete\n\n"+"Please select your answer:");
			
		//Display question 3 and prompt user for input
		stringInput = JOptionPane.showInputDialog("Question 3:\n"
		+"This type of operator lets you manually convert a value, even if it means that a narrowing\r\n" + 
		"conversion will take place\n"+"\na) cast\n"+"\nb) binary\n"+"\nc) uploading\n"+"\nd) dot\n\n"+"Please select your answer:");
		
		//Display goodbye using a dialog box
		JOptionPane.showMessageDialog(null, "THANK YOU FOR PLAYING!\n\n"+"     HAVE A GREAT DAY!");
				
		System.exit(0); //needed when using dialog boxes		
	}

}
