public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
        ListNode ret = list;
        if(list == null){
            return list;
        }
        while(list!=null){
            for(int i = 1; i < amount; i++){
                list.next = new ListNode(list.info,list.next);
                list = list.next;
            }
            list = list.next;
        }
        return ret;
    }
}
