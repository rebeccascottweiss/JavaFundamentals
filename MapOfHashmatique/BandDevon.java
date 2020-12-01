import java.util.HashMap; 
import java.util.Set; 

public class BandDevon{
    public static void trackList(){
        HashMap<String, String> trackList = new HashMap<String, String>(); 

        trackList.put("Umbrella", "It is always raining somewhere..."); 
        trackList.put("Another Song about Rain", "Rain, Rain, Rain... there is nothing colder..."); 
        trackList.put("Snow Song", "The snow, it is just like the rain, we know..."); 
        trackList.put("Stormy", "This one feels different, like a thundercloud..."); 

        System.out.println(trackList.get("Snow Song")); 
        
        Set<String> keys = trackList.keySet(); 

        for(String key: keys){
            System.out.println("The track name is: " + key +". The lyrics are: " + trackList.get(key)); 
        }; 
    }; 
}