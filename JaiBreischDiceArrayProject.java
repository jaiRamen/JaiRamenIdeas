//JAI BREISCH DICE EXPERIMENT NEED HELP
		//(My friend Dax Allen helped me to get it to roll it as many times as the # of sides) 
package jaiBreischDiceArrayProj;


import java.util.Scanner;
import java.util.Random;

public class JaiBreischDiceArrayProject {


	/*This Program asks the user to choose how many sides they would like their die,
		then will roll that die the amount of times that there are sides 
				
	 WHAT I WANT IT TO DO IS MAKE AN ARRAY OR TABLE OF EACH SIDE(1-4<=20), AND SHOW HOW MANY IT ROLLED OF EACH	
	 * EX: SIDE 1 2 3 4
	 * # Rolled 0 2 1 1
	 * (if there was a four sided die that rolled 2 2's, a 3, and a 4.
	 * 
	 *  IDEAS????
	 */
	public static void main(String[] args) {
			@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				displayMenu();
				int dicesides = input.nextInt();
					if (dicesides == 4 || dicesides == 6 || dicesides == 8 || dicesides == 10 || dicesides == 12 || dicesides == 20) {
						rollDice(dicesides);
					for ( int i = dicesides; i>0; i--) {
							rollDice(dicesides);
							}
				  } else { 
						displayError();}
			}
			private static void displayMenu() {
				System.out.println("===========================");
				System.out.println("Select a Dice Size");
				System.out.println("===========================");
				System.out.println("4  sided");
				System.out.println("6  sided");
				System.out.println("8  sided");
				System.out.println("10 sided");
				System.out.println("12 sided");
				System.out.println("20 sided");
				System.out.println("===========================");
				System.out.printf("Enter 4, 6, 8, 10, 12 or 20: ");
				
			}
			private static void displayError() {
				System.out.println("Error: Please try again with a valid number.");
				System.out.println(" Enter 4,6,8,10,12,or 20 next time.");
			}
			private static int rollDice(int size) {
				Random rand = new Random();
				System.out.printf("I Rolled your %d-sided die ... you rolled a %d%n", size, rand.nextInt(size) + 1);
				return size;
			}
	}