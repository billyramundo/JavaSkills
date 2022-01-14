import java.util.*;

public class FriendScore {
    public int highestScore(String[] friends) {
        Map<Integer, HashSet<Integer>> scoreMap = new HashMap<>();
        for(int i=0; i<friends.length; i++){
            scoreMap.put(i, new HashSet<Integer>());
            for(int k=0; k < friends[i].length();k++){
                if(friends[i].charAt(k) == 'Y') scoreMap.get(i).add(k);
                for(int j = 0; j < friends.length; j++){
                    if(i!=k && friends[i].charAt(j) == 'Y' && friends[k].charAt(j) == 'Y') scoreMap.get(i).add(k);
                }
            }
        }
        int high = 0;
        for(Integer friend : scoreMap.keySet()){
            if(scoreMap.get(friend).size() > high) high = scoreMap.get(friend).size();
        }
        return high;
    }
}
