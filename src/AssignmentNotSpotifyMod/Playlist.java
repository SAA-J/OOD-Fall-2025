package AssignmentNotSpotifyMod;
import java.util.List;
public interface Playlist {
    void addSong(Song song); // Add a song to the playlist
    void removeSong(Song song); // Remove a song from the playlist
    void displaySongs(); // Display all songs in the playlist
    List<Song> getSongsGenre(String genre); // Get songs by genre
    List<Song> getSongsMood(String mood); // Get songs by mood
    double getTotalDuration(); // Get the total duration of all songs in the playlist

}
