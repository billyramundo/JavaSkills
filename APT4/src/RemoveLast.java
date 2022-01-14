public class RemoveLast {
    public ListNode remove(ListNode list) {
        ListNode ret = list;
        if(ret == null){
            return ret;
        }
        while(ret.next.next != null){
            ret = ret.next;
        }
        ret.next = null;
        return list;
    }
}
