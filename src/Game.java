import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

// Simple class for game operations.
public class Game {

    // Get the file of movie titles.
    File movie = new File("movie_titles.txt");

    // Use scanner to read through the files.
    Scanner scanner;

    // Method shows the title of movies.
    public void showTitle(){
        while (scanner.hasNext()){
            String movieTitle = scanner.nextLine();
            System.out.println(movieTitle);
        }
    }

}
