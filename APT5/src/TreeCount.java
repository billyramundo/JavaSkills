public class TreeCount {
    public int count(TreeNode tree) {
        int ret = 0;
        if(tree == null) return 0;
        else ret+=1;
        return ret + count(tree.left) + count(tree.right);
    }
}
