import java.util.ArrayList;
import java.util.Collections;

public class UniqueTreeValues {
    ArrayList<Integer> list = new ArrayList<>();
    public int[] unique(TreeNode root) {
        if(root == null) return new int[0];
        if(!list.contains(root.info)){
            list.add(root.info);
        }
        unique(root.right);
        unique(root.left);
        Collections.sort(list);
        int[] retArr = new int[list.size()];
        for(int i =0; i<retArr.length;i++){
            retArr[i] = list.get(i).intValue();
        }
        return retArr;
    }
}


