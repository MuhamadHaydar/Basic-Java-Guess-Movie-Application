import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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

    // Characters of random title in hidden.
    char[] hiddenRandomMovieTitle = null;

    // Characters of random title in hidden.
    ArrayList<Character> wrongLetters = new ArrayList<>();

    //Game Constructor.
    Game() {
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
        // Hide title of movie.
        hiddenRandomMovieTitle = new char[randomMovieTitle.length()];
        hiddenRandomMovieTitle = hideTitle(randomMovieTitle);
    }

    // Add whole movie titles to linked list.
    private void addMovieTitles() {
        while (scanner.hasNext()) {
            String movieTitle = scanner.nextLine();
            movieTitles.add(movieTitle);
        }
    }

    // Method shows the title of movies.
    public void showTitle() {
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println(movieTitles.get(i));

        }
    }

    //Pick one movie randomly.
    private void pickOneMovie() {
        Random random = new Random();
        int randomNumber = random.nextInt(25);
        randomMovieTitle = movieTitles.get(randomNumber);
        System.out.println("Random Movie is:" + randomMovieTitle);
    }

    // Check title if it contains or not.
    public String checkTitle(char letter) {

        if (randomMovieTitle.indexOf(letter) != -1) {
            int i = randomMovieTitle.indexOf(letter);
            hiddenRandomMovieTitle[i] = letter;
            while(i >= 0) {
                System.out.println(i);
                i = randomMovieTitle.indexOf(letter, i+1);
                if (i==-1){
                    break;
                }
                hiddenRandomMovieTitle[i] = letter;
                i++;
            }
        }
        else if (randomMovieTitle.indexOf(letter) == -1){
            wrongLetters.add(letter);
        }

        return String.valueOf(hiddenRandomMovieTitle);
    }

    // Method creates an array of chars according title in "_" sign
    private char[] hideTitle(String title) {
        char[] hiddenTitle = new char[title.length()];
        for (int i = 0; i < title.length(); i++) {
            hiddenTitle[i] = '_';
        }
        return hiddenTitle;
    }

    // Get random picked value.
    public String getRandomMovieTitle() {
        return randomMovieTitle;
    }

    // Get random picked value in hidden way.
    public char[] getHiddenRandomMovieTitle() {
        return hiddenRandomMovieTitle;
    }

    // Get wrong letters.
    public ArrayList<Character> getWrongLetters() {
        return wrongLetters;
    }


}
