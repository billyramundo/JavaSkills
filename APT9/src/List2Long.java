public class List2Long {
    public long convert(ListNode list) {
        ListNode ret = list;
        ListNode ret2 = list;
        long lret = list.info;
        list = list.next;
        while(list != null){
            lret = lret * 10 + list.info;
            list = list.next;
        }
        return lret;
    }
}
