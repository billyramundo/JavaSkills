import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MedalTable {

    private class Country implements Comparable<Country>{

        public String name;
        public int gold;
        public int silver;
        public int bronze;

        public Country(String name) {
            this.name = name;
        }

        public int compareTo(Country other) {
            if (this.gold != other.gold) return this.gold > other.gold ? -2 : 2;
            if (this.silver != other.silver) return this.silver > other.silver ? -2: 2;
            if (this.bronze != other.bronze) return this.bronze > other.bronze ? -2 : 2;
            return this.name.compareTo(other.name);
        }

        public String getTable() {
            return String.format("%s %d %d %d", name, gold, silver, bronze);
        }
    }

    public String[] generate(String[] results) {
        Map<String, Country> tableMap = new HashMap<String, Country>();

        for (int i = 0; i < results.length; i++) {
            String[] awards = results[i].split(" ");
            assert awards.length == 3;
            for (int k = 0; k < awards.length; k++) {
                Country current = tableMap.get(awards[k]);
                if (current == null) {
                    current = new Country(awards[k]);
                    tableMap.put(current.name, current);
                }
                switch (k) {
                    case 0: current.gold++; break;
                    case 1: current.silver++; break;
                    case 2: current.bronze++; break;
                }
            }
        }

        List<Country> winnings = new ArrayList<Country>(tableMap.values());
        Collections.sort(winnings);

        String[] ret = new String[winnings.size()];
        for (int i = 0; i < ret.length; i++) ret[i] = winnings.get(i).getTable();
        return ret;
    }

}
