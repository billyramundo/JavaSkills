import java.util.HashSet;

public class Infrequent {
    public String find(String[] phrases){
        String sentString = String.join(" ", phrases);
        String[] sentArray = sentString.toLowerCase().split(" ");
        HashSet<String> sentSet = new HashSet<>();
        for(String s : sentArray){
            sentSet.add(s.toLowerCase());
        }
        String[] array = new String[sentSet.size()];
        sentSet.toArray(array);
        int minCount = 100000;
        String ret = "";
        for(int k = 0; k < array.length; k++){
            int count = 0;
            for(int j = 0;j < sentArray.length; j++){
                if (sentArray[j].equals(array[k])){
                    count += 1;
                }
            }
            if(count < minCount){
                minCount = count;
                ret = array[k];
            }
        }
        return ret;

    }
}
