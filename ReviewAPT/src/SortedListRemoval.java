import java.util.ArrayList;

public class SortedListRemoval {
    public ListNode uniqify(ListNode list){
        ArrayList<Integer> uList = new ArrayList<>();
        while(list != null){
            if(!uList.contains(list.info)){
                uList.add(list.info);
            }
            list = list.next;
        }
        if(uList.size() != 0) {
            ListNode ret = new ListNode(uList.get(0));
            ListNode ret2 = ret;
            for (int i = 1; i < uList.size(); i++) {
                ret.next = new ListNode(uList.get(i));
                ret = ret.next;
            }
            return ret2;
        }
        else return null;
    }
}
