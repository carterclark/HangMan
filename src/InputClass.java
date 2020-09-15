import java.util.InputMismatchException;
import java.util.Scanner;

public class InputClass {
	
	
	//ALL ARE WHILE LOOPS
	//method for starting game, enter "yes" or "no" to uppercase
	boolean startNewGame(Scanner input) {
		
		boolean userPlays = true;
		
		while(userPlays) {
			
			System.out.println("Play hangman? Enter 'Y' for yes or 'N' for no: ");
			
			String userInput = (input.next()).toUpperCase();
			
			if(userInput.equals("Y")) {
				userPlays = true;
				break;
				
			}
			else if(userInput.equals("N")) {
				System.out.println("Goodbye!");
				userPlays = false;
			}
			else System.out.println("Invalid Input");
		}
		return userPlays;
		
	}
	
	//method to enter length of word between 3-11, 20 for super long word, and -1 to exit game. Type int
	int length(Scanner input) {
		
		int length = 0;
		
		boolean keepEntering = true;
		
		while(keepEntering) {
			System.out.println("Pick length of word to guess: ");
			System.out.println("\nEnter integer length from 3 to 11, ");
			System.out.println("20 for challenge words,");
			System.out.println("or '-1' to exit game: ");
			
			
			
			
			  try {
				  length = input.nextInt();
					if(length == 20 || (length >= 3 && length <= 11)) {
						keepEntering = false;
					}
					else if(length == -1) {
						
						System.out.println("Goodbye!");
						System.exit(0);
					}
					else System.out.println("Invalid entry");//wrong entry
					
			  
			  }
			  
			  catch(InputMismatchException  ex ) {
			  System.out.println("Error, enter an integer");//wrong entry }
			  input.nextLine();
			  
			  }
			 
		}
		return length;
	}
	//method to enter difficulty: 1 for easy, 2 for medium, 3 for hard, and -1 to exit game. 	Type int
	int difficulty(Scanner input) {
		int difficulty = 0;
		boolean keepEntering = true;
		
		while(keepEntering) {
			System.out.println("Choose a difficulty as an integer");
			System.out.println("1-hard\n" + "2-medium\n" + "3-easy\n" + "or -1 to exit game");
			
			
			try {
				difficulty = input.nextInt();
				
				if(difficulty >= 1 && difficulty <= 3) {
					keepEntering = false;
				}
				else if(difficulty == -1) {
					System.out.println("Goodbye!");
					System.exit(0);
				}
				else System.out.println("Invalid entery");	//wrong entry
				
			}
			catch (InputMismatchException  ex ) {
				 System.out.println("Error, enter an integer");//wrong entry }
				 input.nextLine();
			}
			
		}
		return difficulty;
		
		
		
		
	}
	
	//method to enter guess letter, and to exit game. Type char
	// '$' to end the game
	char guess(Scanner input) {
		boolean keepGuessing = true;
		char charInput = '$';
		
		while(keepGuessing) {
			System.out.println("\nEnter guess as single letter \nor enter '$' to exit game: ");
			
			String userInput = input.next().toUpperCase();
			
			if(userInput.length() > 1) System.out.println("Too many entries");	//more than one entry
			
			else {
				charInput = userInput.charAt(0);
				if(Character.isLetter(charInput)) {	//correct type of entry
					keepGuessing = false;
				}
				
				else if(charInput == '$') {			//exit game
					System.out.println("Goodbye!");
					System.exit(0);
				}
				
				else System.out.println("Invalid entery");	//wrong entry
			}
			
		}
		
		return charInput;
	}
	
	// use System.exit(0); to stop program in methods
	
	
	
	
	
	
	//method for checking if length is acceptable
	/*
	 * private boolean lengthIsGood(int length) { if(length == 20 || (length >= 3 &&
	 * length <= 11)) return true; else return false; }
	 */
	
	
	
	/*
	 * int pickDifficulty(int length) { int difficulty = 0; //enter 1 for easy, 2
	 * for medium, or 3 for hard Scanner input = new Scanner(System.in);
	 * while(difficulty != -1) { System.out.println();
	 * 
	 * }
	 * 
	 * 
	 * input.close();
	 * 
	 * return 1; }
	 */
	
	
	
	/*
	 * int inputLength() { int length = 0;
	 * System.out.println("\nEnter integer length from 3 to 11, ");
	 * System.out.println("20 for challenge words,");
	 * System.out.println("or '-1' to exit game: ");
	 * 
	 * System.out.print("\nInteger: "); length = input.nextInt();
	 * System.out.println("___________________________________");
	 * 
	 * 
	 * if(length == -1) { System.out.println("Goodbye!"); gameState = "EXIT"; } break
	 * 
	 * else if(lengthIsGood(length)) { String word = fromList.pickWord(length);
	 * //send word to display method //loop for difficulty input, setting to 1 for
	 * now int difficulty = 1; //playGame.startGame(word, difficulty); }
	 * 
	 * 
	 * else System.out.println("Invalid Entry");
	 * 
	 * }
	 */

}