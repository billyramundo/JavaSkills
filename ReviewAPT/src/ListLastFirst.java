public class ListLastFirst {
    public ListNode move(ListNode list) {
        if(list == null) return null;
        if(list.next == null) return list;
        ListNode list2 = list;
        ListNode list3 = list;
        while(list.next != null){
            list = list.next;
        }
        int last = list.info;
        while(list2.next.next != null){
            list2 = list2.next;
        }
        list2.next = null;
        ListNode ret = new ListNode(last);
        ret.next = list3;

        return ret;
    }
}
