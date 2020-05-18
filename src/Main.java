import java.util.Scanner;

public class Main {

    // Main method.
    public static void main (String [] args){
        // Create an object of game application.
        Game game = new Game();
        // Use scanner to get user input.
        Scanner scanner = new Scanner(System.in);
        // Print statements.
        System.out.println("You are guessing: " + String.valueOf(game.getHiddenRandomMovieTitle()));
        System.out.println("Guess movie by typing one letter.");
        // Check if the hidden value equals random value we have to break.
        while (!String.valueOf(game.getHiddenRandomMovieTitle()).equals(game.getRandomMovieTitle())){
            System.out.println("You have (" + game.getPoints()+ ") points!");
            System.out.println("You have (" + game.getWrongLetters().size() + ")" + "wrong letters: " + game.getWrongLetters().toString());
            String output = game.checkTitle(scanner.nextLine().charAt(0));
            System.out.println(output);
            if (game.getPoints()<=0){
                System.out.println("You lost!");
                break;
            }
        }
        // if two words are equal.
        if(String.valueOf(game.getHiddenRandomMovieTitle()).equals(game.getRandomMovieTitle())){
            System.out.println("You won! Great");
        }

    }
}
