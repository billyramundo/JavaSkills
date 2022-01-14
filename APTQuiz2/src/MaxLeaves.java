import java.util.ArrayList;

public class MaxLeaves {
    ArrayList<Integer> list = new ArrayList<>();
    public int[] gather(TreeNode tree) {
        int height = height(tree);
        if(tree == null) return new int[0];
        if(tree.left == null && tree.right == null) list.add(tree.info);
        gather(tree.left);
        gather(tree.right);
        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ret[i] = list.get(i);
        }
        return ret;
    }
    public int height(TreeNode tree) {
        if (tree == null) return 0;
        return 1 + Math.max(height(tree.left), height(tree.right));
    }
}
