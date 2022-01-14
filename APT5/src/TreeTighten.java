public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if(t==null) return null;
        if(t.right==null && t.left == null){
            return t;
        }
        if(t.left==null && t.right!=null){
            return tighten(t.right);
        }
        if(t.right == null && t.left!=null){
            return tighten(t.left);
        }
        return new TreeNode(t.info, tighten(t.left), tighten(t.right));
    }
}
