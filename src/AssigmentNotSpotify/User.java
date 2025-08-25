package AssigmentNotSpotify;
import java.util.ArrayList;
public class User {
    private String userName;
    private ArrayList<Playlist> playlists = new ArrayList<>();
    Playlist playlist;

    // Constructor that initializes with the name of the song and type of playlist
    public Playlist createPlaylist(String name, String type) {
        if (type.equals("Jazz")) { // Check if the type is Jazz
            playlist = new JazzPlaylist(name); // Create a new JazzPlaylist object
            playlists.add(playlist);
        } else if (type.equals("Rock")) {
            playlist = new RockPlaylist(name);
            playlists.add(playlist);
        } else if (type.equals("Pop")) {
            playlist = new PopPlaylist(name);
            playlists.add(playlist);
        } else {
            System.out.println("Playlist cannot be created");
        }
        return playlist;
    }
    // Method to delete
    public void deletePlayList(Playlist playlist) {
        playlists.remove(playlist);
    }
    // Method to add and remove songs from the playlist
    public void addSongToPlaylist(Playlist playlist, Song song) {
        playlist.addSong(song);
    }
    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        playlist.removeSong(song);
    }
}
