import java.util.ArrayList;
import java.util.HashSet;

public class Misspelled {
    public int howMany(String[] words, String[] dictionary) {
        ArrayList<String> wordSet = new ArrayList<>();
        ArrayList<String> dictSet = new ArrayList<>();
        for(int k = 0; k < words.length; k++){
            wordSet.add(words[k]);
        }
        for(int k = 0; k < dictionary.length; k++){
            dictSet.add(dictionary[k]);
        }
        dictSet.retainAll(wordSet);
        int ret = words.length - dictSet.size();
        return ret;
    }
}
