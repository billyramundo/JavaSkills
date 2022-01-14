import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OlympicCandles {
    public int numberOfNights(int[] candles){
        int maxN = candles.length;
        for(int i = 0; i < maxN; i++){
            Arrays.sort(candles);
            int numBurn = i+1;
            for(int k =0; k < numBurn; k++){
                if(candles[maxN -1 - k] == 0) return numBurn - 1;
                candles[maxN - 1 - k] -= 1;
            }

        }
        return maxN;
    }
}
