import java.util.Set;
import java.util.HashMap;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> songMap = new HashMap<String, String>();

        songMap.put("Song: Only Human", "Lyrics: Somebody's gonna hurt your feelings Some lovers gonna break your heart Tear it into a million pieces Sometimes, some things fall apart Not everyday is gonna be easy You might collect some scars But that's all part of being human");

        songMap.put("Song: cult leader", "Lyrics: I might be the villain In somebody else's story But that's fine My methods are controversial But at least it keeps them all in line In line I don't need your roses, I like men on their knees Praying up to their god, seeing visions of me");

        songMap.put("Song: Sanctuary", "Lyrics: Go ahead and park after dark Fallen star, I'm your one call away Motel halls, neon walls When night falls, I am your escape When you lay alone, I ache Something I wanted to feel");

        songMap.put("Song: Lose", "Lyrics: I'm gon' need therapy 'Cause you're not here with me Light me up like amphetamines, yeah (yeah, yeah, yeah) I don't do guarantees");

        // get the keys by using the keySet method
        Set<String> keys = songMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(songMap.get(key));    
        }
    }
}

