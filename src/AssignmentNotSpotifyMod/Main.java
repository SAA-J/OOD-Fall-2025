package AssignmentNotSpotifyMod;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Library library = new Library();
// Adding songs to the library
        library.addSong(new Song("Ghosts", "Justin Bieber", 3.12, "Pop", "Joy"));
        library.addSong(new Song("Flourescent Adolescent", "Arctic Monkeys", 3.03, "Rock", "Sadness"));
        library.addSong(new Song("No.1 Party Anthem", "Arctic Monkeys", 4.03, "Rock", "Joy"));
        library.addSong(new Song("A Certain Romance", "Arctic Monkeys", 5.31, "Rock", "Sadness"));
        library.addSong(new Song("Wake me Up When September Ends", "Green Day", 4.45, "Rock", "Sadness"));
        library.addSong(new Song("En algun lugar", "Duncan Dhu", 3.56, "Rock", "Joy"));
        library.addSong(new Song("Me voy", "Julieta Venegas", 3.07, "Pop", "Sadness"));
        library.addSong(new Song("Darte un beso", "Prince Royce", 3.26, "Pop", "Joy"));
        library.addSong(new Song("Don't wanna know", "Maroon 5", 3.34, "Pop", "Sadness"));
        library.addSong(new Song("DAISES", "Justin Bieber", 2.56, "Pop", "Joy"));
        library.addSong(new Song("Take five", "Dave Brubeck", 5.24, "Jazz", "Joy"));
        library.addSong(new Song("Stomping at the Savoy", "Benny Goodman", 3.15, "Jazz", "Joy"));
        library.addSong(new Song("My favorite things", "John Coltrane", 13.44, "Jazz", "Sadness"));
        library.addSong(new Song("What a little moonlight can do", "Nancy Wilson", 2.27, "Jazz", "Sadness"));
        library.addSong(new Song("My one and only love", "John Coltrane", 4.55, "Jazz", "Sadness"));



        //User input
        System.out.println("Music library: ");
        System.out.println("Enter 'all', 'genre', or 'mood':");
        String choice = scnr.nextLine();
        // switch case for user input, 3 cases (all, genre, mood)
        switch (choice.toLowerCase()) {
            case "all" -> {
                System.out.println("All Songs:");
                library.displaySongs();
            }
            case "genre" -> {
                System.out.print("Enter genre: ");
                String genre = scnr.nextLine();
                List<Song> genreSongs = library.getSongsGenre(genre);
                if (genreSongs.isEmpty()) {
                    System.out.println("No songs found for genre: " + genre);
                } else {
                    System.out.println("Songs in genre " + genre + ":");
                    for (Song song : genreSongs) {
                        System.out.println(song);;
                    }
                }
            }
            case "mood" -> {
                System.out.print("Enter mood (Joy/Sadness): ");
                String mood = scnr.nextLine();
                List<Song> moodSongs = library.getSongsMood(mood);
                if (moodSongs.isEmpty()) {
                    System.out.println("No songs found for mood: " + mood);
                } else {
                    System.out.println("Songs with mood " + mood + ":");
                    for (Song song : moodSongs) {
                        System.out.println(song);;
                    }
                }
            }
            default -> System.out.println("Invalid choice.");
        }

        scnr.close();
    }
}





