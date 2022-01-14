import java.util.*;

public class ErdosNumber {
    public String[] calculateNumbers(String[] pubs) {
        Map<String, HashSet<String>> myMap = new HashMap<>();
        for(int i =0; i < pubs.length; i++){
            String[] people = pubs[i].split(" ");
            for(int k = 0; k < people.length; k++){
                myMap.putIfAbsent(people[k], new HashSet<String>());
                for(String peep : people){
                    if(!peep.equals(people[k])) myMap.get(people[k]).add(peep);
                }
            }
        }
        Map<String, Integer> dMap = new HashMap<>();
        dMap.put("ERDOS", 0);
        LinkedList<String> qList = new LinkedList<>();
        HashSet<String> visits  = new HashSet<>();
        qList.add("ERDOS");
        while(!qList.isEmpty()){
            String now = qList.pop();
            if(!visits.contains(now)){
                visits.add(now);
                for(String partner : myMap.get(now)){
                    dMap.putIfAbsent(partner, dMap.get(now) +1);
                    qList.add(partner);
                    }
                }
            }
        String[] peeps = new String[myMap.size()];
        myMap.keySet().toArray(peeps);
        String[] ret = new String[peeps.length];
        for(int i = 0; i <ret.length;i++) {
            if (dMap.get(peeps[i]) == null) ret[i] = peeps[i];
            else ret[i] = peeps[i] + " " + dMap.get(peeps[i]);
        }
        Arrays.sort(ret);
        return ret;
        }

    }

