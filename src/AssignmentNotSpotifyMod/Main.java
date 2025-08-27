package AssignmentNotSpotifyMod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a library of songs
        List<Song> library = new ArrayList<>();
        library.add(new Song("No.1 Party Anthem", "Arctic Monkeys", 4.03, "Rock", "Joy"));
        library.add(new Song("Crying Lightning", "Arctic Monkeys", 3.44, "Rock", "Sadness"));
        library.add(new Song("When the Sun Goes Down", "Arctic Monkeys", 240, "Rock", "Sadness"));
        library.add(new Song("Wake Me up When September Ends", "Green Day", 4.45, "Rock", "Sadness"));
        library.add(new Song("En algún lugar", "Duncan Dhu", 3.56, "Rock", "Sadness"));
        library.add(new Song("DAISIES", "Justin Bieber", 2.56, "Pop", "Joy"));
        library.add(new Song("Girls like You", "Maroon 5", 3.55, "Pop", "Joy"));
        library.add(new Song("Memories", "Maroon 5", 3.09, "Pop", "Sadness"));
        library.add(new Song("One Dance", "Drake", 2.53, "Pop", "Joy"));
        library.add(new Song("Galway Girl", "Ed Sheeran", 2.50, "Pop", "Joy"));
        library.add(new Song("What's The Rush", "Gerry Mulligan", 3.42, "Jazz", "Sadness"));
        library.add(new Song("So What", "Miles Davis", 9.23, "Jazz", "Joy"));
        library.add(new Song("Take Five", "The Dave Brubeck Quartet", 5.24, "Jazz", "Joy"));
        library.add(new Song("The Things We Did Last Summer", "Freddie Hubbard", 7.19, "Jazz", "Sadness"));
        library.add(new Song("Chloe", "Joe Pass", 5.21, "Jazz", "Sadness"));

        // Create playlists
        Playlist popPlaylist = new PopPlaylist("Pop Playlist");
        Playlist jazzPlaylist = new JazzPlaylist("Jazz Playlist");
        Playlist rockPlaylist = new RockPlaylist("Rock Playlist");

        // Add songs to playlists
        for (Song song : library) {
            switch (song.getGenre().toLowerCase()) {
                case "pop":
                    popPlaylist.addSong(song);
                    break;
                case "jazz":
                    jazzPlaylist.addSong(song);
                    break;
                case "rock":
                    rockPlaylist.addSong(song);
                    break;
            }
        }

        // Display menu
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View All Songs");
            System.out.println("2. View Songs by Genre (jazz/pop/rock)");
            System.out.println("3. View Songs by Mood (joy/sadness)");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            //user choices
            switch (choice) {

                case 1:
                    System.out.println("\nAll Songs:");
                    displayAllSongs(library);
                    break;

                case 2:
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    displaySongsByGenre(library, genre);
                    break;

                case 3:
                    System.out.print("Enter mood (joy/sadness): ");
                    String mood = scanner.nextLine();
                    displaySongsByMood(library, mood);
                    break;


                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    // Display all songs in the library, showing title, artist, genre, and mood
    private static void displayAllSongs(List<Song> library) {
        for (Song song : library) {
            System.out.println("-" + song.getTitle() + " by " + song.getArtist() + " genre, mood:" + song.getGenre() + ", " + song.getMood());
        }
    }
   // Display songs by genre, filter songs based on their genre
    private static void displaySongsByGenre(List<Song> library, String genre) {
        System.out.println("\nSongs in genre: " + genre);
        for (Song song : library) {
            if (song.getGenre().equalsIgnoreCase(genre)) {
                System.out.println("- " + song.getTitle() + " by " + song.getArtist());
            }
        }
    }
    // Display songs by mood, filter songs based on their mood
    private static void displaySongsByMood(List<Song> library, String mood) {
        System.out.println("\nSongs with mood: " + mood);
        for (Song song : library) {
            if (song.getMood().equalsIgnoreCase(mood)) {
                System.out.println("- " + song.getTitle() + " by " + song.getArtist());
            }
        }
    }
}



