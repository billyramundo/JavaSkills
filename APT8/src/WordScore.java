import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class WordScore {
    public int[] score(String[] words, String want, String avoid) {
        int[] ret = new int[words.length];
        String[] wArray = want.split("");
        String[] aArray = avoid.split("");
        for(int k = 0; k < words.length; k++){
            int wCount = 0;
            int aCount = 0;
            String[] wordArr = words[k].split("");
            for(String letter: wordArr){
                int idxW = want.indexOf(letter);
                int idxA = avoid.indexOf(letter);
                if (idxW >= 0) {
                    wCount ++;
                }
                if (idxA >= 0) {
                    aCount ++;
                }

            }
            int add = wCount - aCount;
            ret[k] += add;
        }
        return ret;
    }
}
