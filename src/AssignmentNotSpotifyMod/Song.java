package AssignmentNotSpotifyMod;

public class Song {
        private String title; // Title of the song
        private String artist; // Song artist
        private double duration; // Song duration
        private String genre;
        private String mood;

        // Constructor to initialize a Song object with title, artist, and duration
        public Song(String userInputTitle, String artist, double duration, String genre, String mood) {
            this.title = userInputTitle;
            this.artist = artist;
            this.duration = duration;
            this.genre = genre;
            this.mood = mood;
        }

        // Getter method for title
        public String getTitle() {
            return title; // Return the title of the song
        }

        // Getter method for artist
        public String getArtist() {
            return artist; // Return the artist of the song
        }

        // Getter method for duration
        public double getDuration() {
            return duration; // Return the duration of the song
        }
        // Getter method for genre
        public String getGenre() {
            return genre;
        }
        // Getter method for mood
        public String getMood() {
            return mood;
        }

        // toString method
        @Override
        public String toString() {
            return "\nName: " + title + "\n Artist: " + artist + "\nDuration: " + duration; // Print the song
        }

        // Method to simulate playing the song
        public void play() {
            System.out.println("Playing: " + title + " by " + artist);
        }


}

