import java.util.ArrayList;


public class StringCuts {
    static String[] filter(String[] list, int minLength) {
        ArrayList<String> ret = new ArrayList<>();
        for (String s : list) {
            if (s.length() >= minLength && !ret.contains(s)) {
                ret.add(s);
            }
        }

        return ret.toArray(new String[0]);
    }
    public static void main(String[] args){
        String[] lst = {"cat", "rabbittynbvfjs", "poopdescooop", "catterbatter"};
        String[] value = filter( lst, 3);
        System.out.println(value);
    }
}
