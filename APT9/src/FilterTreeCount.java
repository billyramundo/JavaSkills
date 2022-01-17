public class FilterTreeCount {
    public int count(TreeNode tree, int low, int high) {
        int count = 0;
        if(tree == null) return 0;
        if(tree.info <= high && tree.info >= low){
            count ++;
        }
        count +=count(tree.left, low, high);
        count +=count(tree.right, low, high);
        return count;
    }
}
