public class Anonymous {
    private int[] getCounts(String[] strings){
        int[] counts = new int[300];
        for(String s: strings){
            for(char ch : s.toLowerCase().toCharArray()){
                counts[ch] += 1;
            }
        }
        return counts;

    }
    public int howMany(String[] headlines, String[] messages) {
        for(int k = 0; k < messages.length; k++){
            int messCount = 0;
            for (char ch : messages[k].toLowerCase().toCharArray()){

            }
        }
        return 0;
        }



}
