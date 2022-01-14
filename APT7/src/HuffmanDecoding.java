import java.util.HashMap;
import java.util.Map;

public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Map<String, Character> myMap = new HashMap<>();
        for (int i=0; i<dictionary.length; i++) {
            myMap.put(dictionary[i], letters[i]);
        }
        String code = "";
        int a = 0;
        int b = 0;
        for (int i=0; i<archive.length(); i++) {
            if (myMap.containsKey(archive.substring(a, b+1))) {
                code += myMap.get(archive.substring(a, b+1));
                a = b +1;
                b= a;
            }
            else {
                b +=1;
            }
        }
        return code;
    }
}
