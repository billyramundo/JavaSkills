import java.util.TreeMap;

public class SortedLeaves {
    TreeMap<Integer, String> myMap = new TreeMap<>();
    TreeMap<Integer, String> lMap = new TreeMap<>();
    public String[] values(TreeNode tree) {
        String[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        int match = 65;
        for(int i = 0; i < letters.length; i++){
            myMap.put(match, letters[i]);
            match++;
        }
        helper(tree);
        String[] ret = lMap.values().toArray(new String[lMap.size()]);
        return ret;
    }

    private void helper(TreeNode tree){
        if(tree == null) return;
        if(tree.left == null && tree.right == null) lMap.put(tree.info, myMap.get(tree.info));
        helper(tree.left);
        helper(tree.right);
    }
}
