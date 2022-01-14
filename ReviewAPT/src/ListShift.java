import java.util.ArrayList;

public class ListShift {
    public ListNode shift(ListNode start, int key) {
        ArrayList<Integer> bigs = new ArrayList<>();
        ArrayList<Integer> smalls = new ArrayList<>();
        ListNode copy = start;
        while(start != null){
            if(start.info > key){
                bigs.add(start.info);
            }
            if(start.info <= key) smalls.add(start.info);
            start = start.next;
        }
        if(bigs.size() != 0) {
            ListNode ret = new ListNode(bigs.get(0));
            ListNode ret2 = ret;
            for (int i = 1; i < bigs.size(); i++) {
                ret.next = new ListNode(bigs.get(i));
                ret = ret.next;
            }
            for (int i = 0; i < smalls.size(); i++) {
                ret.next = new ListNode(smalls.get(i));
                ret = ret.next;
            }
            return ret2;
        }
        else return copy;
    }
}
