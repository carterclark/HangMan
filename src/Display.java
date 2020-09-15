import java.util.ArrayList;
import java.util.Arrays;

public class Display {

    public String hidden_word;
    public char[] word_array;
    public char[] displayed_word_array;
    public int chance_counter = 10;
//    public char[] wrong_letters = new char[chance_counter];//need some way to use difficulty variable from PlayGame.java
    public ArrayList<Character> wrong_letters = new ArrayList<Character>();
    public ArrayList<Character> right_letters = new ArrayList<Character>();
    public int wrong_guesses = 0;

    public Display(String hidden_word) {
        this.hidden_word = hidden_word;
    }

    public void convert_Hidden_Word() {

        this.word_array = new char[this.hidden_word.length()];
        for (int i = 0; i < this.hidden_word.length(); i++) {
            this.word_array[i] = this.hidden_word.charAt(i);
        }
    }

    public String getWord_Array(){
        return Arrays.toString(word_array);
    }

    public void create_viewed_word(){
        this.displayed_word_array = new char[this.hidden_word.length()];
        for (int i = 0; i < this.hidden_word.length(); i++) {
            this.displayed_word_array[i] = '*';
        }
    }

    public String getDisplayed_word_array(){
        return Arrays.toString(this.displayed_word_array);
    }

    public String getWrong_letters(){
        return "Wrong letters: " + this.wrong_letters;
    }

    				//note: set 'n' to difficulty!
    public void print_image(int n){					//difficulty: hard to 7, medium to 14, easy to 21
        System.out.println("        _____________   ");
        System.out.println("                    |   ");
        if (wrong_guesses >= 1 * n){
            System.out.println("        ( x x)      |   ");
        }else{
            System.out.println("                    |   ");
        }
        if (wrong_guesses >= 2 * n){
            System.out.println("           |        |   ");
        }else{
            System.out.println("                    |   ");
        }
        if (wrong_guesses >= 3 * n){
            System.out.println("      o<-<<+>>->o   |   ");
        }else{
            System.out.println("                    |   ");
        }
        if (wrong_guesses >= 4 * n){
            System.out.println("          ||        |   ");
        }else{
            System.out.println("                    |   ");
        }
        if (wrong_guesses >= 5 * n){
            System.out.println("          +         |   ");
        }else{
            System.out.println("                    |   ");
        }
        if (wrong_guesses >= 6 * n){
            System.out.println("         |  |       |   ");
        }else{
            System.out.println("                    |   ");
        }
        if (wrong_guesses >= 7 * n){
            System.out.println("         L  L       |   ");
        }else{
            System.out.println("                    |   ");
        }
        System.out.println("                    |   ");
    }

    public void chance_changer(int chances){
        this.chance_counter = chances;
    }
}