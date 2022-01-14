import java.util.HashMap;

public class BSTcount {
    HashMap<Integer, Long> valMap = new HashMap<>();
    public long howMany(int[] values) {
        return calc(values.length);
    }
    private long calc(int num){
        if (num <= 1) return 1;
        if (valMap.containsKey(num)) return valMap.get(num);
        else {
            long sum = 0;
            for (int i = 1; i <= sum; i++) {
                long left = calc(i - 1);
                long right = calc(num - i);
                long total = left * right;
                sum += total;
            }
            valMap.put(num, sum);
            return sum;
        }

    }
}
