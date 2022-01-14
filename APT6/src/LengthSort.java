import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LengthSort {
    public String[] rearrange(String[] values){
        Arrays.sort(values);
        ArrayList<String> valList = new ArrayList<>(Arrays.asList(values));
        Collections.sort(valList, Comparator.comparing(String::length));
        String[] ret = valList.toArray(new String[0]);
        return ret;
    }
}


