import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// Simple class for game operations.
public class Game {

    // Get the file of movie titles.
    File movie = new File("movie_titles.txt");

    // Use scanner to read through the files.
    Scanner scanner;

    // Save the movie titles.
    LinkedList<String> movieTitles = new LinkedList<>();

    // Random Movie title.
    String randomMovieTitle = null;

    //Game Constructor.
    Game(){
        // initialize scanner through the main constructor.
        {
            try {
                scanner = new Scanner(movie);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        // Add whole movie.
        addMovieTitles();
        // Pick one movie title.
        pickOneMovie();
    }

    // Add whole movie titles to linked list.
    private void addMovieTitles (){
        while (scanner.hasNext()){
            String movieTitle = scanner.nextLine();
            movieTitles.add(movieTitle);
        }
    }

    // Method shows the title of movies.
    public void showTitle(){
        for (int i = 0; i<movieTitles.size(); i ++){
            System.out.println(movieTitles.get(i));

        }
    }

    //Pick one movie randomly.
    private void pickOneMovie(){
        Random random = new Random();
        int randomNumber = random.nextInt(25);
        randomMovieTitle = movieTitles.get(randomNumber).toString();
        System.out.println("Random Movie is:" + randomMovieTitle);
    }

}
