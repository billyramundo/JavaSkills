public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        int maxCount = 0;
        String ret = "";
        for (int k = 0; k < strands.length; k +=1){
            int uCount = 0;
            for(int j = 0; j < strands[k].length(); j += 1){
                if(strands[k].substring(j, j+1).equals(nuc)){
                    uCount++;
                }

            }
            if (uCount > maxCount){
                maxCount = uCount;
                ret = strands[k];

            }
            else if (uCount == maxCount && strands[k].length() > ret.length()){
                ret = strands[k];
            }
        }
        if (maxCount == 0)
            return "";
        return ret;
    }
}
