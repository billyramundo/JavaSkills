import java.util.*;

public class SpreadingNews {
    private ArrayList<ArrayList<Integer>> subors;
    private int[] supers;

    public int calc(int topIdx) {
        ArrayList<Integer> callTimes = new ArrayList<>();
        for (int n : subors.get(topIdx)) {
            callTimes.add(calc(n));
        }
        Collections.sort(callTimes, Collections.reverseOrder());
        int start = 0;
        for (int i = 0; i < callTimes.size(); i++) {
            start = Math.max(start, i + 1 + callTimes.get(i));
        }
        return start;
    }
    public int minTime(int[] supervisors) {
        supers = supervisors;
        subors = new ArrayList<>();
        for (int k = 0; k < supervisors.length; k++) {
            subors.add(new ArrayList<Integer>());
        }
        for (int k = 0; k < supervisors.length; k++)
            if (supers[k] != -1)
                subors.get(supers[k]).add(Integer.valueOf(k));
        return calc(0);
    }
}
