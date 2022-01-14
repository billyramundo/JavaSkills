import java.util.ArrayList;
import java.util.TreeSet;

public class AlphaLength {
    public ListNode create (String[] words) {
        TreeSet<String> aSet = new TreeSet<>();
        for(String word : words){
            aSet.add(word);
        }
        ArrayList<Integer> aList = new ArrayList<>();
        for(String word : aSet) aList.add(word.length());
        ListNode alpha = new ListNode(aList.get(0));
        ListNode ret = alpha;
        for(int i = 1; i < aList.size();i++){
            alpha.next = new ListNode(aList.get(i));
            alpha = alpha.next;

        }
        return ret;
    }
}
