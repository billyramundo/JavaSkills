import java.util.Arrays;

public class VoteRigging {
    private int rig(int me, int top, int[] comps) {
        if (me <= comps[comps.length - 1]) {
            me = me + 1;
            comps[comps.length -1] = comps[comps.length -1] -1;
            Arrays.sort(comps);
            return rig(me, top+1, comps);
        }
        else {
            return top;
        }
    }
    public int minimumVotes(int[] votes) {
        if (votes.length <= 1) {
            return 0;
        }
        int mine = votes[0];
        int[] comps = Arrays.copyOfRange(votes, 1, votes.length);
        Arrays.sort(comps);
        int needed = rig(mine, 0, comps);

        return needed;
    }

}
