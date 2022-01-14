import java.util.Arrays;
import java.util.HashSet;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        HashSet<String> uPlayer = new HashSet<>(Arrays.asList(player));
        HashSet<String> dictSet = new HashSet<>(Arrays.asList(dictionary));
        uPlayer.retainAll(dictSet);
        int count = 0;
        String[] remembered = uPlayer.toArray(new String[0]);
        for(int k = 0; k < remembered.length; k++){
            int added = remembered[k].length() * remembered[k].length();
            count += added;
        }
        return count;

    }

}
