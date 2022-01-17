import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Conflicts {
    public String[] conflict(String[] info){
        Map<String, String> dict = new HashMap<>();
        ArrayList<String> twoList = new ArrayList<>();
        ArrayList<String> ret = new ArrayList<>();
        for(int k = 0; k<info.length; k++){
            String[] iArr = info[k].split(":");
            twoList.add(iArr[2]);
            dict.putIfAbsent(iArr[2], iArr[3]);
        }
        ArrayList<String> twoList2 = new ArrayList<>(twoList);
        String[] twoArr = new String[twoList.size()];
        twoArr = twoList.toArray(twoArr);
        for(int k=0; k<twoArr.length; k++){
            int freq = Collections.frequency(twoList2, twoArr[k]);
            if(freq > 1){
                ret.add(twoArr[k]);
            }
        }
        String[] ret2 = new String[ret.size()];
        ret2 = ret.toArray(ret2);
        return ret2;
    }
}
