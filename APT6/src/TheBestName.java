import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TheBestName {
    public String[] sort(String[] names) {
        Arrays.sort(names);
        Name[] arr = new Name[names.length];
        for(int i=0; i<names.length;i++){
            arr[i] = new Name(names[i]);
        }
        Comparator comp = Comparator.comparing(Name::getCount).reversed().thenComparing(Name::getName);
        Arrays.sort(arr, comp);
        String[] ret = new String[arr.length];
        for(int i = 0; i<arr.length;i++){
            ret[i] = arr[i].getName();
        }
        return ret;
    }
    public class Name {
        String name;
        int count;
        public Name(String person){
            name = person;

        }
        public String getName(){
            return name;
        }
        public int getCount() {
            count = 0;
            for (int i = 0; i < name.toCharArray().length; i++) {
                count += name.toCharArray()[i];

            }
            return count;
        }

    }
}
