import java.util.HashMap;
import java.util.Set;

public class TrackList {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        
        System.out.println("trackList: " + trackList);
        
        trackList.put("Wellerman", "There once was a ship that put to sea...");
        trackList.put("Astronaut In The Ocean", "What you know about rollin' down in the deep?...");
        trackList.put("Fly Away", "I had a dream that someday...");
        trackList.put("Hey, Soul Sister", "Hey, hey, hey, hey, hey...");
        
        Set<String> titles = trackList.keySet();
        System.out.println("Add songs to tracklist: " + titles);

        String song = trackList.get("Wellerman");

        System.out.println("Song: Wellerman Lyrics: " + song);
        for (String key : titles) {
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}