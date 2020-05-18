import java.util.Scanner;

public class Main {
    // Main method.
    public static void main (String [] args){
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are guessing: " + String.valueOf(game.getHiddenRandomMovieTitle()));
        while (!String.valueOf(game.getHiddenRandomMovieTitle()).equals(game.getRandomMovieTitle())){
            System.out.println("You have (" + game.getWrongLetters().size() + ")" + "wrong letters." );
            String output = game.checkTitle(scanner.nextLine().charAt(0));
            System.out.println(output);
        }

    }
}
