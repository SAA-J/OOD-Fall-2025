package AssignmentNotSpotifyMod;

import java.util.ArrayList;
import java.util.List;

// Class representing a Rock Playlist
public class RockPlaylist implements Playlist {
    private String name;
    private List<Song> songs;

    // Constructor
    public RockPlaylist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Getter
    @Override
    public String getName() {
        return name;
    }

    // Add method
    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    // Remove method
    @Override
    public void removeSong(Song song) {
        songs.remove(song);
    }
    // Play method
    @Override
    public void playAllSongs() {
        for (Song song : songs) {
            song.play();
        }
    }
    // Get songs method
    @Override
    public List<Song> getSongs() {
        return songs;
    }
}
