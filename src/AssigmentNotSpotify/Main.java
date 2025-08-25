package AssigmentNotSpotify;

public class Main {
    public static void main(String[] args) {
        User currentUser = new User();

        //Using pop as an example
        Song song1 = new Song("Demons", "Imagine Dragons", 2.57);
        Song song2 = new Song("Chemical", "Post Malone", 3.04);
        Song song3 = new Song("DAISES", "Justin Bieber", 2.56);

        // Create a pop playlist using the User class method
        Playlist popPlaylist = currentUser.createPlaylist("Pop Playlist", "Pop");

        // Add songs to the playlist
        currentUser.addSongToPlaylist(popPlaylist, song1);
        currentUser.addSongToPlaylist(popPlaylist, song2);
        currentUser.addSongToPlaylist(popPlaylist, song3);

        // Play all songs in the playlist
        System.out.println("Playing songs in the playlist:");
        popPlaylist.playAllSongs();

        // Delete a song from the playlist
        currentUser.removeSongFromPlaylist(popPlaylist, song1);

        // Play all songs after deletion
        System.out.println("\nPlaying songs currently in the playlist:");
        popPlaylist.playAllSongs();

        // Delete the playlist
        currentUser.deletePlayList(popPlaylist);
    }
}
