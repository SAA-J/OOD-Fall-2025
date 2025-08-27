package AssignmentNotSpotifyMod;
import java.util.List;
public interface Playlist {
    String getName(); // Get the name of the playlist
    void addSong(Song song); // Add a song to the playlist
    void removeSong(Song song); // Remove a song from the playlist
    void playAllSongs(); // Play all songs in the playlist
    List<Song> getSongs(); // Get the list of songs in the playlist

}
