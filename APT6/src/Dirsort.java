import java.util.*;

public class Dirsort {
    public class Comparison implements Comparator<String> {

        @Override
        public int compare(String t, String o) {
            String[] arr1 = t.split("/");
            String[] arr2 = o.split("/");

            if (arr1.length < arr2.length)
                return -1;
            else if (arr1.length > arr2.length)
                return 1;
            else {
                for (int i = 0; i < arr1.length; i++) {
                    int rel = arr1[i].compareTo(arr2[i]);
                    if (rel != 0)
                        return rel;
                }
            }
            return 0;
        }

    }
    public String[] sort(String[] dirs) {
        Arrays.sort(dirs, new Comparison());
        return dirs;
    }

}
