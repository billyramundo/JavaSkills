import java.util.*;

public class SortByFreqs {
    public class Entry implements Comparable<Entry> {
        String word;
        int freq;
        public Entry(String thing, int num) {
            word = thing;
            freq = num;
        }
        public String getWord() {
            return word;
        }
        public int getFreq() {

            return freq;
        }
        public int compareTo(Entry other) {
            if (this.getFreq() > other.getFreq())
                return -1;
            if (this.getFreq() < other.getFreq())
                return 1;
            return this.getWord().compareTo(other.getWord());
        }

    }
    public String[] sort(String[] data) {
        Map <String, Integer> myMap = new HashMap<>();
        for (String s : data) {
            if (! myMap.containsKey(s))
                myMap.put(s, 0);
            myMap.put(s, 1 + myMap.get(s));
        }

        Entry[] eArr = new Entry[myMap.size()];

        int iter1 = 0;
        for (String k : myMap.keySet()) {
            eArr[iter1] = new Entry(k, myMap.get(k));
            iter1 += 1;
        }
        Arrays.sort(eArr);
        String[]ret = new String[myMap.size()];
        int iter2 = 0;
        for (Entry e : eArr) {
            ret[iter2] = e.getWord();
            iter2 += 1;
        }
        return ret;
    }

}