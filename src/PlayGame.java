import java.util.Scanner;

public class PlayGame {

    public static void displayLoop(Scanner input, String word, int length, int difficulty) {
    	InputClass input_class = new InputClass();
        Display display = new Display(word);
        display.chance_changer(7 * difficulty);
        display.print_image(difficulty);
        display.convert_Hidden_Word();
        display.create_viewed_word();
        System.out.println(display.getWord_Array());
        System.out.println(display.getDisplayed_word_array());
        boolean playGame = true;
        

        int winValue = 0;
      //  int picked_counter = 0;
       // Scanner input = new Scanner(System.in);	//scanner
        
        while(playGame){
            System.out.println("You have " + display.chance_counter + " wrong guesses left.");
            
            //System.out.println("Pick a letter");
            
            char guess;													// input method here

            while(true){
                guess = input_class.guess(input);
                if(display.wrong_letters.contains(guess) || display.right_letters.contains(guess)){
                    System.out.println("Already chose " + guess + ", pick again.");
                } else{
                    break;
                }
            }

            
            boolean guess_is = false;
            int correct_letters = 0;

            for(int i = 0; i < display.word_array.length; i++){
               if(display.word_array[i] == guess){
                   display.displayed_word_array[i] = display.word_array[i];
                   correct_letters++;
                   guess_is = true;
                   
                   winValue += 1;
                   if(winValue >= word.length()) {			//win state!
                	   playGame = false;
                	   System.out.println("Correct! You win!");
                	   System.out.println("The word was " + word + "\n");
                	   
                   }
               }
            }
//           if(winValue >= word.length()) break;
            
            if(playGame) {	//if game has not been won
                if (guess_is){
                    System.out.println("There are " + correct_letters + " " + guess + "'s in the hidden word!");
                    correct_letters = 0;
                    guess_is = false;
                    display.right_letters.add(guess);
                }else{
                    System.out.println("Sorry, there is no " + guess + "'s.");
                    display.chance_counter--;
                    display.wrong_guesses++;
                    display.wrong_letters.add(guess);
                    
                    if(display.wrong_guesses > 6 * difficulty) {
                    	System.out.println("\nToo many failed attempts, you lose!");
                    	System.out.println("The word was: " + word + "\n");
                    	playGame = false;
                    }
                 // put fail state here, if wrong guesses become too much
                }
                
                
                
				/*
				 * if(Arrays.asList(display.wrong_letters) .contains(toCheckValue))
				 * display.wrong_letters[picked_counter] = guess;
				 */


                if(playGame) {
                	//picked_counter++;
                    display.print_image(difficulty);
                    System.out.println(display.getDisplayed_word_array());
                    System.out.println(display.getWrong_letters());
                }
                
            	
            	
            }
        }
//        input.close();
    }
}