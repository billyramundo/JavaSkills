import java.util.TreeMap;

public class LeafTrails {
    TreeMap<Integer, String> myMap = new TreeMap<>();
    public String[] trails(TreeNode tree) {
        helper(tree, "");
        String[] ret = myMap.values().toArray(new String[myMap.size()]);
        return ret;
    }

    private void helper(TreeNode tree, String path){
        if(tree == null) return;
        if(tree.right == null && tree.left == null){
            myMap.put(tree.info, path);
        }
        helper(tree.left, path + "0");
        helper(tree.right, path + "1");
    }
}
