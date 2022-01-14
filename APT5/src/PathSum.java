public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if(tree == null) return 0;
        if(tree.left == null && tree.right == null && tree.info == target) return 1;
        int leftCall = hasPath(target-tree.info, tree.left);
        int rightCall = hasPath(target-tree.info, tree.right);
        if(rightCall == 1 || leftCall == 1) return 1;
        else return 0;
    }
}
