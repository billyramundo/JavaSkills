import java.util.ArrayList;
import java.util.Collections;


public class AllPaths {
    ArrayList<String> ret = new ArrayList<>();
    public String[] paths(TreeNode t) {
        if(t == null) return new String[0];
        makePaths(t, "");
        Collections.sort(ret);
        String[] retArr = ret.toArray(new String[0]);
        return retArr;
    }
    public void makePaths(TreeNode node, String path){
        if(node == null) return;
        if(node.left == null && node.right == null){
            path += node.info;
            ret.add(path);
        }
        path += node.info + "->";
        makePaths(node.left, path);
        makePaths(node.right, path);
    }
}
