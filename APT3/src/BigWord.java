import java.util.Collections;
import java.util.HashSet;

public class BigWord {
    public String most(String[] sentences) {
        String sentString = String.join(" ", sentences);
        String[] sentArray = sentString.toLowerCase().split(" ");
        HashSet<String> sentSet = new HashSet<>();
        for(String s : sentArray){
            sentSet.add(s.toLowerCase());
        }
        String[] array = new String[sentSet.size()];
        sentSet.toArray(array);
        int maxCount = 0;
        String ret = "";
        for(int k = 0; k < array.length; k++){
            int count = 0;
            for(int j = 0;j < sentArray.length; j++){
                if (sentArray[j].equals(array[k])){
                    count += 1;
                }
            }
            if(count > maxCount){
                maxCount = count;
                ret = array[k];
            }
        }
        return ret;
    }
}
