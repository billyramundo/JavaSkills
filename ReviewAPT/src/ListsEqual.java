import java.util.ArrayList;

public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        ArrayList<Integer> a1List = new ArrayList<>();
        ArrayList<Integer> a2List = new ArrayList<>();
        while(a1 != null){
            a1List.add(a1.info);
            a1 = a1.next;
        }
        while(a2 != null){
            a2List.add(a2.info);
            a2 = a2.next;
        }
        if(a1List.size() != a2List.size()) return 0;
        for(int i =0; i < a1List.size(); i++){
            if(a1List.get(i) != a2List.get(i)) return 0;
        }
        return 1;
    }
}
