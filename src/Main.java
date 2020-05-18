import java.util.Scanner;

public class Main {
    // Main method.
    public static void main (String [] args){
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        while (!String.valueOf(game.getHiddenRandomMovieTitle()).equals(game.getRandomMovieTitle())){
            String output = game.checkTitle(scanner.nextLine().charAt(0));
            System.out.println(output);
        }

    }
}
