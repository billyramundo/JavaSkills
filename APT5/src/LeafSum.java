public class LeafSum {
    public int sum(TreeNode t) {
        int ret = 0;
        if(t == null) return 0;
        if(t.left == null && t.right == null){
            ret += t.info;
        }
        return ret + sum(t.left) + sum(t.right);
    }
}
