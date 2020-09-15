import java.util.Scanner;

public class GameDriver {
	
	
	
	public static void main(String[] args) {
		InputClass input_class = new InputClass();
		WordList fromList = new WordList();
		
		Scanner input = new Scanner(System.in);
		
		boolean gameContinues = true;
		
		while(gameContinues) {
			
			boolean startNewGame = input_class.startNewGame(input); //asks whether the user wants to play
			//boolean yesOrNo = true;
			if(startNewGame) {
				//System.out.println("Flare");
				
				
				int length = input_class.length(input);		//input length method
				int difficulty = input_class.difficulty(input);	//input difficulty method
				
				String word = fromList.pickWord(length);
				
				PlayGame.displayLoop(input, word, length, difficulty);//loop for single game
			}
			else {
				gameContinues = false;
			}
		}
		
		input.close();
	}
	
	
	
	
	

}