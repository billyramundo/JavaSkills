import java.util.Arrays;
import java.util.TreeSet;

public class SetAside {
    public String common(String[] list) {
        TreeSet<String> set = new TreeSet<>();
        set.addAll(Arrays.asList(list[0].split(" ")));
        for (int k=1; k < list.length; k++){
            set.retainAll(Arrays.asList(list[k].split(" ")));
        }
        return String.join(" ", set);
    }
}
