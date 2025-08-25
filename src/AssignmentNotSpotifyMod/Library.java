package AssignmentNotSpotifyMod;
import java.util.ArrayList;
import java.util.List;
public class Library implements Playlist{
    private List<Song> songs;

    // Constructor initializing the songs list
    public Library(){
        songs = new ArrayList<>();
    }
    // Add method
    public void addSong(Song song){
        songs.add(song);
    }
    //Remove method
    public void removeSong(Song song){
        songs.remove(song);
    }
    // Get total duration method
    public double getTotalDuration(){
        double totalDuration = 0;
        for (Song song : songs){
            totalDuration += song.getDuration();
        }
        return totalDuration;
    }
    // Method to display all songs
    public void displaySongs(){
        for (Song song: songs){
            System.out.println(song);
        }
    }
    // Method to filter songs base on genre
    public List<Song> getSongsGenre(String genre){
        List<Song> filteredSongs = new ArrayList<>();
        for(Song song : songs) {
            if (song.getGenre().equalsIgnoreCase(genre)){
                filteredSongs.add(song);
            }
        }
        return filteredSongs;
    }
    // Method to filter songs base on mood
    public List<Song> getSongsMood(String mood){
        List<Song> filteredSongs = new ArrayList<>();
        for (Song song : songs){
            if (song.getMood().equalsIgnoreCase(mood)){
                filteredSongs.add(song);
            }
        }
        return filteredSongs;
    }

}
