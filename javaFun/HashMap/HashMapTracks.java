import java.util.*;

public class HashMapTracks {
    public static void main(String[] args) {
        // To demonstrate to the band how it would work, use a HashMap with the track titles as keys and some sample lyrics as the values. 
        // Add at least 4 songs to your trackList HashMap and then pull one out by its name. 
        // They also want to be able to see all the tracks with the lyrics immediately following them.

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Song Title One", "Lyrics about song one");
        trackList.put("Song Title Two", "Lyrics about song two");
        trackList.put("Song Title Three", "Lyrics about song three");
        trackList.put("Song Title Four", "Lyrics about song four");

        String getmeonetrack = trackList.get("Song Title Three");
        System.out
                .println("Pull out one of the songs by its track title, Song Title Three's Lyrics:\n" + getmeonetrack);

        System.out.println("\nPrint out all the track names and lyrics in the format = Track: Lyrics: ");
        for (String track : trackList.keySet()) {
            System.out.println(track + ": " + trackList.get(track));
        }

    }
}

// Compile:
// javac HashMapTracks.java
// java HashMapTracks
// git push origin2 master