import java.util.ArrayList;
import java.util.Arrays;

public class AllPaths {
    ArrayList<String> pList = new ArrayList<>();
    public String[] paths(TreeNode t) {
        helpPaths(t, "");
        String[] ret = pList.toArray(new String[pList.size()]);
        Arrays.sort(ret);
        return ret;
    }

    private void helpPaths(TreeNode t, String path){
        if(t == null) return;
        if(t.left == null && t.right == null){
            path += t.info;
            pList.add(path);
        }
        path += t.info + "->";
        helpPaths(t.left, path);
        helpPaths(t.right, path);
    }
}
