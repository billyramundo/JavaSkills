import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortedList {
    public ListNode create(String[] words) {
        Map<String, Integer> myMap = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            myMap.put(words[i], i);
        }
        Arrays.sort(words);
        ListNode ret = new ListNode(myMap.get(words[0]));
        ListNode ret2 = ret;
        for(int i = 1; i < words.length; i++){
            ret.next = new ListNode(myMap.get(words[i]));
            ret = ret.next;
        }
        return ret2;
    }
}
