import java.util.ArrayList;

public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();
        ListNode b2 = b;
        ListNode a2 = a;
        while(a != null){
            aList.add(a.info);
            a = a.next;
        }
        while(b!= null){
            bList.add(b.info);
            b = b.next;
        }
        if(aList.size() == 0) return b2;
        else if(bList.size() == 0) return a2;
        else{
            ListNode ret = new ListNode(aList.get(0));
            ListNode ret2 = ret;
            ret.next = new ListNode(bList.get(0));
            ret = ret.next;
            for(int i =1; i < aList.size();i++){
                ret.next = new ListNode(aList.get(i));
                ret = ret.next;
                ret.next = new ListNode(bList.get(i));
                ret = ret.next;
            }
            return ret2;
        }
    }
}
