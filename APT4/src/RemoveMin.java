public class RemoveMin {
    public ListNode remove (ListNode list) {
        int min = 10000;
        ListNode remove = list;
        ListNode ret = list;
        ListNode ret2 = list;

        while (list!= null) {
            if (list.info < min) {
                min = list.info;
            }
            list = list.next;
        }
        if(remove.info == min){
            return remove.next;
        }

        while(remove.next != null){
            if(remove.next.next == null){
                if(remove.next.info == min){
                    remove.next = null;
                    return ret;
                }
            }
            if(remove.next.info == min) {
                remove.next = remove.next.next;
            }
            remove = remove.next;


        }

        return ret2;
    }
}
