import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FindPath {
    ArrayList<String> paths = new ArrayList<>();
    public String path(TreeNode root, int target) {
        findPath(root, target, "");
        Collections.sort(paths);
        Collections.sort(paths, Comparator.comparing(String::length));
        if(paths.size() == 0) return "nopath";
        else return paths.get(0);
    }

    private void findPath(TreeNode tree, int tar, String path){
        if(tree == null) return;
        if(tree.info == tar) paths.add(path);
        findPath(tree.left, tar, path + "0");
        findPath(tree.right, tar, path + "1");
    }
}
