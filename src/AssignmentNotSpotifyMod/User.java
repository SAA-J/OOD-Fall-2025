package AssignmentNotSpotifyMod;
import java.util.List;


// Class representing a User
public class User {
    private String username;
    private List<Playlist> playlists;
    private List<Song> library;

    // Constructor
    public User(String username, List<Playlist> playlists, List<Song> library) {
        this.username = username;
        this.playlists = playlists;
        this.library = library;
    }

    // Method to create a playlist
    public void createPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }
    // Method to delete a playlist
    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }
    // Method to add a song to a playlist
    public void addSongToPlaylist(Song song, Playlist playlist) {
        if(library.contains(song) && playlists.contains(playlist)) {
            playlist.addSong(song);
        }
    }
    // Method to remove a song from a playlist
    public void removeSongFromPlaylist(Song song, Playlist playlist) {
        if(playlists.contains(playlist)) {
            playlist.removeSong(song);
        }
    }
    // Method to list songs by genre
    public void listByGenre(String genre) {
        System.out.println("Songs in genre: " + genre);
        for(Song song : library) {
            if(song.getGenre().equalsIgnoreCase(genre)) {
                System.out.println("- " + song.getTitle() + " by " + song.getArtist());
            }
        }
    }
    // Method to list songs by mood
    public void listByMood(String mood) {
        System.out.println("Songs in mood: " + mood);
        for(Song song : library) {
            if(song.getMood().equalsIgnoreCase(mood)) {
                System.out.println("- " + song.getTitle() + " by " + song.getArtist());
            }
        }
    }
    // Method to show all songs in library
    public void showAllSongs() {
        System.out.println("All songs in library:");
        for(Song song : library) {
            System.out.println("- " + song.getTitle() + " by " + song.getArtist());
        }
    }
    // Method to get all playlists
    public void getPlaylists() {
        System.out.println("Playlists:");
        for(Playlist playlist : playlists) {
            System.out.println("- " + playlist.getName());
        }
    }

}
