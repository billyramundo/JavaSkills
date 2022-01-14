public class DoubleList {
    public ListNode bigify(ListNode list) {
        ListNode first = list;
        while(list!=null){
            ListNode insert = new ListNode(list.info);
            insert.next = list.next;
            list.next = insert;
            list = insert.next;
        }
        return first;
    }
}
