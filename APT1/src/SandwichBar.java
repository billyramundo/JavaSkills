import java.util.Arrays;
import java.util.HashSet;

public class SandwichBar {
    public boolean canMake(String[] avail, String order) {
        String[] ingred = order.split(" ");
        HashSet<String> ingredSet = new HashSet<>(Arrays.asList(ingred));
        HashSet<String> availSet = new HashSet<>(Arrays.asList(avail));
        if (availSet.containsAll(ingredSet)){
            return true;
        }
        return false;
    }
    public int whichOrder(String[] available, String[] orders){
        for (int k=0; k < orders.length; k++){
            if (canMake(available, orders[k])){
                return k;
            }

        }
        return -1;
    }
}
