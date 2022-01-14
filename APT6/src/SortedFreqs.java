import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        Map<String, Integer> myMap = new TreeMap<>();
        for(String s : data){
            myMap.putIfAbsent(s, 0);
            myMap.put(s, myMap.get(s)+1);
        }
        Integer[] values = myMap.values().toArray(new Integer[0]);
        int[] ret = new int[values.length];
        for(int i =0; i<values.length;i++){
            ret[i]=values[i];
        }
        return ret;
    }
}
